
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     *  <p>Value for the field specified in the term facet expression for which at least one ProductVariant could be found.</p>
     * @return term
     */
    @NotNull
    @JsonProperty("term")
    public Object getTerm();

    /**
     *  <p>Number of ProductVariants for which the <code>term</code> applies.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Number of Products for which the <code>term</code> applies. Only available if the <code>counting products</code> extension is enabled.</p>
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     *  <p>Value for the field specified in the term facet expression for which at least one ProductVariant could be found.</p>
     * @param term value to be set
     */

    public void setTerm(final Object term);

    /**
     *  <p>Number of ProductVariants for which the <code>term</code> applies.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Number of Products for which the <code>term</code> applies. Only available if the <code>counting products</code> extension is enabled.</p>
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
     * factory method to create a shallow copy FacetTerm
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

    public FacetTerm copyDeep();

    /**
     * factory method to create a deep copy of FacetTerm
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FacetTerm deepCopy(@Nullable final FacetTerm template) {
        if (template == null) {
            return null;
        }
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
