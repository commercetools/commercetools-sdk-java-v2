
package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface StandalonePriceMixin extends Referencable<StandalonePrice>, ResourceIdentifiable<StandalonePrice> {
    @Override
    public default StandalonePriceResourceIdentifier toResourceIdentifier() {
        return StandalonePriceResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default StandalonePriceReference toReference() {
        return StandalonePriceReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.STANDALONE_PRICE;
    }
}
