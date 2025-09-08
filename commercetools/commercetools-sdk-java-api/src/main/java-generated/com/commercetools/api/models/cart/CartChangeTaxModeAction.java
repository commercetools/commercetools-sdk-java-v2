
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <ul>
 *   <li>When <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> is changed to <code>Platform</code> or <code>Disabled</code>, all previously set external Tax Rates are removed.</li>
 *   <li>When set to <code>Platform</code>, Line Items, Custom Line Items, and Shipping Method require a Tax Category with a Tax Rate for the Cart's <code>shippingAddress</code>.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxModeAction cartChangeTaxModeAction = CartChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeTaxMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxModeActionImpl.class)
public interface CartChangeTaxModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeTaxModeAction
     */
    String CHANGE_TAX_MODE = "changeTaxMode";

    /**
     *  <p>The new TaxMode.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>The new TaxMode.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * factory method
     * @return instance of CartChangeTaxModeAction
     */
    public static CartChangeTaxModeAction of() {
        return new CartChangeTaxModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeTaxModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeTaxModeAction of(final CartChangeTaxModeAction template) {
        CartChangeTaxModeActionImpl instance = new CartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public CartChangeTaxModeAction copyDeep();

    /**
     * factory method to create a deep copy of CartChangeTaxModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeTaxModeAction deepCopy(@Nullable final CartChangeTaxModeAction template) {
        if (template == null) {
            return null;
        }
        CartChangeTaxModeActionImpl instance = new CartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * builder factory method for CartChangeTaxModeAction
     * @return builder
     */
    public static CartChangeTaxModeActionBuilder builder() {
        return CartChangeTaxModeActionBuilder.of();
    }

    /**
     * create builder for CartChangeTaxModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeTaxModeActionBuilder builder(final CartChangeTaxModeAction template) {
        return CartChangeTaxModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeTaxModeAction(Function<CartChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxModeAction>";
            }
        };
    }
}
