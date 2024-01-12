
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctStartsWith
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctStartsWith productSearchFacetDistinctStartsWith = ProductSearchFacetDistinctStartsWith.builder()
 *             .value("{value}")
 *             .caseInsensitive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetDistinctStartsWithImpl.class)
public interface ProductSearchFacetDistinctStartsWith {

    /**
     *  <p>Text to match against the start of the target value.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>If <code>true</code>, the <code>value</code> is not case sensitive.</p>
     * @return caseInsensitive
     */
    @NotNull
    @JsonProperty("caseInsensitive")
    public Boolean getCaseInsensitive();

    /**
     *  <p>Text to match against the start of the target value.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     *  <p>If <code>true</code>, the <code>value</code> is not case sensitive.</p>
     * @param caseInsensitive value to be set
     */

    public void setCaseInsensitive(final Boolean caseInsensitive);

    /**
     * factory method
     * @return instance of ProductSearchFacetDistinctStartsWith
     */
    public static ProductSearchFacetDistinctStartsWith of() {
        return new ProductSearchFacetDistinctStartsWithImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetDistinctStartsWith
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetDistinctStartsWith of(final ProductSearchFacetDistinctStartsWith template) {
        ProductSearchFacetDistinctStartsWithImpl instance = new ProductSearchFacetDistinctStartsWithImpl();
        instance.setValue(template.getValue());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetDistinctStartsWith
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetDistinctStartsWith deepCopy(
            @Nullable final ProductSearchFacetDistinctStartsWith template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetDistinctStartsWithImpl instance = new ProductSearchFacetDistinctStartsWithImpl();
        instance.setValue(template.getValue());
        instance.setCaseInsensitive(template.getCaseInsensitive());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetDistinctStartsWith
     * @return builder
     */
    public static ProductSearchFacetDistinctStartsWithBuilder builder() {
        return ProductSearchFacetDistinctStartsWithBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetDistinctStartsWith instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctStartsWithBuilder builder(
            final ProductSearchFacetDistinctStartsWith template) {
        return ProductSearchFacetDistinctStartsWithBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetDistinctStartsWith(Function<ProductSearchFacetDistinctStartsWith, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctStartsWith> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctStartsWith>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetDistinctStartsWith>";
            }
        };
    }
}
