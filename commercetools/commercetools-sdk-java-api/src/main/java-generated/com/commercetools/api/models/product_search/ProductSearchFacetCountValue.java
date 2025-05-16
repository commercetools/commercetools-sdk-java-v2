
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.search.SearchQuery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchFacetCountValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetCountValue productSearchFacetCountValue = ProductSearchFacetCountValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetCountValueImpl.class)
public interface ProductSearchFacetCountValue {

    /**
     *  <p>Name of the count facet to appear in the ProductSearchFacetResultCount.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @return scope
     */

    @JsonProperty("scope")
    public ProductSearchFacetScopeEnum getScope();

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public SearchQuery getFilter();

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @return level
     */

    @JsonProperty("level")
    public ProductSearchFacetCountLevelEnum getLevel();

    /**
     *  <p>Name of the count facet to appear in the ProductSearchFacetResultCount.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     */

    public void setScope(final ProductSearchFacetScopeEnum scope);

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     * @param filter value to be set
     */

    public void setFilter(final SearchQuery filter);

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param level value to be set
     */

    public void setLevel(final ProductSearchFacetCountLevelEnum level);

    /**
     * factory method
     * @return instance of ProductSearchFacetCountValue
     */
    public static ProductSearchFacetCountValue of() {
        return new ProductSearchFacetCountValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetCountValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetCountValue of(final ProductSearchFacetCountValue template) {
        ProductSearchFacetCountValueImpl instance = new ProductSearchFacetCountValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(template.getFilter());
        instance.setLevel(template.getLevel());
        return instance;
    }

    public ProductSearchFacetCountValue copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetCountValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetCountValue deepCopy(@Nullable final ProductSearchFacetCountValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetCountValueImpl instance = new ProductSearchFacetCountValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getFilter()));
        instance.setLevel(template.getLevel());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetCountValue
     * @return builder
     */
    public static ProductSearchFacetCountValueBuilder builder() {
        return ProductSearchFacetCountValueBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetCountValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetCountValueBuilder builder(final ProductSearchFacetCountValue template) {
        return ProductSearchFacetCountValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetCountValue(Function<ProductSearchFacetCountValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetCountValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetCountValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetCountValue>";
            }
        };
    }
}
