
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Delivery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Delivery delivery = Delivery.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryImpl.class)
public interface Delivery extends DeliveryMixin, com.commercetools.api.models.Customizable<Delivery> {

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *
     * @return parcels
     */
    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<Parcel> getParcels();

    /**
     *
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * set parcels
     * @param parcels values to be set
     */

    @JsonIgnore
    public void setParcels(final Parcel... parcels);

    /**
     * set parcels
     * @param parcels values to be set
     */

    public void setParcels(final List<Parcel> parcels);

    /**
     * set address
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of Delivery
     */
    public static Delivery of() {
        return new DeliveryImpl();
    }

    /**
     * factory method to create a shallow copy Delivery
     * @param template instance to be copied
     * @return copy instance
     */
    public static Delivery of(final Delivery template) {
        DeliveryImpl instance = new DeliveryImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(template.getItems());
        instance.setParcels(template.getParcels());
        instance.setAddress(template.getAddress());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of Delivery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Delivery deepCopy(@Nullable final Delivery template) {
        if (template == null) {
            return null;
        }
        DeliveryImpl instance = new DeliveryImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.Parcel::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Delivery
     * @return builder
     */
    public static DeliveryBuilder builder() {
        return DeliveryBuilder.of();
    }

    /**
     * create builder for Delivery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryBuilder builder(final Delivery template) {
        return DeliveryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDelivery(Function<Delivery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Delivery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Delivery>() {
            @Override
            public String toString() {
                return "TypeReference<Delivery>";
            }
        };
    }
}
