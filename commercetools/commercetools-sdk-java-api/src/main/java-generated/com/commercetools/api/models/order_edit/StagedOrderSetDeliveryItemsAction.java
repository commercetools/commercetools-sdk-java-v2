
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Delivery Items Updated Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = StagedOrderSetDeliveryItemsAction.builder()
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
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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
     * factory method to create a shallow copy StagedOrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryItemsAction of(final StagedOrderSetDeliveryItemsAction template) {
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryItemsAction deepCopy(
            @Nullable final StagedOrderSetDeliveryItemsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
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
