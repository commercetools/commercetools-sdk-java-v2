
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <ul>
 *   <li>When <code>External</code> TaxMode is changed to <code>Platform</code> or <code>Disabled</code>, all previously set external Tax Rates are removed.</li>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxModeActionImpl.class)
public interface CartChangeTaxModeAction extends CartUpdateAction {

    String CHANGE_TAX_MODE = "changeTaxMode";

    /**
     *  <p>The new TaxMode.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    public void setTaxMode(final TaxMode taxMode);

    public static CartChangeTaxModeAction of() {
        return new CartChangeTaxModeActionImpl();
    }

    public static CartChangeTaxModeAction of(final CartChangeTaxModeAction template) {
        CartChangeTaxModeActionImpl instance = new CartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public static CartChangeTaxModeActionBuilder builder() {
        return CartChangeTaxModeActionBuilder.of();
    }

    public static CartChangeTaxModeActionBuilder builder(final CartChangeTaxModeAction template) {
        return CartChangeTaxModeActionBuilder.of(template);
    }

    default <T> T withCartChangeTaxModeAction(Function<CartChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxModeAction>";
            }
        };
    }
}
