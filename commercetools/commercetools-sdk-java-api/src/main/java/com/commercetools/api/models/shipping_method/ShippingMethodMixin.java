
package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ShippingMethodMixin extends Referencable<ShippingMethod>, ResourceIdentifiable<ShippingMethod> {
    @Override
    public default ShippingMethodResourceIdentifier toResourceIdentifier() {
        return ShippingMethodResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ShippingMethodReference toReference() {
        return ShippingMethodReference.builder().id(getId()).build();
    }
}
