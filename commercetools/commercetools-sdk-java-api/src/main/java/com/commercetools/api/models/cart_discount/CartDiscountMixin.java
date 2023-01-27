
package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface CartDiscountMixin extends Referencable<CartDiscount>, ResourceIdentifiable<CartDiscount> {
    @Override
    public default CartDiscountResourceIdentifier toResourceIdentifier() {
        return CartDiscountResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CartDiscountReference toReference() {
        return CartDiscountReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.CART_DISCOUNT;
    }

}
