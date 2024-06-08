
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.GeoLocation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set GeoLocation update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetGeoLocationChange setGeoLocationChange = SetGeoLocationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetGeoLocationChangeImpl.class)
public interface SetGeoLocationChange extends Change {

    /**
     * discriminator value for SetGeoLocationChange
     */
    String SET_GEO_LOCATION_CHANGE = "SetGeoLocationChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public GeoLocation getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public GeoLocation getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final GeoLocation previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final GeoLocation nextValue);

    /**
     * factory method
     * @return instance of SetGeoLocationChange
     */
    public static SetGeoLocationChange of() {
        return new SetGeoLocationChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetGeoLocationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetGeoLocationChange of(final SetGeoLocationChange template) {
        SetGeoLocationChangeImpl instance = new SetGeoLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetGeoLocationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetGeoLocationChange deepCopy(@Nullable final SetGeoLocationChange template) {
        if (template == null) {
            return null;
        }
        SetGeoLocationChangeImpl instance = new SetGeoLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.GeoLocation.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.GeoLocation.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetGeoLocationChange
     * @return builder
     */
    public static SetGeoLocationChangeBuilder builder() {
        return SetGeoLocationChangeBuilder.of();
    }

    /**
     * create builder for SetGeoLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetGeoLocationChangeBuilder builder(final SetGeoLocationChange template) {
        return SetGeoLocationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetGeoLocationChange(Function<SetGeoLocationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetGeoLocationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetGeoLocationChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetGeoLocationChange>";
            }
        };
    }
}
