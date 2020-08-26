package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetValidFromActionImpl.class)
public interface CartDiscountSetValidFromAction extends CartDiscountUpdateAction {

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    public void setValidFrom(final ZonedDateTime validFrom);

    public static CartDiscountSetValidFromActionImpl of(){
        return new CartDiscountSetValidFromActionImpl();
    }
    

    public static CartDiscountSetValidFromActionImpl of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionImpl instance = new CartDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

}
