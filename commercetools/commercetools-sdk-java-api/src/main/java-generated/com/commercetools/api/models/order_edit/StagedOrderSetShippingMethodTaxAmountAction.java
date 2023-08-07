
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A Shipping Method tax amount can be set if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodTaxAmountAction stagedOrderSetShippingMethodTaxAmountAction = StagedOrderSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxAmountActionImpl.class)
public interface StagedOrderSetShippingMethodTaxAmountAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingMethodTaxAmountAction
     */
    String SET_SHIPPING_METHOD_TAX_AMOUNT = "setShippingMethodTaxAmount";

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Orders with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Orders with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalTaxAmount value to be set
     */

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingMethodTaxAmountAction
     */
    public static StagedOrderSetShippingMethodTaxAmountAction of() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingMethodTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingMethodTaxAmountAction of(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        StagedOrderSetShippingMethodTaxAmountActionImpl instance = new StagedOrderSetShippingMethodTaxAmountActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingMethodTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingMethodTaxAmountAction deepCopy(
            @Nullable final StagedOrderSetShippingMethodTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingMethodTaxAmountActionImpl instance = new StagedOrderSetShippingMethodTaxAmountActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setExternalTaxAmount(
            com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingMethodTaxAmountAction
     * @return builder
     */
    public static StagedOrderSetShippingMethodTaxAmountActionBuilder builder() {
        return StagedOrderSetShippingMethodTaxAmountActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingMethodTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodTaxAmountActionBuilder builder(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        return StagedOrderSetShippingMethodTaxAmountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingMethodTaxAmountAction(
            Function<StagedOrderSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingMethodTaxAmountAction>";
            }
        };
    }
}
