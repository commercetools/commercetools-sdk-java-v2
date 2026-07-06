
package com.commercetools.importapi.json;

import io.vrap.rmf.base.client.utils.json.ModuleSupplier;
import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

public class ImportApiModuleSupplier implements ModuleSupplier {
    @Override
    public SimpleModule getModule(ModuleOptions options) {
        return new ImportApiModule(options);
    }
}
