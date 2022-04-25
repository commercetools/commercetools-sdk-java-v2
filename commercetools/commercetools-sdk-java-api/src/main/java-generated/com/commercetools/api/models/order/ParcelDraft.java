
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelDraftImpl.class)
public interface ParcelDraft extends com.commercetools.api.models.CustomizableDraft<ParcelDraft> {

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
    *  <p>The delivery items contained in this parcel.</p>
    */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
    *  <p>Custom Fields of this parcel.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setCustom(final CustomFieldsDraft custom);

    public static ParcelDraft of() {
        return new ParcelDraftImpl();
    }

    public static ParcelDraft of(final ParcelDraft template) {
        ParcelDraftImpl instance = new ParcelDraftImpl();
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ParcelDraftBuilder builder() {
        return ParcelDraftBuilder.of();
    }

    public static ParcelDraftBuilder builder(final ParcelDraft template) {
        return ParcelDraftBuilder.of(template);
    }

    default <T> T withParcelDraft(Function<ParcelDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelDraft>";
            }
        };
    }
}
