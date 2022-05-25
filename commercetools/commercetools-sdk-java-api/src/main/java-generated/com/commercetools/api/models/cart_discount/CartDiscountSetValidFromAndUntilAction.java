
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromAndUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = CartDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetValidFromAndUntilActionImpl.class)
public interface CartDiscountSetValidFromAndUntilAction extends CartDiscountUpdateAction {

    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     <*  <p>Value to set. If empty, any existing value will be removed.</p>>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     <*  <p>Value to set. If empty, any existing value will be removed.</p>>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static CartDiscountSetValidFromAndUntilAction of() {
        return new CartDiscountSetValidFromAndUntilActionImpl();
    }

    public static CartDiscountSetValidFromAndUntilAction of(final CartDiscountSetValidFromAndUntilAction template) {
        CartDiscountSetValidFromAndUntilActionImpl instance = new CartDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder builder() {
        return CartDiscountSetValidFromAndUntilActionBuilder.of();
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder builder(
            final CartDiscountSetValidFromAndUntilAction template) {
        return CartDiscountSetValidFromAndUntilActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetValidFromAndUntilAction(
            Function<CartDiscountSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidFromAndUntilAction>";
            }
        };
    }
}
