package com.kpstv.xclipper.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kpstv.xclipper.data.localized.ToolbarState
import com.kpstv.xclipper.data.model.Clip

class MainStateManager {

    private val TAG = javaClass.simpleName

    private val _toolbarState: MutableLiveData<ToolbarState> =
        MutableLiveData(ToolbarState.NormalViewState)

    private val _selectedItemClips = MutableLiveData<ArrayList<Clip>>()
    private val _isMultiSelectionEnabled = MutableLiveData<Boolean>()

    private val _selectedItem = MutableLiveData<Clip>();

    val selectedItemClips: LiveData<ArrayList<Clip>>
        get() = _selectedItemClips

    val toolbarState: LiveData<ToolbarState>
        get() = _toolbarState

    val selectedItem: LiveData<Clip>
        get() = _selectedItem

    fun setToolbarState(state: ToolbarState) =
        _toolbarState.postValue(state)

    fun isMultiSelectionStateActive(): Boolean =
        _toolbarState.value == ToolbarState.MultiSelectionState

    val multiSelectionState: LiveData<Boolean>
        get() = _isMultiSelectionEnabled

    fun addOrRemoveClipFromSelectedList(clip: Clip) {
        var list = _selectedItemClips.value
        if (list == null)
            list = ArrayList()
        else {
            if (list.contains(clip)) {
                list.remove(clip)
            } else {
                list.add(clip)
            }
        }
        _selectedItemClips.postValue(list)
    }

    fun addOrRemoveSelectedItem(clip: Clip) {
        _selectedItem.value?.let {
            if (it == clip) {
                clearSelectedItem()
                return
            }
        }
        _selectedItem.postValue(clip)
    }

    fun clearSelectedItem() {
        _selectedItem.postValue(null)
    }

    fun addAllToSelectedList(clips: ArrayList<Clip>) {
        _selectedItemClips.postValue(clips)
    }

    fun clearSelectedList() {
        _selectedItemClips.postValue(ArrayList())
    }

    init {
        toolbarState.observeForever {
            if (it == ToolbarState.MultiSelectionState) {
                _isMultiSelectionEnabled.postValue(true)
            } else {
                _isMultiSelectionEnabled.postValue(false)
            }
        }
    }
}