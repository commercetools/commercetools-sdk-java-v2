
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetTerm
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetTerm facetTerm = FacetTerm.builder()
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FacetTermImpl.class)
public interface FacetTerm {

    /**
     *
     * @return term
     */
    @NotNull
    @JsonProperty("term")
    public Object getTerm();

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     * set term
     * @param term value to be set
     */

    public void setTerm(final Object term);

    /**
     * set count
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * set productCount
     * @param productCount value to be set
     */

    public void setProductCount(final Long productCount);

    /**
     * factory method
     * @return instance of FacetTerm
     */
    public static FacetTerm of() {
        return new FacetTermImpl();
    }

    /**
     * factory method to copy an instance of FacetTerm
     * @param template instance to be copied
     * @return copy instance
     */
    public static FacetTerm of(final FacetTerm template) {
        FacetTermImpl instance = new FacetTermImpl();
        instance.setTerm(template.getTerm());
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    /**
     * builder factory method for FacetTerm
     * @return builder
     */
    public static FacetTermBuilder builder() {
        return FacetTermBuilder.of();
    }

    /**
     * create builder for FacetTerm instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FacetTermBuilder builder(final FacetTerm template) {
        return FacetTermBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFacetTerm(Function<FacetTerm, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FacetTerm> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetTerm>() {
            @Override
            public String toString() {
                return "TypeReference<FacetTerm>";
            }
        };
    }
}
