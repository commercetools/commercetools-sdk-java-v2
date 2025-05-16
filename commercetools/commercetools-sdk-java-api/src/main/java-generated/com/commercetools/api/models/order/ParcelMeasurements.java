
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurements
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements {

    /**
     *  <p>Height of the Parcel.</p>
     * @return heightInMillimeter
     */

    @JsonProperty("heightInMillimeter")
    public Integer getHeightInMillimeter();

    /**
     *  <p>Length of the Parcel.</p>
     * @return lengthInMillimeter
     */

    @JsonProperty("lengthInMillimeter")
    public Integer getLengthInMillimeter();

    /**
     *  <p>Width of the Parcel.</p>
     * @return widthInMillimeter
     */

    @JsonProperty("widthInMillimeter")
    public Integer getWidthInMillimeter();

    /**
     *  <p>Weight of the Parcel.</p>
     * @return weightInGram
     */

    @JsonProperty("weightInGram")
    public Integer getWeightInGram();

    /**
     *  <p>Height of the Parcel.</p>
     * @param heightInMillimeter value to be set
     */

    public void setHeightInMillimeter(final Integer heightInMillimeter);

    /**
     *  <p>Length of the Parcel.</p>
     * @param lengthInMillimeter value to be set
     */

    public void setLengthInMillimeter(final Integer lengthInMillimeter);

    /**
     *  <p>Width of the Parcel.</p>
     * @param widthInMillimeter value to be set
     */

    public void setWidthInMillimeter(final Integer widthInMillimeter);

    /**
     *  <p>Weight of the Parcel.</p>
     * @param weightInGram value to be set
     */

    public void setWeightInGram(final Integer weightInGram);

    /**
     * factory method
     * @return instance of ParcelMeasurements
     */
    public static ParcelMeasurements of() {
        return new ParcelMeasurementsImpl();
    }

    /**
     * factory method to create a shallow copy ParcelMeasurements
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelMeasurements of(final ParcelMeasurements template) {
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    public ParcelMeasurements copyDeep();

    /**
     * factory method to create a deep copy of ParcelMeasurements
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelMeasurements deepCopy(@Nullable final ParcelMeasurements template) {
        if (template == null) {
            return null;
        }
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    /**
     * builder factory method for ParcelMeasurements
     * @return builder
     */
    public static ParcelMeasurementsBuilder builder() {
        return ParcelMeasurementsBuilder.of();
    }

    /**
     * create builder for ParcelMeasurements instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementsBuilder builder(final ParcelMeasurements template) {
        return ParcelMeasurementsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelMeasurements(Function<ParcelMeasurements, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelMeasurements>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelMeasurements>";
            }
        };
    }
}
