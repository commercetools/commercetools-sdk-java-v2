
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Location location = Location.builder()
 *             .country("{country}")
 *             .state("{state}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocationImpl.class)
public interface Location {

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * set state
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     * factory method
     * @return instance of Location
     */
    public static Location of() {
        return new LocationImpl();
    }

    /**
     * factory method to create a shallow copy Location
     * @param template instance to be copied
     * @return copy instance
     */
    public static Location of(final Location template) {
        LocationImpl instance = new LocationImpl();
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    public Location copyDeep();

    /**
     * factory method to create a deep copy of Location
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Location deepCopy(@Nullable final Location template) {
        if (template == null) {
            return null;
        }
        LocationImpl instance = new LocationImpl();
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for Location
     * @return builder
     */
    public static LocationBuilder builder() {
        return LocationBuilder.of();
    }

    /**
     * create builder for Location instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocationBuilder builder(final Location template) {
        return LocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocation(Function<Location, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Location> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Location>() {
            @Override
            public String toString() {
                return "TypeReference<Location>";
            }
        };
    }
}
