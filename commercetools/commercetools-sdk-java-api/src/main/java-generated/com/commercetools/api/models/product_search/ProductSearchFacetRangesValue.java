
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.search.SearchFieldType;
import com.commercetools.api.models.search.SearchQuery;
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
     *  <p>Name of the ranges facet to appear in the ProductSearchFacetResultBucket.</p>
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
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @return level
     */

    @JsonProperty("level")
    public ProductSearchFacetCountLevelEnum getLevel();

    /**
     *  <p>The searchable Product field to facet on.</p>
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
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @return fieldType
     */

    @JsonProperty("fieldType")
    public SearchFieldType getFieldType();

    /**
     *  <p>Name of the ranges facet to appear in the ProductSearchFacetResultBucket.</p>
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
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     * @param level value to be set
     */

    public void setLevel(final ProductSearchFacetCountLevelEnum level);

    /**
     *  <p>The searchable Product field to facet on.</p>
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
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     * @param fieldType value to be set
     */

    public void setFieldType(final SearchFieldType fieldType);

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
        instance.setLevel(template.getLevel());
        instance.setField(template.getField());
        instance.setRanges(template.getRanges());
        instance.setLanguage(template.getLanguage());
        instance.setFieldType(template.getFieldType());
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
        instance.setFilter(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getFilter()));
        instance.setLevel(template.getLevel());
        instance.setField(template.getField());
        instance.setRanges(Optional.ofNullable(template.getRanges())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLanguage(template.getLanguage());
        instance.setFieldType(template.getFieldType());
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
