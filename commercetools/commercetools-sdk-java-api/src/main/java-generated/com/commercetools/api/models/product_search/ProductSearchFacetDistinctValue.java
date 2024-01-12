
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetDistinctValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctValue productSearchFacetDistinctValue = ProductSearchFacetDistinctValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetDistinctValueImpl.class)
public interface ProductSearchFacetDistinctValue {

    /**
     *  <p>Name of the count facet.</p>
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
    public ProductSearchFacetEnumScope getScope();

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @return filter
     */
    @Valid
    @JsonProperty("filter")
    public ProductSearchQuery getFilter();

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @return count
     */

    @JsonProperty("count")
    public ProductSearchFacetEnumCount getCount();

    /**
     *  <p>The field to facet on. Can be any searchable field on the Product.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @return includes
     */

    @JsonProperty("includes")
    public List<String> getIncludes();

    /**
     *  <p>Filter bucket keys in the facet results by the start of the key.</p>
     * @return startsWith
     */
    @Valid
    @JsonProperty("startsWith")
    public ProductSearchFacetDistinctStartsWith getStartsWith();

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @return sort
     */
    @Valid
    @JsonProperty("sort")
    public ProductSearchFacetDistinctBucketSortExpression getSort();

    /**
     *  <p>Maximum number of buckets to return.</p>
     * @return size
     */

    @JsonProperty("size")
    public Integer getSize();

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>If the <code>field</code> is an Attribute, this must be the Attribute type.</p>
     * @return attributeType
     */

    @JsonProperty("attributeType")
    public ProductSearchAttributeType getAttributeType();

    /**
     *  <p>Default value to use if the specified field is not present on some Products.</p>
     * @return missing
     */

    @JsonProperty("missing")
    public String getMissing();

    /**
     *  <p>Name of the count facet.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     * @param scope value to be set
     */

    public void setScope(final ProductSearchFacetEnumScope scope);

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     * @param filter value to be set
     */

    public void setFilter(final ProductSearchQuery filter);

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param count value to be set
     */

    public void setCount(final ProductSearchFacetEnumCount count);

    /**
     *  <p>The field to facet on. Can be any searchable field on the Product.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @param includes values to be set
     */

    @JsonIgnore
    public void setIncludes(final String... includes);

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     * @param includes values to be set
     */

    public void setIncludes(final List<String> includes);

    /**
     *  <p>Filter bucket keys in the facet results by the start of the key.</p>
     * @param startsWith value to be set
     */

    public void setStartsWith(final ProductSearchFacetDistinctStartsWith startsWith);

    /**
     *  <p>Define how the buckets are sorted.</p>
     * @param sort value to be set
     */

    public void setSort(final ProductSearchFacetDistinctBucketSortExpression sort);

    /**
     *  <p>Maximum number of buckets to return.</p>
     * @param size value to be set
     */

    public void setSize(final Integer size);

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     *  <p>If the <code>field</code> is an Attribute, this must be the Attribute type.</p>
     * @param attributeType value to be set
     */

    public void setAttributeType(final ProductSearchAttributeType attributeType);

    /**
     *  <p>Default value to use if the specified field is not present on some Products.</p>
     * @param missing value to be set
     */

    public void setMissing(final String missing);

    /**
     * factory method
     * @return instance of ProductSearchFacetDistinctValue
     */
    public static ProductSearchFacetDistinctValue of() {
        return new ProductSearchFacetDistinctValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetDistinctValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetDistinctValue of(final ProductSearchFacetDistinctValue template) {
        ProductSearchFacetDistinctValueImpl instance = new ProductSearchFacetDistinctValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(template.getFilter());
        instance.setCount(template.getCount());
        instance.setField(template.getField());
        instance.setIncludes(template.getIncludes());
        instance.setStartsWith(template.getStartsWith());
        instance.setSort(template.getSort());
        instance.setSize(template.getSize());
        instance.setLanguage(template.getLanguage());
        instance.setAttributeType(template.getAttributeType());
        instance.setMissing(template.getMissing());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetDistinctValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetDistinctValue deepCopy(@Nullable final ProductSearchFacetDistinctValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetDistinctValueImpl instance = new ProductSearchFacetDistinctValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(
            com.commercetools.api.models.product_search.ProductSearchQuery.deepCopy(template.getFilter()));
        instance.setCount(template.getCount());
        instance.setField(template.getField());
        instance.setIncludes(Optional.ofNullable(template.getIncludes()).map(ArrayList::new).orElse(null));
        instance.setStartsWith(com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWith
                .deepCopy(template.getStartsWith()));
        instance.setSort(com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression
                .deepCopy(template.getSort()));
        instance.setSize(template.getSize());
        instance.setLanguage(template.getLanguage());
        instance.setAttributeType(template.getAttributeType());
        instance.setMissing(template.getMissing());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetDistinctValue
     * @return builder
     */
    public static ProductSearchFacetDistinctValueBuilder builder() {
        return ProductSearchFacetDistinctValueBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetDistinctValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctValueBuilder builder(final ProductSearchFacetDistinctValue template) {
        return ProductSearchFacetDistinctValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetDistinctValue(Function<ProductSearchFacetDistinctValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetDistinctValue>";
            }
        };
    }
}
