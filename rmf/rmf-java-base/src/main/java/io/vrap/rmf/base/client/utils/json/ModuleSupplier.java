
package io.vrap.rmf.base.client.utils.json;

import java.util.ServiceLoader;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

/**
 * Interface to supply a Jackson {@link SimpleModule} specified by a {@link ServiceLoader}
 */
public interface ModuleSupplier {
    SimpleModule getModule(final ModuleOptions options);
}
