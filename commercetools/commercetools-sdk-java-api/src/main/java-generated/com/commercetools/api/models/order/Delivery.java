
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

    public void setId(final String id);

    public void setCreatedAt(final ZonedDateTime createdAt);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    @JsonIgnore
    public void setParcels(final Parcel... parcels);

    public void setParcels(final List<Parcel> parcels);

    public void setAddress(final Address address);

    public void setCustom(final CustomFields custom);

    public static Delivery of() {
        return new DeliveryImpl();
    }

    public static Delivery of(final Delivery template) {
        DeliveryImpl instance = new DeliveryImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(template.getItems());
        instance.setParcels(template.getParcels());
        instance.setAddress(template.getAddress());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static DeliveryBuilder builder() {
        return DeliveryBuilder.of();
    }

    public static DeliveryBuilder builder(final Delivery template) {
        return DeliveryBuilder.of(template);
    }

    default <T> T withDelivery(Function<Delivery, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Delivery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Delivery>() {
            @Override
            public String toString() {
                return "TypeReference<Delivery>";
            }
        };
    }
}
