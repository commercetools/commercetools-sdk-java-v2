
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the tax calculation mode leads to recalculation of taxes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxCalculationModeAction cartChangeTaxCalculationModeAction = CartChangeTaxCalculationModeAction.builder()
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxCalculationModeActionImpl.class)
public interface CartChangeTaxCalculationModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeTaxCalculationModeAction
     */
    String CHANGE_TAX_CALCULATION_MODE = "changeTaxCalculationMode";

    /**
     *  <p>New value to set.</p>
     * @return taxCalculationMode
     */
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>New value to set.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     * factory method
     * @return instance of CartChangeTaxCalculationModeAction
     */
    public static CartChangeTaxCalculationModeAction of() {
        return new CartChangeTaxCalculationModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeTaxCalculationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeTaxCalculationModeAction of(final CartChangeTaxCalculationModeAction template) {
        CartChangeTaxCalculationModeActionImpl instance = new CartChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartChangeTaxCalculationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeTaxCalculationModeAction deepCopy(
            @Nullable final CartChangeTaxCalculationModeAction template) {
        if (template == null) {
            return null;
        }
        CartChangeTaxCalculationModeActionImpl instance = new CartChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    /**
     * builder factory method for CartChangeTaxCalculationModeAction
     * @return builder
     */
    public static CartChangeTaxCalculationModeActionBuilder builder() {
        return CartChangeTaxCalculationModeActionBuilder.of();
    }

    /**
     * create builder for CartChangeTaxCalculationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeTaxCalculationModeActionBuilder builder(final CartChangeTaxCalculationModeAction template) {
        return CartChangeTaxCalculationModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeTaxCalculationModeAction(Function<CartChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxCalculationModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxCalculationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxCalculationModeAction>";
            }
        };
    }
}
