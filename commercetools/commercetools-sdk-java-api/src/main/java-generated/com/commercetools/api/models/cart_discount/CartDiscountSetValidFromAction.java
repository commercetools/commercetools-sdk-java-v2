
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetValidFromActionImpl.class)
public interface CartDiscountSetValidFromAction extends CartDiscountUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    public void setValidFrom(final ZonedDateTime validFrom);

    public static CartDiscountSetValidFromAction of() {
        return new CartDiscountSetValidFromActionImpl();
    }

    public static CartDiscountSetValidFromAction of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionImpl instance = new CartDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public static CartDiscountSetValidFromActionBuilder builder() {
        return CartDiscountSetValidFromActionBuilder.of();
    }

    public static CartDiscountSetValidFromActionBuilder builder(final CartDiscountSetValidFromAction template) {
        return CartDiscountSetValidFromActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetValidFromAction(Function<CartDiscountSetValidFromAction, T> helper) {
        return helper.apply(this);
    }
}
