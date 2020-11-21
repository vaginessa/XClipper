﻿using System;

#nullable enable
namespace Components
{
    public interface IUpdater
    {
        /// <summary>
        /// This method will check for update and will run the method.
        /// </summary>
        /// <param name="block"></param>
        void Check(Action<bool, ReleaseItem?>? block);

        /// <summary>
        /// This will launch the website for manually downloading update.
        /// </summary>
        void Launch();
    }
}
