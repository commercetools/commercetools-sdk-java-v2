package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResultsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults  {


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
    public static FacetResults of(){
        return new FacetResultsImpl();
    }
    

    /**
     * factory method to create a shallow copy FacetResults
     * @param template instance to be copied
     * @return copy instance
     */
    public static FacetResults of(final FacetResults template) {
        FacetResultsImpl instance = new FacetResultsImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of FacetResults
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FacetResults deepCopy(@Nullable final FacetResults template) {
        if (template == null) {
            return null;
        }
        FacetResultsImpl instance = new FacetResultsImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
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
