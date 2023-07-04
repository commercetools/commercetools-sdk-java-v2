
package com.commercetools.api.models.cart_discount;

import io.vrap.rmf.base.client.Builder;

public interface GenericCartDiscountValueMixin<T extends CartDiscountValueDraft> extends CartDiscountValueMixin {
    T toDraft();

    Builder<T> toDraftBuilder();
}
