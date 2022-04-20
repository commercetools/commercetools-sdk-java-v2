
package com.commercetools.importapi.json;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.ModuleSupplier;
import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ImportApiModuleSupplier implements ModuleSupplier {
    @Override
    public SimpleModule getModule(ModuleOptions options) {
        return new ImportApiModule(options);
    }
}
