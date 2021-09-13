
package io.vrap.rmf.base.client.utils.json;

import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import java.util.ServiceLoader;

/**
 * Interface to supply a Jackson module specified by a {@link ServiceLoader}
 */
public interface ModuleSupplier {
    SimpleModule getModule(final ModuleOptions options);
}
