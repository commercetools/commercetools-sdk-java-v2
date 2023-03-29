
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeLineItemQuantityAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeLineItemQuantityAction stagedOrderChangeLineItemQuantityAction = StagedOrderChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeLineItemQuantityActionImpl.class)
public interface StagedOrderChangeLineItemQuantityAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeLineItemQuantityAction
     */
    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

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
    @NotNull
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
     * factory method
     * @return instance of StagedOrderChangeLineItemQuantityAction
     */
    public static StagedOrderChangeLineItemQuantityAction of() {
        return new StagedOrderChangeLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeLineItemQuantityAction of(final StagedOrderChangeLineItemQuantityAction template) {
        StagedOrderChangeLineItemQuantityActionImpl instance = new StagedOrderChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeLineItemQuantityAction deepCopy(
            @Nullable final StagedOrderChangeLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeLineItemQuantityActionImpl instance = new StagedOrderChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(Optional.ofNullable(template.getExternalPrice())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setExternalTotalPrice(Optional.ofNullable(template.getExternalTotalPrice())
                .map(com.commercetools.api.models.cart.ExternalLineItemTotalPrice::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeLineItemQuantityAction
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder builder() {
        return StagedOrderChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder builder(
            final StagedOrderChangeLineItemQuantityAction template) {
        return StagedOrderChangeLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeLineItemQuantityAction(
            Function<StagedOrderChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeLineItemQuantityAction>";
            }
        };
    }
}
