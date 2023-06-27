
package com.commercetools.api.models.cart_discount;

public interface CartDiscountValueMixin {
    default CartDiscountValueDraft toDraft() {
        if (this instanceof CartDiscountValueAbsolute) {
            return ((CartDiscountValueAbsolute) this).toDraft();
        }
        if (this instanceof CartDiscountValueFixed) {
            return ((CartDiscountValueFixed) this).toDraft();
        }
        if (this instanceof CartDiscountValueRelative) {
            return ((CartDiscountValueRelative) this).toDraft();
        }
        if (this instanceof CartDiscountValueGiftLineItem) {
            return ((CartDiscountValueGiftLineItem) this).toDraft();
        }
        throw new IllegalArgumentException("can't convert cart discount to draft");
    }
}
