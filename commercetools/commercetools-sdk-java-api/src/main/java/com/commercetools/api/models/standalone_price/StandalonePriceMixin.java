
package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface StandalonePriceMixin extends Referencable<StandalonePrice>, ResourceIdentifiable<StandalonePrice> {
    @Override
    public default StandalonePriceResourceIdentifier toResourceIdentifier() {
        return StandalonePriceResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default StandalonePriceReference toReference() {
        return StandalonePriceReference.builder().id(getId()).build();
    }
}
