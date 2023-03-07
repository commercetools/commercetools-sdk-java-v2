
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.TaxMode;
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
 *     MyCartChangeTaxModeAction myCartChangeTaxModeAction = MyCartChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartChangeTaxModeActionImpl.class)
public interface MyCartChangeTaxModeAction extends MyCartUpdateAction {

    String CHANGE_TAX_MODE = "changeTaxMode";

    /**
     *  <p>The new TaxMode.</p>
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    public void setTaxMode(final TaxMode taxMode);

    public static MyCartChangeTaxModeAction of() {
        return new MyCartChangeTaxModeActionImpl();
    }

    public static MyCartChangeTaxModeAction of(final MyCartChangeTaxModeAction template) {
        MyCartChangeTaxModeActionImpl instance = new MyCartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public static MyCartChangeTaxModeActionBuilder builder() {
        return MyCartChangeTaxModeActionBuilder.of();
    }

    public static MyCartChangeTaxModeActionBuilder builder(final MyCartChangeTaxModeAction template) {
        return MyCartChangeTaxModeActionBuilder.of(template);
    }

    default <T> T withMyCartChangeTaxModeAction(Function<MyCartChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartChangeTaxModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartChangeTaxModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartChangeTaxModeAction>";
            }
        };
    }
}
