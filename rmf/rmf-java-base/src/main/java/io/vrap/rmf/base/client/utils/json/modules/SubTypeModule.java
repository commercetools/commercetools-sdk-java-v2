
package io.vrap.rmf.base.client.utils.json.modules;

import java.util.Set;

import io.vrap.rmf.base.client.utils.json.SubType;

import org.reflections.Reflections;

import tools.jackson.databind.jsontype.NamedType;
import tools.jackson.databind.module.SimpleModule;

public class SubTypeModule extends SimpleModule {
    public SubTypeModule(final String prefix) {

        Reflections reflections = new Reflections(prefix);
        Set<Class<?>> subtypes = reflections.getTypesAnnotatedWith(SubType.class);

        for (Class<?> subType : subtypes) {
            SubType annotation = subType.getAnnotation(SubType.class);
            if (annotation != null) {
                String typeName = annotation.value();
                registerSubtypes(new NamedType(subType, typeName));
            }
        }
    }
}
