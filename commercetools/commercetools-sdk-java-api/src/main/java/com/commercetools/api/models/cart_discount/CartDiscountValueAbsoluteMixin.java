
package com.commercetools.api.models.cart_discount;

import java.util.List;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.CentPrecisionMoney;

public interface CartDiscountValueAbsoluteMixin extends GenericCartDiscountValueMixin<CartDiscountValueAbsoluteDraft> {
    public List<CentPrecisionMoney> getMoney();

    @Override
    default CartDiscountValueAbsoluteDraft toDraft() {
        return toDraftBuilder().build();
    }

    @Override
    default CartDiscountValueAbsoluteDraftBuilder toDraftBuilder() {
        return CartDiscountValueAbsoluteDraft.builder()
                .money(this.getMoney().stream().map(CentPrecisionMoney::toDraft).collect(Collectors.toList()));
    }
}
