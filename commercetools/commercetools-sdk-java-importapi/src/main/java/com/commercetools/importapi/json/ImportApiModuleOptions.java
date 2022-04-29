
package com.commercetools.importapi.json;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ImportApiModuleOptions implements ModuleOptions {
    private ImportApiModuleOptions() {
    }

    public static ImportApiModuleOptions of() {
        return new ImportApiModuleOptions();
    }

    @Override
    public String getOption(String name) {
        return null;
    }
}
