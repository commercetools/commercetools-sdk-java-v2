
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>A Shipping Method Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setShippingMethodTaxRate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxRateActionImpl.class)
public interface StagedOrderSetShippingMethodTaxRateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingMethodTaxRateAction
     */
    String SET_SHIPPING_METHOD_TAX_RATE = "setShippingMethodTaxRate";

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> to update. This is required for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> to update. This is required for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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
     * factory method to create a shallow copy StagedOrderSetShippingMethodTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingMethodTaxRateAction of(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionImpl instance = new StagedOrderSetShippingMethodTaxRateActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public StagedOrderSetShippingMethodTaxRateAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetShippingMethodTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingMethodTaxRateAction deepCopy(
            @Nullable final StagedOrderSetShippingMethodTaxRateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingMethodTaxRateActionImpl instance = new StagedOrderSetShippingMethodTaxRateActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
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
