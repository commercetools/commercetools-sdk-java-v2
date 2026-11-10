
package com.commercetools.api.json;

import io.vrap.rmf.base.client.utils.json.ModuleSupplier;
import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

public class ApiModuleSupplier implements ModuleSupplier {
    @Override
    public SimpleModule getModule(ModuleOptions options) {
        return new ApiModule(options);
    }
}
