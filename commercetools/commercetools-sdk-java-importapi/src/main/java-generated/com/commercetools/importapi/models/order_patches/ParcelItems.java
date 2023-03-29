
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelItems
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelItems parcelItems = ParcelItems.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelItemsImpl.class)
public interface ParcelItems {

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
     * @return instance of ParcelItems
     */
    public static ParcelItems of() {
        return new ParcelItemsImpl();
    }

    /**
     * factory method to create a shallow copy ParcelItems
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelItems of(final ParcelItems template) {
        ParcelItemsImpl instance = new ParcelItemsImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelItems
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelItems deepCopy(@Nullable final ParcelItems template) {
        if (template == null) {
            return null;
        }
        ParcelItemsImpl instance = new ParcelItemsImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ParcelItems
     * @return builder
     */
    public static ParcelItemsBuilder builder() {
        return ParcelItemsBuilder.of();
    }

    /**
     * create builder for ParcelItems instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelItemsBuilder builder(final ParcelItems template) {
        return ParcelItemsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelItems(Function<ParcelItems, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItems> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItems>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItems>";
            }
        };
    }
}
