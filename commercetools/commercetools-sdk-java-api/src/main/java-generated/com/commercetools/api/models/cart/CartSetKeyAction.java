
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetKeyActionImpl.class)
public interface CartSetKeyAction extends CartUpdateAction {

    String SET_KEY = "setKey";

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CartSetKeyAction of() {
        return new CartSetKeyActionImpl();
    }

    public static CartSetKeyAction of(final CartSetKeyAction template) {
        CartSetKeyActionImpl instance = new CartSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartSetKeyActionBuilder builder() {
        return CartSetKeyActionBuilder.of();
    }

    public static CartSetKeyActionBuilder builder(final CartSetKeyAction template) {
        return CartSetKeyActionBuilder.of(template);
    }

    default <T> T withCartSetKeyAction(Function<CartSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetKeyAction>";
            }
        };
    }
}
