
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveLineItemAction stagedOrderRemoveLineItemAction = StagedOrderRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveLineItemActionImpl.class)
public interface StagedOrderRemoveLineItemAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveLineItemAction
     */
    String REMOVE_LINE_ITEM = "removeLineItem";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetailsToRemove
     */
    @Valid
    @JsonProperty("shippingDetailsToRemove")
    public ItemShippingDetailsDraft getShippingDetailsToRemove();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     * set externalTotalPrice
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetailsToRemove value to be set
     */

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    /**
     * factory method
     * @return instance of StagedOrderRemoveLineItemAction
     */
    public static StagedOrderRemoveLineItemAction of() {
        return new StagedOrderRemoveLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveLineItemAction of(final StagedOrderRemoveLineItemAction template) {
        StagedOrderRemoveLineItemActionImpl instance = new StagedOrderRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemoveLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveLineItemAction deepCopy(@Nullable final StagedOrderRemoveLineItemAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveLineItemActionImpl instance = new StagedOrderRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(Optional.ofNullable(template.getExternalPrice())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setExternalTotalPrice(Optional.ofNullable(template.getExternalTotalPrice())
                .map(com.commercetools.api.models.cart.ExternalLineItemTotalPrice::deepCopy)
                .orElse(null));
        instance.setShippingDetailsToRemove(Optional.ofNullable(template.getShippingDetailsToRemove())
                .map(com.commercetools.api.models.cart.ItemShippingDetailsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveLineItemAction
     * @return builder
     */
    public static StagedOrderRemoveLineItemActionBuilder builder() {
        return StagedOrderRemoveLineItemActionBuilder.of();
    }

    /**
     * create builder for StagedOrderRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveLineItemActionBuilder builder(final StagedOrderRemoveLineItemAction template) {
        return StagedOrderRemoveLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveLineItemAction(Function<StagedOrderRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveLineItemAction>";
            }
        };
    }
}
