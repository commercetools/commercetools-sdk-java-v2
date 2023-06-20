
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelDraft parcelDraft = ParcelDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelDraftImpl.class)
public interface ParcelDraft extends com.commercetools.api.models.CustomizableDraft<ParcelDraft>,
        io.vrap.rmf.base.client.Draft<ParcelDraft> {

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Custom Fields of this parcel.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier of the Parcel.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>Custom Fields of this parcel.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of ParcelDraft
     */
    public static ParcelDraft of() {
        return new ParcelDraftImpl();
    }

    /**
     * factory method to create a shallow copy ParcelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelDraft of(final ParcelDraft template) {
        ParcelDraftImpl instance = new ParcelDraftImpl();
        instance.setKey(template.getKey());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelDraft deepCopy(@Nullable final ParcelDraft template) {
        if (template == null) {
            return null;
        }
        ParcelDraftImpl instance = new ParcelDraftImpl();
        instance.setKey(template.getKey());
        instance.setMeasurements(
            com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ParcelDraft
     * @return builder
     */
    public static ParcelDraftBuilder builder() {
        return ParcelDraftBuilder.of();
    }

    /**
     * create builder for ParcelDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelDraftBuilder builder(final ParcelDraft template) {
        return ParcelDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelDraft(Function<ParcelDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelDraft>";
            }
        };
    }
}
