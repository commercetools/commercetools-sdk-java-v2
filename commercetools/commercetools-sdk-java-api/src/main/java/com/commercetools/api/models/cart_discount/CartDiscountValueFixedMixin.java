
package com.commercetools.api.models.cart_discount;

import java.util.List;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.CentPrecisionMoney;

public interface CartDiscountValueFixedMixin extends GenericCartDiscountValueMixin<CartDiscountValueFixedDraft> {
    public List<CentPrecisionMoney> getMoney();

    @Override
    default CartDiscountValueFixedDraft toDraft() {
        return toDraftBuilder().build();
    }

    @Override
    default CartDiscountValueFixedDraftBuilder toDraftBuilder() {
        return CartDiscountValueFixedDraft.builder()
                .money(this.getMoney().stream().map(CentPrecisionMoney::toDraft).collect(Collectors.toList()));
    }
}
