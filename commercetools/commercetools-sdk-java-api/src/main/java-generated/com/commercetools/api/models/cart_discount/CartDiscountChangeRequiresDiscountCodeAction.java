
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountChangeRequiresDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeRequiresDiscountCodeAction cartDiscountChangeRequiresDiscountCodeAction = CartDiscountChangeRequiresDiscountCodeAction.builder()
 *             .requiresDiscountCode(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeRequiresDiscountCode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeRequiresDiscountCodeActionImpl.class)
public interface CartDiscountChangeRequiresDiscountCodeAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeRequiresDiscountCodeAction
     */
    String CHANGE_REQUIRES_DISCOUNT_CODE = "changeRequiresDiscountCode";

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount can only be used in connection with a DiscountCode.</p>
     * @return requiresDiscountCode
     */
    @NotNull
    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount can only be used in connection with a DiscountCode.</p>
     * @param requiresDiscountCode value to be set
     */

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    /**
     * factory method
     * @return instance of CartDiscountChangeRequiresDiscountCodeAction
     */
    public static CartDiscountChangeRequiresDiscountCodeAction of() {
        return new CartDiscountChangeRequiresDiscountCodeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountChangeRequiresDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeRequiresDiscountCodeAction of(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        CartDiscountChangeRequiresDiscountCodeActionImpl instance = new CartDiscountChangeRequiresDiscountCodeActionImpl();
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        return instance;
    }

    public CartDiscountChangeRequiresDiscountCodeAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountChangeRequiresDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountChangeRequiresDiscountCodeAction deepCopy(
            @Nullable final CartDiscountChangeRequiresDiscountCodeAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountChangeRequiresDiscountCodeActionImpl instance = new CartDiscountChangeRequiresDiscountCodeActionImpl();
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeRequiresDiscountCodeAction
     * @return builder
     */
    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder() {
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeRequiresDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeRequiresDiscountCodeAction(
            Function<CartDiscountChangeRequiresDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeRequiresDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeRequiresDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeRequiresDiscountCodeAction>";
            }
        };
    }
}
