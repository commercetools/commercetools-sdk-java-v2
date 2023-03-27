
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTotalPriceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTotalPriceAction stagedOrderSetLineItemTotalPriceAction = StagedOrderSetLineItemTotalPriceAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemTotalPriceActionImpl.class)
public interface StagedOrderSetLineItemTotalPriceAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemTotalPriceAction
     */
    String SET_LINE_ITEM_TOTAL_PRICE = "setLineItemTotalPrice";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set externalTotalPrice
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemTotalPriceAction
     */
    public static StagedOrderSetLineItemTotalPriceAction of() {
        return new StagedOrderSetLineItemTotalPriceActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetLineItemTotalPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemTotalPriceAction of(final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionImpl instance = new StagedOrderSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemTotalPriceAction
     * @return builder
     */
    public static StagedOrderSetLineItemTotalPriceActionBuilder builder() {
        return StagedOrderSetLineItemTotalPriceActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemTotalPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemTotalPriceActionBuilder builder(
            final StagedOrderSetLineItemTotalPriceAction template) {
        return StagedOrderSetLineItemTotalPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemTotalPriceAction(
            Function<StagedOrderSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTotalPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTotalPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemTotalPriceAction>";
            }
        };
    }
}
