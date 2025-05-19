
package io.vrap.rmf.base.client.utils.json.modules;

import java.util.Set;

import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.SubType;

import org.reflections.Reflections;

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
