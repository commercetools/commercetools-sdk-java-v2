
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemTaxAmountAction stagedOrderSetCustomLineItemTaxAmountAction = StagedOrderSetCustomLineItemTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxAmountAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemTaxAmountAction
     */
    String SET_CUSTOM_LINE_ITEM_TAX_AMOUNT = "setCustomLineItemTaxAmount";

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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     */

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomLineItemTaxAmountAction
     */
    public static StagedOrderSetCustomLineItemTaxAmountAction of() {
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemTaxAmountAction of(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        StagedOrderSetCustomLineItemTaxAmountActionImpl instance = new StagedOrderSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemTaxAmountAction deepCopy(
            @Nullable final StagedOrderSetCustomLineItemTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemTaxAmountActionImpl instance = new StagedOrderSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxAmount(
            com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemTaxAmountAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder builder() {
        return StagedOrderSetCustomLineItemTaxAmountActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder builder(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        return StagedOrderSetCustomLineItemTaxAmountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemTaxAmountAction(
            Function<StagedOrderSetCustomLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemTaxAmountAction>";
            }
        };
    }
}
