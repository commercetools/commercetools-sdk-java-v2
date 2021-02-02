
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetKeyActionImpl.class)
public interface CartDiscountSetKeyAction extends CartDiscountUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CartDiscountSetKeyAction of() {
        return new CartDiscountSetKeyActionImpl();
    }

    public static CartDiscountSetKeyAction of(final CartDiscountSetKeyAction template) {
        CartDiscountSetKeyActionImpl instance = new CartDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartDiscountSetKeyActionBuilder builder() {
        return CartDiscountSetKeyActionBuilder.of();
    }

    public static CartDiscountSetKeyActionBuilder builder(final CartDiscountSetKeyAction template) {
        return CartDiscountSetKeyActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetKeyAction(Function<CartDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
