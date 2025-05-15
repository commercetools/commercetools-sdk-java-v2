
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>When multiple shipping addresses are set for a Custom Line Item, use the Add CustomLineItem update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Custom Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Custom Line Item quantity and shipping details together, use this update action in combination with the Set CustomLineItem ShippingDetails update action in a single Order update command.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemQuantityAction stagedOrderChangeCustomLineItemQuantityAction = StagedOrderChangeCustomLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomLineItemQuantity")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeCustomLineItemQuantityActionImpl.class)
public interface StagedOrderChangeCustomLineItemQuantityAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeCustomLineItemQuantityAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_QUANTITY = "changeCustomLineItemQuantity";

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
     *  <p>New value to set. If <code>0</code>, the Custom Line Item is removed from the Order.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

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
     *  <p>New value to set. If <code>0</code>, the Custom Line Item is removed from the Order.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of StagedOrderChangeCustomLineItemQuantityAction
     */
    public static StagedOrderChangeCustomLineItemQuantityAction of() {
        return new StagedOrderChangeCustomLineItemQuantityActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeCustomLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeCustomLineItemQuantityAction of(
            final StagedOrderChangeCustomLineItemQuantityAction template) {
        StagedOrderChangeCustomLineItemQuantityActionImpl instance = new StagedOrderChangeCustomLineItemQuantityActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public StagedOrderChangeCustomLineItemQuantityAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderChangeCustomLineItemQuantityAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeCustomLineItemQuantityAction deepCopy(
            @Nullable final StagedOrderChangeCustomLineItemQuantityAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeCustomLineItemQuantityActionImpl instance = new StagedOrderChangeCustomLineItemQuantityActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeCustomLineItemQuantityAction
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder builder() {
        return StagedOrderChangeCustomLineItemQuantityActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemQuantityActionBuilder builder(
            final StagedOrderChangeCustomLineItemQuantityAction template) {
        return StagedOrderChangeCustomLineItemQuantityActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeCustomLineItemQuantityAction(
            Function<StagedOrderChangeCustomLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeCustomLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeCustomLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeCustomLineItemQuantityAction>";
            }
        };
    }
}
