
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
 *  <p>GeoJSON Geometry represents a <span>Geometry Object</span> as defined in the GeoJSON standard.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoJson geoJson = GeoJson.pointBuilder()
 *             plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = GeoJsonImpl.class, visible = true)
@JsonDeserialize(as = GeoJsonImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GeoJson {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public GeoJson copyDeep();

    /**
     * factory method to create a deep copy of GeoJson
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GeoJson deepCopy(@Nullable final GeoJson template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof GeoJsonImpl)) {
            return template.copyDeep();
        }
        GeoJsonImpl instance = new GeoJsonImpl();
        return instance;
    }

    /**
     * builder for point subtype
     * @return builder
     */
    public static com.commercetools.history.models.common.GeoLocationBuilder pointBuilder() {
        return com.commercetools.history.models.common.GeoLocationBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeoJson(Function<GeoJson, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeoJson> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeoJson>() {
            @Override
            public String toString() {
                return "TypeReference<GeoJson>";
            }
        };
    }
}
