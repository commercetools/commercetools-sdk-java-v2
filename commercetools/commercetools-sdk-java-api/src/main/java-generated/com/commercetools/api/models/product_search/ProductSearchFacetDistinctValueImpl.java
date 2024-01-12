
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductSearchFacetDistinctValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetDistinctValueImpl implements ProductSearchFacetDistinctValue, ModelBase {

    private String name;

    private com.commercetools.api.models.product_search.ProductSearchFacetEnumScope scope;

    private com.commercetools.api.models.product_search.ProductSearchQuery filter;

    private com.commercetools.api.models.product_search.ProductSearchFacetEnumCount count;

    private String field;

    private java.util.List<String> includes;

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWith startsWith;

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort;

    private Integer size;

    private String language;

    private com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType;

    private String missing;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetDistinctValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("scope") final com.commercetools.api.models.product_search.ProductSearchFacetEnumScope scope,
            @JsonProperty("filter") final com.commercetools.api.models.product_search.ProductSearchQuery filter,
            @JsonProperty("count") final com.commercetools.api.models.product_search.ProductSearchFacetEnumCount count,
            @JsonProperty("field") final String field, @JsonProperty("includes") final java.util.List<String> includes,
            @JsonProperty("startsWith") final com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWith startsWith,
            @JsonProperty("sort") final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort,
            @JsonProperty("size") final Integer size, @JsonProperty("language") final String language,
            @JsonProperty("attributeType") final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType,
            @JsonProperty("missing") final String missing) {
        this.name = name;
        this.scope = scope;
        this.filter = filter;
        this.count = count;
        this.field = field;
        this.includes = includes;
        this.startsWith = startsWith;
        this.sort = sort;
        this.size = size;
        this.language = language;
        this.attributeType = attributeType;
        this.missing = missing;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetDistinctValueImpl() {
    }

    /**
     *  <p>Name of the count facet.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetEnumScope getScope() {
        return this.scope;
    }

    /**
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchQuery getFilter() {
        return this.filter;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetEnumCount getCount() {
        return this.count;
    }

    /**
     *  <p>The field to facet on. Can be any searchable field on the Product.</p>
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Specify which bucket keys the facets results should include.</p>
     */

    public java.util.List<String> getIncludes() {
        return this.includes;
    }

    /**
     *  <p>Filter bucket keys in the facet results by the start of the key.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWith getStartsWith() {
        return this.startsWith;
    }

    /**
     *  <p>Define how the buckets are sorted.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression getSort() {
        return this.sort;
    }

    /**
     *  <p>Maximum number of buckets to return.</p>
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>If the <code>field</code> is an Attribute, this must be the Attribute type.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchAttributeType getAttributeType() {
        return this.attributeType;
    }

    /**
     *  <p>Default value to use if the specified field is not present on some Products.</p>
     */

    public String getMissing() {
        return this.missing;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setScope(final com.commercetools.api.models.product_search.ProductSearchFacetEnumScope scope) {
        this.scope = scope;
    }

    public void setFilter(final com.commercetools.api.models.product_search.ProductSearchQuery filter) {
        this.filter = filter;
    }

    public void setCount(final com.commercetools.api.models.product_search.ProductSearchFacetEnumCount count) {
        this.count = count;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setIncludes(final String... includes) {
        this.includes = new ArrayList<>(Arrays.asList(includes));
    }

    public void setIncludes(final java.util.List<String> includes) {
        this.includes = includes;
    }

    public void setStartsWith(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWith startsWith) {
        this.startsWith = startsWith;
    }

    public void setSort(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort) {
        this.sort = sort;
    }

    public void setSize(final Integer size) {
        this.size = size;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setAttributeType(
            final com.commercetools.api.models.product_search.ProductSearchAttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public void setMissing(final String missing) {
        this.missing = missing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetDistinctValueImpl that = (ProductSearchFacetDistinctValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(count, that.count)
                .append(field, that.field)
                .append(includes, that.includes)
                .append(startsWith, that.startsWith)
                .append(sort, that.sort)
                .append(size, that.size)
                .append(language, that.language)
                .append(attributeType, that.attributeType)
                .append(missing, that.missing)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(count, that.count)
                .append(field, that.field)
                .append(includes, that.includes)
                .append(startsWith, that.startsWith)
                .append(sort, that.sort)
                .append(size, that.size)
                .append(language, that.language)
                .append(attributeType, that.attributeType)
                .append(missing, that.missing)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(scope)
                .append(filter)
                .append(count)
                .append(field)
                .append(includes)
                .append(startsWith)
                .append(sort)
                .append(size)
                .append(language)
                .append(attributeType)
                .append(missing)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("filter", filter)
                .append("count", count)
                .append("field", field)
                .append("includes", includes)
                .append("startsWith", startsWith)
                .append("sort", sort)
                .append("size", size)
                .append("language", language)
                .append("attributeType", attributeType)
                .append("missing", missing)
                .build();
    }

}
