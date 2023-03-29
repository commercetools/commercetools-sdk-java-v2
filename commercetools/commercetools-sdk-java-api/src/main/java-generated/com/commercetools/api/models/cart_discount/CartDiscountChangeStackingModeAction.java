
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeStackingModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeStackingModeAction cartDiscountChangeStackingModeAction = CartDiscountChangeStackingModeAction.builder()
 *             .stackingMode(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeStackingModeActionImpl.class)
public interface CartDiscountChangeStackingModeAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeStackingModeAction
     */
    String CHANGE_STACKING_MODE = "changeStackingMode";

    /**
     *  <p>New value to set.</p>
     * @return stackingMode
     */
    @NotNull
    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    /**
     *  <p>New value to set.</p>
     * @param stackingMode value to be set
     */

    public void setStackingMode(final StackingMode stackingMode);

    /**
     * factory method
     * @return instance of CartDiscountChangeStackingModeAction
     */
    public static CartDiscountChangeStackingModeAction of() {
        return new CartDiscountChangeStackingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountChangeStackingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeStackingModeAction of(final CartDiscountChangeStackingModeAction template) {
        CartDiscountChangeStackingModeActionImpl instance = new CartDiscountChangeStackingModeActionImpl();
        instance.setStackingMode(template.getStackingMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountChangeStackingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountChangeStackingModeAction deepCopy(
            @Nullable final CartDiscountChangeStackingModeAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountChangeStackingModeActionImpl instance = new CartDiscountChangeStackingModeActionImpl();
        instance.setStackingMode(template.getStackingMode());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeStackingModeAction
     * @return builder
     */
    public static CartDiscountChangeStackingModeActionBuilder builder() {
        return CartDiscountChangeStackingModeActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeStackingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeStackingModeActionBuilder builder(
            final CartDiscountChangeStackingModeAction template) {
        return CartDiscountChangeStackingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeStackingModeAction(Function<CartDiscountChangeStackingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeStackingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeStackingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeStackingModeAction>";
            }
        };
    }
}
