
package com.commercetools.api.models.cart_discount;

import java.util.List;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.TypedMoney;

public interface CartDiscountValueFixedMixin extends GenericCartDiscountValueMixin<CartDiscountValueFixedDraft> {
    public List<TypedMoney> getMoney();

    @Override
    default CartDiscountValueFixedDraft toDraft() {
        return toDraftBuilder().build();
    }

    @Override
    default CartDiscountValueFixedDraftBuilder toDraftBuilder() {
        return CartDiscountValueFixedDraft.builder()
                .money(this.getMoney().stream().map(TypedMoney::toDraft).collect(Collectors.toList()));
    }
}
