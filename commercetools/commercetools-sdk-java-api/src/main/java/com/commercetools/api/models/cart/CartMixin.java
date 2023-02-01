
package com.commercetools.api.models.cart;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface CartMixin extends Referencable<Cart>, ResourceIdentifiable<Cart> {
    static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.CART;
    }

    @Override
    default CartResourceIdentifier toResourceIdentifier() {
        return CartResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    default CartReference toReference() {
        return CartReference.builder().id(getId()).build();
    }

}
