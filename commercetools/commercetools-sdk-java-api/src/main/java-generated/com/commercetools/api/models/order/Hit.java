
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Hit
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Hit hit = Hit.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HitImpl.class)
public interface Hit {

    /**
     *  <p>Unique identifier of the Order.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
     * @return relevance
     */

    @JsonProperty("relevance")
    public Double getRelevance();

    /**
     *  <p>Unique identifier of the Order.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
     * @param relevance value to be set
     */

    public void setRelevance(final Double relevance);

    /**
     * factory method
     * @return instance of Hit
     */
    public static Hit of() {
        return new HitImpl();
    }

    /**
     * factory method to copy an instance of Hit
     * @param template instance to be copied
     * @return copy instance
     */
    public static Hit of(final Hit template) {
        HitImpl instance = new HitImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    /**
     * builder factory method for Hit
     * @return builder
     */
    public static HitBuilder builder() {
        return HitBuilder.of();
    }

    /**
     * create builder for Hit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HitBuilder builder(final Hit template) {
        return HitBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withHit(Function<Hit, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Hit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Hit>() {
            @Override
            public String toString() {
                return "TypeReference<Hit>";
            }
        };
    }
}
