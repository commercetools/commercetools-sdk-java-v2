
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the LineItem <code>price</code> and changes the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemPriceAction stagedOrderSetLineItemPriceAction = StagedOrderSetLineItemPriceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemPrice")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemPriceActionImpl.class)
public interface StagedOrderSetLineItemPriceAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemPriceAction
     */
    String SET_LINE_ITEM_PRICE = "setLineItemPrice";

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
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

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
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemPriceAction
     */
    public static StagedOrderSetLineItemPriceAction of() {
        return new StagedOrderSetLineItemPriceActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetLineItemPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemPriceAction of(final StagedOrderSetLineItemPriceAction template) {
        StagedOrderSetLineItemPriceActionImpl instance = new StagedOrderSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalPrice(template.getExternalPrice());
        return instance;
    }

    public StagedOrderSetLineItemPriceAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetLineItemPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLineItemPriceAction deepCopy(
            @Nullable final StagedOrderSetLineItemPriceAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLineItemPriceActionImpl instance = new StagedOrderSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getExternalPrice()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemPriceAction
     * @return builder
     */
    public static StagedOrderSetLineItemPriceActionBuilder builder() {
        return StagedOrderSetLineItemPriceActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemPriceActionBuilder builder(final StagedOrderSetLineItemPriceAction template) {
        return StagedOrderSetLineItemPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemPriceAction(Function<StagedOrderSetLineItemPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemPriceAction>";
            }
        };
    }
}
