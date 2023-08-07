
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the ParcelMeasurementsUpdated Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelMeasurementsAction stagedOrderSetParcelMeasurementsAction = StagedOrderSetParcelMeasurementsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelMeasurementsActionImpl.class)
public interface StagedOrderSetParcelMeasurementsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelMeasurementsAction
     */
    String SET_PARCEL_MEASUREMENTS = "setParcelMeasurements";

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * factory method
     * @return instance of StagedOrderSetParcelMeasurementsAction
     */
    public static StagedOrderSetParcelMeasurementsAction of() {
        return new StagedOrderSetParcelMeasurementsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetParcelMeasurementsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelMeasurementsAction of(final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionImpl instance = new StagedOrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetParcelMeasurementsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetParcelMeasurementsAction deepCopy(
            @Nullable final StagedOrderSetParcelMeasurementsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetParcelMeasurementsActionImpl instance = new StagedOrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setMeasurements(
            com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelMeasurementsAction
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder builder() {
        return StagedOrderSetParcelMeasurementsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetParcelMeasurementsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder builder(
            final StagedOrderSetParcelMeasurementsAction template) {
        return StagedOrderSetParcelMeasurementsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelMeasurementsAction(
            Function<StagedOrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelMeasurementsAction>";
            }
        };
    }
}
