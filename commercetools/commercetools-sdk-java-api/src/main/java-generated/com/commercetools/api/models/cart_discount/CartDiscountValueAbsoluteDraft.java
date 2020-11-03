package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueAbsoluteDraftImpl.class)
public interface CartDiscountValueAbsoluteDraft extends CartDiscountValueDraft {

    
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money ...money);
    public void setMoney(final List<Money> money);

    public static CartDiscountValueAbsoluteDraftImpl of(){
        return new CartDiscountValueAbsoluteDraftImpl();
    }
    

    public static CartDiscountValueAbsoluteDraftImpl of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    default <T> T withCartDiscountValueAbsoluteDraft(Function<CartDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }
}
