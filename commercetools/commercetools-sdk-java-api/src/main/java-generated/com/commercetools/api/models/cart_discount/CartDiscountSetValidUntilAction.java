package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetValidUntilActionImpl.class)
public interface CartDiscountSetValidUntilAction extends CartDiscountUpdateAction {

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidUntil(final ZonedDateTime validUntil);

    public static CartDiscountSetValidUntilActionImpl of(){
        return new CartDiscountSetValidUntilActionImpl();
    }
    

    public static CartDiscountSetValidUntilActionImpl of(final CartDiscountSetValidUntilAction template) {
        CartDiscountSetValidUntilActionImpl instance = new CartDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    default <T extends Accessor<CartDiscountSetValidUntilAction>> T withCartDiscountSetValidUntilAction(Function<CartDiscountSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }
}
