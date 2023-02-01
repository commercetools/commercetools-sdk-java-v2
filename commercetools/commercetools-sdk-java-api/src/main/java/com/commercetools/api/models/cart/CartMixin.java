
package com.commercetools.api.models.cart;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface CartMixin extends Referencable<Cart>, ResourceIdentifiable<Cart> {
    @Override
    default CartResourceIdentifier toResourceIdentifier() {
        return CartResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    default CartReference toReference() {
        return CartReference.builder().id(getId()).build();
    }

}
