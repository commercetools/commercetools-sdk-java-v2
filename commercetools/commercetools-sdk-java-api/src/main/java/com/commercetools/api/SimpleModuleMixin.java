
package com.commercetools.api;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

public interface SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options);
}
