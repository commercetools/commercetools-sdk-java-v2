
package com.commercetools.api.json;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.ModuleSupplier;
import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public class ApiModuleSupplier implements ModuleSupplier {
    @Override
    public SimpleModule getModule(ModuleOptions options) {
        return new ApiModule(options);
    }
}
