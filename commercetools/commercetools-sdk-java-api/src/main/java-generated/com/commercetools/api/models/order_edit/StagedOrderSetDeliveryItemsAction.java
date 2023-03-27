
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryItemsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = StagedOrderSetDeliveryItemsAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryItemsActionImpl.class)
public interface StagedOrderSetDeliveryItemsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryItemsAction
     */
    String SET_DELIVERY_ITEMS = "setDeliveryItems";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryItemsAction
     */
    public static StagedOrderSetDeliveryItemsAction of() {
        return new StagedOrderSetDeliveryItemsActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryItemsAction of(final StagedOrderSetDeliveryItemsAction template) {
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryItemsAction
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder builder() {
        return StagedOrderSetDeliveryItemsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder builder(final StagedOrderSetDeliveryItemsAction template) {
        return StagedOrderSetDeliveryItemsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryItemsAction(Function<StagedOrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryItemsAction>";
            }
        };
    }
}
