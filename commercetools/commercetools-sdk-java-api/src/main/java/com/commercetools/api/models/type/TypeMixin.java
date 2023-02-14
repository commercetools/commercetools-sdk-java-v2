
package com.commercetools.api.models.type;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

import javax.annotation.Nullable;
import java.util.List;

public interface TypeMixin extends Referencable<Type>, ResourceIdentifiable<Type> {
    List<FieldDefinition> getFieldDefinitions();

    @Override
    public default TypeResourceIdentifier toResourceIdentifier() {
        return TypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default TypeReference toReference() {
        return TypeReference.builder().id(getId()).build();
    }

    @javax.annotation.Nullable
    default FieldDefinition getFieldDefinitionByName(final String name) {
        return getFieldDefinitions().stream().filter(def -> def.getName().equals(name)).findFirst().orElse(null);
    }
}
