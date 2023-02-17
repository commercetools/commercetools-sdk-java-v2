
package com.commercetools.api.models.type;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface TypeMixin extends Referencable<Type>, ResourceIdentifiable<Type> {
    public List<FieldDefinition> getFieldDefinitions();

    default FieldDefinition getFieldDefinitionByName(final String name) {
        return getFieldDefinitions().stream().filter(def -> def.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public default TypeResourceIdentifier toResourceIdentifier() {
        return TypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default TypeReference toReference() {
        return TypeReference.builder().id(getId()).build();
    }
}
