
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementDraftImpl.class)
public interface ParcelMeasurementDraft {

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setParcelId(final String parcelId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public static ParcelMeasurementDraft of() {
        return new ParcelMeasurementDraftImpl();
    }

    public static ParcelMeasurementDraft of(final ParcelMeasurementDraft template) {
        ParcelMeasurementDraftImpl instance = new ParcelMeasurementDraftImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public static ParcelMeasurementDraftBuilder builder() {
        return ParcelMeasurementDraftBuilder.of();
    }

    public static ParcelMeasurementDraftBuilder builder(final ParcelMeasurementDraft template) {
        return ParcelMeasurementDraftBuilder.of(template);
    }

    default <T> T withParcelMeasurementDraft(Function<ParcelMeasurementDraft, T> helper) {
        return helper.apply(this);
    }
}
