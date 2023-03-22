
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAction cartDiscountSetValidFromAction = CartDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetValidFromActionImpl.class)
public interface CartDiscountSetValidFromAction extends CartDiscountUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validFrom
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

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidFromAction>";
            }
        };
    }
}
