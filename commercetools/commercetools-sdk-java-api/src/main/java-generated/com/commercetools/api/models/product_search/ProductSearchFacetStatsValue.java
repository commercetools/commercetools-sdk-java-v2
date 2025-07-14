
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.search.SearchFieldType;
import com.commercetools.api.models.search.SearchQuery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchFacetStatsValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetStatsValue productSearchFacetStatsValue = ProductSearchFacetStatsValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetStatsValueImpl.class)
public interface ProductSearchFacetStatsValue {

    /**
     *  <p>Name of the stats facet to appear in the ProductSearchFacetResultStats.</p>
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
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public SearchQuery getFilter();

    /**
     *  <p>The searchable Product field to facet on.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @return fieldType
     */

    @JsonProperty("fieldType")
    public SearchFieldType getFieldType();

    /**
     *  <p>Name of the stats facet to appear in the ProductSearchFacetResultStats.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     */

    public void setScope(final ProductSearchFacetScopeEnum scope);

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param filter value to be set
     */

    public void setFilter(final SearchQuery filter);

    /**
     *  <p>The searchable Product field to facet on.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @param fieldType value to be set
     */

    public void setFieldType(final SearchFieldType fieldType);

    /**
     * factory method
     * @return instance of ProductSearchFacetStatsValue
     */
    public static ProductSearchFacetStatsValue of() {
        return new ProductSearchFacetStatsValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetStatsValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetStatsValue of(final ProductSearchFacetStatsValue template) {
        ProductSearchFacetStatsValueImpl instance = new ProductSearchFacetStatsValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(template.getFilter());
        instance.setField(template.getField());
        instance.setFieldType(template.getFieldType());
        return instance;
    }

    public ProductSearchFacetStatsValue copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetStatsValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetStatsValue deepCopy(@Nullable final ProductSearchFacetStatsValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetStatsValueImpl instance = new ProductSearchFacetStatsValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getFilter()));
        instance.setField(template.getField());
        instance.setFieldType(template.getFieldType());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetStatsValue
     * @return builder
     */
    public static ProductSearchFacetStatsValueBuilder builder() {
        return ProductSearchFacetStatsValueBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetStatsValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetStatsValueBuilder builder(final ProductSearchFacetStatsValue template) {
        return ProductSearchFacetStatsValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetStatsValue(Function<ProductSearchFacetStatsValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetStatsValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetStatsValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetStatsValue>";
            }
        };
    }
}
