
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.orders.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DeliveryDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryDraft deliveryDraft = DeliveryDraft.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryDraftImpl.class)
public interface DeliveryDraft extends io.vrap.rmf.base.client.Draft<DeliveryDraft> {

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *
     * @return parcels
     */
    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<DeliveryParcelDraft> getParcels();

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
     * set address
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * set parcels
     * @param parcels values to be set
     */

    @JsonIgnore
    public void setParcels(final DeliveryParcelDraft... parcels);

    /**
     * set parcels
     * @param parcels values to be set
     */

    public void setParcels(final List<DeliveryParcelDraft> parcels);

    /**
     * factory method
     * @return instance of DeliveryDraft
     */
    public static DeliveryDraft of() {
        return new DeliveryDraftImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryDraft of(final DeliveryDraft template) {
        DeliveryDraftImpl instance = new DeliveryDraftImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    public DeliveryDraft copyDeep();

    /**
     * factory method to create a deep copy of DeliveryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryDraft deepCopy(@Nullable final DeliveryDraft template) {
        if (template == null) {
            return null;
        }
        DeliveryDraftImpl instance = new DeliveryDraftImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(com.commercetools.importapi.models.common.Address.deepCopy(template.getAddress()));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.order_patches.DeliveryParcelDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DeliveryDraft
     * @return builder
     */
    public static DeliveryDraftBuilder builder() {
        return DeliveryDraftBuilder.of();
    }

    /**
     * create builder for DeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryDraftBuilder builder(final DeliveryDraft template) {
        return DeliveryDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryDraft(Function<DeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryDraft>";
            }
        };
    }
}
