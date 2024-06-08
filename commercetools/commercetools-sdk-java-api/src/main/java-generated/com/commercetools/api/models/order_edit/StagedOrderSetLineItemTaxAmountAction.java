
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
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode. This update action sets the <code>taxedPrice</code> and <code>taxRate</code> on a Line Item and must be used after any price-affecting change occurs.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = StagedOrderSetLineItemTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetLineItemTaxAmountAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemTaxAmountAction
     */
    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalTaxAmount value to be set
     */

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemTaxAmountAction
     */
    public static StagedOrderSetLineItemTaxAmountAction of() {
        return new StagedOrderSetLineItemTaxAmountActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemTaxAmountAction of(final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLineItemTaxAmountAction deepCopy(
            @Nullable final StagedOrderSetLineItemTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalTaxAmount(
            com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemTaxAmountAction
     * @return builder
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder builder() {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder builder(
            final StagedOrderSetLineItemTaxAmountAction template) {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemTaxAmountAction(Function<StagedOrderSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemTaxAmountAction>";
            }
        };
    }
}
