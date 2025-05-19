
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ParcelMeasurementDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurementDraft parcelMeasurementDraft = ParcelMeasurementDraft.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementDraftImpl.class)
public interface ParcelMeasurementDraft extends io.vrap.rmf.base.client.Draft<ParcelMeasurementDraft> {

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * factory method
     * @return instance of ParcelMeasurementDraft
     */
    public static ParcelMeasurementDraft of() {
        return new ParcelMeasurementDraftImpl();
    }

    /**
     * factory method to create a shallow copy ParcelMeasurementDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelMeasurementDraft of(final ParcelMeasurementDraft template) {
        ParcelMeasurementDraftImpl instance = new ParcelMeasurementDraftImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public ParcelMeasurementDraft copyDeep();

    /**
     * factory method to create a deep copy of ParcelMeasurementDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelMeasurementDraft deepCopy(@Nullable final ParcelMeasurementDraft template) {
        if (template == null) {
            return null;
        }
        ParcelMeasurementDraftImpl instance = new ParcelMeasurementDraftImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(
            com.commercetools.importapi.models.orders.ParcelMeasurements.deepCopy(template.getMeasurements()));
        return instance;
    }

    /**
     * builder factory method for ParcelMeasurementDraft
     * @return builder
     */
    public static ParcelMeasurementDraftBuilder builder() {
        return ParcelMeasurementDraftBuilder.of();
    }

    /**
     * create builder for ParcelMeasurementDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementDraftBuilder builder(final ParcelMeasurementDraft template) {
        return ParcelMeasurementDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelMeasurementDraft(Function<ParcelMeasurementDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurementDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurementDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelMeasurementDraft>";
            }
        };
    }
}
