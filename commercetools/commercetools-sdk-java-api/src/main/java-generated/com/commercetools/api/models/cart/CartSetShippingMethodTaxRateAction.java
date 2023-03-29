
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
 *  <p>A Shipping Method Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxRateAction cartSetShippingMethodTaxRateAction = CartSetShippingMethodTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodTaxRateActionImpl.class)
public interface CartSetShippingMethodTaxRateAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingMethodTaxRateAction
     */
    String SET_SHIPPING_METHOD_TAX_RATE = "setShippingMethodTaxRate";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of CartSetShippingMethodTaxRateAction
     */
    public static CartSetShippingMethodTaxRateAction of() {
        return new CartSetShippingMethodTaxRateActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingMethodTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingMethodTaxRateAction of(final CartSetShippingMethodTaxRateAction template) {
        CartSetShippingMethodTaxRateActionImpl instance = new CartSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingMethodTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingMethodTaxRateAction deepCopy(
            @Nullable final CartSetShippingMethodTaxRateAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingMethodTaxRateActionImpl instance = new CartSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for CartSetShippingMethodTaxRateAction
     * @return builder
     */
    public static CartSetShippingMethodTaxRateActionBuilder builder() {
        return CartSetShippingMethodTaxRateActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingMethodTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingMethodTaxRateActionBuilder builder(final CartSetShippingMethodTaxRateAction template) {
        return CartSetShippingMethodTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingMethodTaxRateAction(Function<CartSetShippingMethodTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingMethodTaxRateAction>";
            }
        };
    }
}
