
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Can be used if the Cart has the <code>External</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = CartSetCustomLineItemTaxRateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemTaxRateActionImpl.class)
public interface CartSetCustomLineItemTaxRateAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomLineItemTaxRateAction
     */
    String SET_CUSTOM_LINE_ITEM_TAX_RATE = "setCustomLineItemTaxRate";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of CartSetCustomLineItemTaxRateAction
     */
    public static CartSetCustomLineItemTaxRateAction of() {
        return new CartSetCustomLineItemTaxRateActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomLineItemTaxRateAction of(final CartSetCustomLineItemTaxRateAction template) {
        CartSetCustomLineItemTaxRateActionImpl instance = new CartSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomLineItemTaxRateAction deepCopy(
            @Nullable final CartSetCustomLineItemTaxRateAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomLineItemTaxRateActionImpl instance = new CartSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetCustomLineItemTaxRateAction
     * @return builder
     */
    public static CartSetCustomLineItemTaxRateActionBuilder builder() {
        return CartSetCustomLineItemTaxRateActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemTaxRateActionBuilder builder(final CartSetCustomLineItemTaxRateAction template) {
        return CartSetCustomLineItemTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomLineItemTaxRateAction(Function<CartSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemTaxRateAction>";
            }
        };
    }
}
