package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart_discount.CartDiscountValueFixed;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueFixedBuilder {

    
    
    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    
    public CartDiscountValueFixedBuilder money( final com.commercetools.api.models.common.TypedMoney ...money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }
    
    
    public CartDiscountValueFixedBuilder money( final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        return this;
    }

    
    
    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney(){
        return this.money;
    }

    public CartDiscountValueFixed build() {
        return new CartDiscountValueFixedImpl(money);
    }

    public static CartDiscountValueFixedBuilder of() {
        return new CartDiscountValueFixedBuilder();
    }

    public static CartDiscountValueFixedBuilder of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedBuilder builder = new CartDiscountValueFixedBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
