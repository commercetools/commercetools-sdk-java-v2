
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelItemsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelItemsAction orderSetParcelItemsAction = OrderSetParcelItemsAction.builder()
 *             .parcelId("{parcelId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelItemsActionImpl.class)
public interface OrderSetParcelItemsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelItemsAction
     */
    String SET_PARCEL_ITEMS = "setParcelItems";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

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
     * @return instance of OrderSetParcelItemsAction
     */
    public static OrderSetParcelItemsAction of() {
        return new OrderSetParcelItemsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetParcelItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetParcelItemsAction of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionImpl instance = new OrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetParcelItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetParcelItemsAction deepCopy(@Nullable final OrderSetParcelItemsAction template) {
        if (template == null) {
            return null;
        }
        OrderSetParcelItemsActionImpl instance = new OrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetParcelItemsAction
     * @return builder
     */
    public static OrderSetParcelItemsActionBuilder builder() {
        return OrderSetParcelItemsActionBuilder.of();
    }

    /**
     * create builder for OrderSetParcelItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelItemsActionBuilder builder(final OrderSetParcelItemsAction template) {
        return OrderSetParcelItemsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetParcelItemsAction(Function<OrderSetParcelItemsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelItemsAction>";
            }
        };
    }
}
