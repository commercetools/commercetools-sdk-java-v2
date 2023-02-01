
package com.commercetools.api.models.store;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface StoreMixin extends Referencable<Store>, ResourceIdentifiable<Store> {
    @Override
    public default StoreResourceIdentifier toResourceIdentifier() {
        return StoreResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default StoreReference toReference() {
        return StoreReference.builder().id(getId()).build();
    }
}
