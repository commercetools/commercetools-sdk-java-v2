
package com.commercetools.api.models.type;

import com.commercetools.api.models.common.Reference;

public interface TypeReferenceMixin extends com.commercetools.api.models.Identifiable<Type>, Reference {
    @Override
    public default TypeResourceIdentifier toResourceIdentifier() {
        return TypeResourceIdentifier.builder().id(this.getId()).build();
    }
}
