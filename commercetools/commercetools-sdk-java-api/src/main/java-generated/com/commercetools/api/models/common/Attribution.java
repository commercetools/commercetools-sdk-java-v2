
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Indicates the source and method that indirectly created or modified the resource. This is present on resources created or updated after 1 April 2024.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribution attribution = Attribution.builder()
 *             .source(AttributionSource.IMPORT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributionImpl.class)
public interface Attribution {

    /**
     *  <p><code>id</code> of the API Client that created or modified the resource.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>Method used to initiate the creation or modification of the resource.</p>
     * @return source
     */
    @NotNull
    @JsonProperty("source")
    public AttributionSource getSource();

    /**
     *  <p><code>id</code> of the API Client that created or modified the resource.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>Method used to initiate the creation or modification of the resource.</p>
     * @param source value to be set
     */

    public void setSource(final AttributionSource source);

    /**
     * factory method
     * @return instance of Attribution
     */
    public static Attribution of() {
        return new AttributionImpl();
    }

    /**
     * factory method to create a shallow copy Attribution
     * @param template instance to be copied
     * @return copy instance
     */
    public static Attribution of(final Attribution template) {
        AttributionImpl instance = new AttributionImpl();
        instance.setClientId(template.getClientId());
        instance.setSource(template.getSource());
        return instance;
    }

    /**
     * factory method to create a deep copy of Attribution
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Attribution deepCopy(@Nullable final Attribution template) {
        if (template == null) {
            return null;
        }
        AttributionImpl instance = new AttributionImpl();
        instance.setClientId(template.getClientId());
        instance.setSource(template.getSource());
        return instance;
    }

    /**
     * builder factory method for Attribution
     * @return builder
     */
    public static AttributionBuilder builder() {
        return AttributionBuilder.of();
    }

    /**
     * create builder for Attribution instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributionBuilder builder(final Attribution template) {
        return AttributionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttribution(Function<Attribution, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Attribution> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Attribution>() {
            @Override
            public String toString() {
                return "TypeReference<Attribution>";
            }
        };
    }
}
