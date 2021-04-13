
package io.vrap.rmf.base.client.utils.json;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

public interface ModuleSupplier {
    SimpleModule getModule(final ModuleOptions options);
}
