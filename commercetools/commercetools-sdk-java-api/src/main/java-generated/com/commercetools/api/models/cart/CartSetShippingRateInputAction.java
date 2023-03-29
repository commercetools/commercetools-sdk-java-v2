
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Input used to select a ShippingRatePriceTier. If no matching tier can be found, or the input is not set, the default price for the shipping rate is used.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingRateInputAction cartSetShippingRateInputAction = CartSetShippingRateInputAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingRateInputActionImpl.class)
public interface CartSetShippingRateInputAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingRateInputAction
     */
    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    /**
     * factory method
     * @return instance of CartSetShippingRateInputAction
     */
    public static CartSetShippingRateInputAction of() {
        return new CartSetShippingRateInputActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingRateInputAction of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionImpl instance = new CartSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingRateInputAction deepCopy(@Nullable final CartSetShippingRateInputAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingRateInputActionImpl instance = new CartSetShippingRateInputActionImpl();
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        return instance;
    }

    /**
     * builder factory method for CartSetShippingRateInputAction
     * @return builder
     */
    public static CartSetShippingRateInputActionBuilder builder() {
        return CartSetShippingRateInputActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingRateInputAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingRateInputActionBuilder builder(final CartSetShippingRateInputAction template) {
        return CartSetShippingRateInputActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingRateInputAction(Function<CartSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetShippingRateInputAction ofUnset() {
        return CartSetShippingRateInputAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingRateInputAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingRateInputAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingRateInputAction>";
            }
        };
    }
}
