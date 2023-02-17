
package com.commercetools.api.models.type;

import java.util.List;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

import javax.annotation.Nullable;
import java.util.List;

public interface TypeMixin extends Referencable<Type>, ResourceIdentifiable<Type> {
    @Override
    public default TypeResourceIdentifier toResourceIdentifier() {
        return TypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default TypeReference toReference() {
        return TypeReference.builder().id(getId()).build();
    }

}
