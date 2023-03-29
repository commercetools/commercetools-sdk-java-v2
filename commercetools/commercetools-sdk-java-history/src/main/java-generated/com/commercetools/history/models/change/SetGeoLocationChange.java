
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.GeoLocation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetGeoLocationChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetGeoLocationChange setGeoLocationChange = SetGeoLocationChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
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
     *  <p>Update action for <code>setGeoLocation</code></p>
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
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public GeoLocation getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public GeoLocation getPreviousValue();

    /**
     *  <p>Update action for <code>setGeoLocation</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final GeoLocation nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final GeoLocation previousValue);

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
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.GeoLocation::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.GeoLocation::deepCopy)
                .orElse(null));
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
