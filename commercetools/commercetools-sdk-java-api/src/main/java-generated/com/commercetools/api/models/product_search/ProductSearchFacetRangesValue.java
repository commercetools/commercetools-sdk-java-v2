
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetRangesValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesValue productSearchFacetRangesValue = ProductSearchFacetRangesValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .plusRanges(rangesBuilder -> rangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetRangesValueImpl.class)
public interface ProductSearchFacetRangesValue {

    /**
     *  <p>Name to assign the ranges facet.</p>
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
     *  <p>Define ranges for the facet.</p>
     * @return ranges
     */
    @NotNull
    @Valid
    @JsonProperty("ranges")
    public List<ProductSearchFacetRangesFacetRange> getRanges();

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
     *  <p>Name to assign the ranges facet.</p>
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
     *  <p>Define ranges for the facet.</p>
     * @param ranges values to be set
     */

    @JsonIgnore
    public void setRanges(final ProductSearchFacetRangesFacetRange... ranges);

    /**
     *  <p>Define ranges for the facet.</p>
     * @param ranges values to be set
     */

    public void setRanges(final List<ProductSearchFacetRangesFacetRange> ranges);

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
     * factory method
     * @return instance of ProductSearchFacetRangesValue
     */
    public static ProductSearchFacetRangesValue of() {
        return new ProductSearchFacetRangesValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetRangesValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetRangesValue of(final ProductSearchFacetRangesValue template) {
        ProductSearchFacetRangesValueImpl instance = new ProductSearchFacetRangesValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(template.getFilter());
        instance.setCount(template.getCount());
        instance.setField(template.getField());
        instance.setRanges(template.getRanges());
        instance.setLanguage(template.getLanguage());
        instance.setAttributeType(template.getAttributeType());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetRangesValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetRangesValue deepCopy(@Nullable final ProductSearchFacetRangesValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetRangesValueImpl instance = new ProductSearchFacetRangesValueImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setFilter(
            com.commercetools.api.models.product_search.ProductSearchQuery.deepCopy(template.getFilter()));
        instance.setCount(template.getCount());
        instance.setField(template.getField());
        instance.setRanges(Optional.ofNullable(template.getRanges())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLanguage(template.getLanguage());
        instance.setAttributeType(template.getAttributeType());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetRangesValue
     * @return builder
     */
    public static ProductSearchFacetRangesValueBuilder builder() {
        return ProductSearchFacetRangesValueBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetRangesValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesValueBuilder builder(final ProductSearchFacetRangesValue template) {
        return ProductSearchFacetRangesValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetRangesValue(Function<ProductSearchFacetRangesValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetRangesValue>";
            }
        };
    }
}
