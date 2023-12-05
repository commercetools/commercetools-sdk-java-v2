
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.AddressDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryDraft deliveryDraft = DeliveryDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryDraftImpl.class)
public interface DeliveryDraft extends com.commercetools.api.models.CustomizableDraft<DeliveryDraft>,
        io.vrap.rmf.base.client.Draft<DeliveryDraft> {

    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Line Items or Custom Line Items to deliver. It can also be specified individually for each Parcel.</p>
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Information regarding the appearance, content, and shipment of a parcel.</p>
     * @return parcels
     */
    @Valid
    @JsonProperty("parcels")
    public List<ParcelDraft> getParcels();

    /**
     *  <p>Address to which the Parcels are delivered.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public AddressDraft getAddress();

    /**
     *  <p>Custom Fields for the Delivery.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Line Items or Custom Line Items to deliver. It can also be specified individually for each Parcel.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Line Items or Custom Line Items to deliver. It can also be specified individually for each Parcel.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>Information regarding the appearance, content, and shipment of a parcel.</p>
     * @param parcels values to be set
     */

    @JsonIgnore
    public void setParcels(final ParcelDraft... parcels);

    /**
     *  <p>Information regarding the appearance, content, and shipment of a parcel.</p>
     * @param parcels values to be set
     */

    public void setParcels(final List<ParcelDraft> parcels);

    /**
     *  <p>Address to which the Parcels are delivered.</p>
     * @param address value to be set
     */

    public void setAddress(final AddressDraft address);

    /**
     *  <p>Custom Fields for the Delivery.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

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
        instance.setKey(template.getKey());
        instance.setItems(template.getItems());
        instance.setParcels(template.getParcels());
        instance.setAddress(template.getAddress());
        instance.setCustom(template.getCustom());
        return instance;
    }

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
        instance.setKey(template.getKey());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ParcelDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(com.commercetools.api.models.common.AddressDraft.deepCopy(template.getAddress()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
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
