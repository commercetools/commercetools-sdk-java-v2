package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueFixedDraftBuilder {

    
    
    private java.util.List<com.commercetools.api.models.common.Money> money;

    
    public CartDiscountValueFixedDraftBuilder money( final com.commercetools.api.models.common.Money ...money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }
    
    
    public CartDiscountValueFixedDraftBuilder money( final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    
    
    public java.util.List<com.commercetools.api.models.common.Money> getMoney(){
        return this.money;
    }

    public CartDiscountValueFixedDraft build() {
        return new CartDiscountValueFixedDraftImpl(money);
    }

    public static CartDiscountValueFixedDraftBuilder of() {
        return new CartDiscountValueFixedDraftBuilder();
    }

    public static CartDiscountValueFixedDraftBuilder of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftBuilder builder = new CartDiscountValueFixedDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
