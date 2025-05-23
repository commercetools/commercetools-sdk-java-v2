
package com.commercetools.api;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public interface SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options);
}
