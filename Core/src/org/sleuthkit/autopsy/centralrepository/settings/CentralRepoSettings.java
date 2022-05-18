/*
 * Autopsy Forensic Browser
 *
 * Copyright 2022 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.centralrepository.settings;

import com.google.common.annotations.Beta;
import java.nio.file.Paths;
import org.sleuthkit.autopsy.coreutils.PlatformUtil;

/**
 * Location for central repo settings and paths.
 */
@Beta
public class CentralRepoSettings {

    private static final CentralRepoSettings instance = new CentralRepoSettings();

    /**
     * @return The singleton instance of this class.
     */
    public static CentralRepoSettings getInstance() {
        return instance;
    }

    private static final String CENTRAL_REPOSITORY_FOLDER = "CentralRepository";
    private static final String CENTRAL_REPOSITORY_SETTINGS_NAME = "CentralRepository";
    private static final String CENTRAL_REPO_BASE_PATH = Paths.get(PlatformUtil.getUserConfigDirectory(), CENTRAL_REPOSITORY_FOLDER).toString();
    private static final String DEFAULT_DB_PARENT_PATH = Paths.get(CENTRAL_REPO_BASE_PATH, "LocalDatabase").toString();
    private static final String DEFAULT_DB_NAME = "central_repository.db";
    private static final String MODULE_SETTINGS_KEY = Paths.get(CENTRAL_REPOSITORY_FOLDER, CENTRAL_REPOSITORY_SETTINGS_NAME).toString();
    private static final String MODULE_SETTINGS_PROPERTIES = Paths.get(CENTRAL_REPO_BASE_PATH, CENTRAL_REPOSITORY_SETTINGS_NAME + ".properties").toString();
    
    /**
     * @return The base path for central repository settings.
     */
    public String getSettingsBaseFolder() {
        return CENTRAL_REPO_BASE_PATH;
    }

    /**
     * @return The module settings key that places the settings file within
     *         getSettingsBaseFolder.
     */
    public String getModuleSettingsKey() {
        return MODULE_SETTINGS_KEY;
    }
    
    /**
     * @return The path to the central repo settings.
     */
    public String getModuleSettingsFile() {
        return MODULE_SETTINGS_PROPERTIES;
    }

    /**
     * @return The default database parent path for sqlite cr.
     */
    public String getDefaultDbPath() {
        return DEFAULT_DB_PARENT_PATH;
    }

    /**
     * @return The default sqlite database name.
     */
    public String getDefaultDbName() {
        return DEFAULT_DB_NAME;
    }
}
