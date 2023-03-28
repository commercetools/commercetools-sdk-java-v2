
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetResults
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetResults facetResults = FacetResults.builder()
 *             ./^[a-z].*$/(/^[a-z].*$/Builder -> /^[a-z].*$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults {

    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, FacetResult> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, FacetResult value);

    /**
     * factory method
     * @return instance of FacetResults
     */
    public static FacetResults of() {
        return new FacetResultsImpl();
    }

    /**
     * factory method to copy an instance of FacetResults
     * @param template instance to be copied
     * @return copy instance
     */
    public static FacetResults of(final FacetResults template) {
        FacetResultsImpl instance = new FacetResultsImpl();
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for FacetResults
     * @return builder
     */
    public static FacetResultsBuilder builder() {
        return FacetResultsBuilder.of();
    }

    /**
     * create builder for FacetResults instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FacetResultsBuilder builder(final FacetResults template) {
        return FacetResultsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFacetResults(Function<FacetResults, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FacetResults> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetResults>() {
            @Override
            public String toString() {
                return "TypeReference<FacetResults>";
            }
        };
    }
}
