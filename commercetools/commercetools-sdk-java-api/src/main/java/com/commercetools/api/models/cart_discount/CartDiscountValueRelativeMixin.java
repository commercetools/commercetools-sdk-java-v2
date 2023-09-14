
package com.commercetools.api.models.cart_discount;

public interface CartDiscountValueRelativeMixin extends GenericCartDiscountValueMixin<CartDiscountValueRelativeDraft> {
    public Long getPermyriad();

    @Override
    default CartDiscountValueRelativeDraft toDraft() {
        return toDraftBuilder().build();
    }

    @Override
    default CartDiscountValueRelativeDraftBuilder toDraftBuilder() {
        return CartDiscountValueRelativeDraft.builder().permyriad(this.getPermyriad());
    }
}
