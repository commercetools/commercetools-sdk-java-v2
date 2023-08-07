
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 *     StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = StagedOrderSetCustomLineItemTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxRateActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxRateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemTaxRateAction
     */
    String SET_CUSTOM_LINE_ITEM_TAX_RATE = "setCustomLineItemTaxRate";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomLineItemTaxRateAction
     */
    public static StagedOrderSetCustomLineItemTaxRateAction of() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemTaxRateAction of(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemTaxRateAction deepCopy(
            @Nullable final StagedOrderSetCustomLineItemTaxRateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemTaxRateAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder() {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemTaxRateAction(
            Function<StagedOrderSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemTaxRateAction>";
            }
        };
    }
}
