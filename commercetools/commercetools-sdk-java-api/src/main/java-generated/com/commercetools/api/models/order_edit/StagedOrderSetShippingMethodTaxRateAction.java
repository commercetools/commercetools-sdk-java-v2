
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodTaxRateAction stagedOrderSetShippingMethodTaxRateAction = StagedOrderSetShippingMethodTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxRateActionImpl.class)
public interface StagedOrderSetShippingMethodTaxRateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingMethodTaxRateAction
     */
    String SET_SHIPPING_METHOD_TAX_RATE = "setShippingMethodTaxRate";

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingMethodTaxRateAction
     */
    public static StagedOrderSetShippingMethodTaxRateAction of() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetShippingMethodTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingMethodTaxRateAction of(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionImpl instance = new StagedOrderSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingMethodTaxRateAction
     * @return builder
     */
    public static StagedOrderSetShippingMethodTaxRateActionBuilder builder() {
        return StagedOrderSetShippingMethodTaxRateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingMethodTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodTaxRateActionBuilder builder(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        return StagedOrderSetShippingMethodTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingMethodTaxRateAction(
            Function<StagedOrderSetShippingMethodTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingMethodTaxRateAction>";
            }
        };
    }
}
