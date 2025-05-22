
package com.commercetools.api.json;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import org.reflections.Reflections;

/**
 * Module to configure the default jackson {@link com.fasterxml.jackson.databind.ObjectMapper} e.g. to deserialize attributes and custom fields
 */
public class ApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ApiModule(ModuleOptions options) {
        Reflections reflections = new Reflections("com.commercetools");
        Set<Class<?>> modules = reflections.getTypesAnnotatedWith(RegisterSimpleModuleMixin.class);

        for (Class<?> module : modules) {
            if (SimpleModuleMixin.class.isAssignableFrom(module)) {
                SimpleModuleMixin mixin;
                try {
                    mixin = module.asSubclass(SimpleModuleMixin.class).getDeclaredConstructor().newInstance();
                }
                catch (InstantiationException | IllegalAccessException | InvocationTargetException
                        | NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
                mixin.mixin(this, options);
            }
        }
    }
}
