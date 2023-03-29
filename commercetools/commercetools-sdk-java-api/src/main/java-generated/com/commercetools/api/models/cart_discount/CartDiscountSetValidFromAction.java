
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    /**
     * discriminator value for CartDiscountSetValidFromAction
     */
    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     * factory method
     * @return instance of CartDiscountSetValidFromAction
     */
    public static CartDiscountSetValidFromAction of() {
        return new CartDiscountSetValidFromActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetValidFromAction of(final CartDiscountSetValidFromAction template) {
        CartDiscountSetValidFromActionImpl instance = new CartDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetValidFromAction deepCopy(@Nullable final CartDiscountSetValidFromAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetValidFromActionImpl instance = new CartDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetValidFromAction
     * @return builder
     */
    public static CartDiscountSetValidFromActionBuilder builder() {
        return CartDiscountSetValidFromActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidFromActionBuilder builder(final CartDiscountSetValidFromAction template) {
        return CartDiscountSetValidFromActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetValidFromAction(Function<CartDiscountSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidFromAction>";
            }
        };
    }
}
