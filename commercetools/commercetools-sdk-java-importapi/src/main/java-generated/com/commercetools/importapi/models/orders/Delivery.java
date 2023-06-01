package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.Parcel;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.orders.DeliveryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DeliveryImpl.class)
public interface Delivery  {


    /**
     *
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
     *
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
     * set id
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     * set createdAt
     * @param createdAt value to be set
     */
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    
    /**
     * set items
     * @param items values to be set
     */
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    /**
     * set items
     * @param items values to be set
     */
    
    public void setItems(final List<DeliveryItem> items);
    
    /**
     * set parcels
     * @param parcels values to be set
     */
    
    @JsonIgnore
    public void setParcels(final Parcel ...parcels);
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
     * factory method
     * @return instance of Delivery
     */
    public static Delivery of(){
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(template.getItems());
        instance.setParcels(template.getParcels());
        instance.setAddress(template.getAddress());
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.DeliveryItem::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.Parcel::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(com.commercetools.importapi.models.common.Address.deepCopy(template.getAddress()));
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
