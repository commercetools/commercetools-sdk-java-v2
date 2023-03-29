
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemShippingDetailsAction stagedOrderSetLineItemShippingDetailsAction = StagedOrderSetLineItemShippingDetailsAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetLineItemShippingDetailsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemShippingDetailsAction
     */
    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemShippingDetailsAction
     */
    public static StagedOrderSetLineItemShippingDetailsAction of() {
        return new StagedOrderSetLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemShippingDetailsAction of(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        StagedOrderSetLineItemShippingDetailsActionImpl instance = new StagedOrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLineItemShippingDetailsAction deepCopy(
            @Nullable final StagedOrderSetLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLineItemShippingDetailsActionImpl instance = new StagedOrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(Optional.ofNullable(template.getShippingDetails())
                .map(com.commercetools.api.models.cart.ItemShippingDetailsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemShippingDetailsAction
     * @return builder
     */
    public static StagedOrderSetLineItemShippingDetailsActionBuilder builder() {
        return StagedOrderSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemShippingDetailsActionBuilder builder(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        return StagedOrderSetLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemShippingDetailsAction(
            Function<StagedOrderSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemShippingDetailsAction>";
            }
        };
    }
}
