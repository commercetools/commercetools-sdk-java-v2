
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeIsActiveAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeIsActiveAction cartDiscountChangeIsActiveAction = CartDiscountChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeIsActiveActionImpl.class)
public interface CartDiscountChangeIsActiveAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeIsActiveAction
     */
    String CHANGE_IS_ACTIVE = "changeIsActive";

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to the Cart.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to the Cart.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     * factory method
     * @return instance of CartDiscountChangeIsActiveAction
     */
    public static CartDiscountChangeIsActiveAction of() {
        return new CartDiscountChangeIsActiveActionImpl();
    }

    /**
     * factory method to copy an instance of CartDiscountChangeIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeIsActiveAction of(final CartDiscountChangeIsActiveAction template) {
        CartDiscountChangeIsActiveActionImpl instance = new CartDiscountChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeIsActiveAction
     * @return builder
     */
    public static CartDiscountChangeIsActiveActionBuilder builder() {
        return CartDiscountChangeIsActiveActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeIsActiveActionBuilder builder(final CartDiscountChangeIsActiveAction template) {
        return CartDiscountChangeIsActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeIsActiveAction(Function<CartDiscountChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeIsActiveAction>";
            }
        };
    }
}
