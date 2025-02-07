
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

    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    private com.commercetools.api.models.search.SearchQuery filter;

    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    private String field;

    private java.util.List<String> includes;

    private com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort;

    private Integer limit;

    private String language;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    private String missing;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetDistinctValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("scope") final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope,
            @JsonProperty("filter") final com.commercetools.api.models.search.SearchQuery filter,
            @JsonProperty("level") final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level,
            @JsonProperty("field") final String field, @JsonProperty("includes") final java.util.List<String> includes,
            @JsonProperty("sort") final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort,
            @JsonProperty("limit") final Integer limit, @JsonProperty("language") final String language,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType,
            @JsonProperty("missing") final String missing) {
        this.name = name;
        this.scope = scope;
        this.filter = filter;
        this.level = level;
        this.field = field;
        this.includes = includes;
        this.sort = sort;
        this.limit = limit;
        this.language = language;
        this.fieldType = fieldType;
        this.missing = missing;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetDistinctValueImpl() {
    }

    /**
     *  <p>Name of the distinct facet to appear in the ProductSearchFacetResultBucket.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whether the facet must consider only the Products resulting from the search (<code>query</code>) or all the Products (<code>all</code>).</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum getScope() {
        return this.scope;
    }

    /**
     *  <p>Additional filtering expression to apply to the facet result before calculating the facet.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getFilter() {
        return this.filter;
    }

    /**
     *  <p>Specify whether to count Products (<code>products</code>) or Product Variants (<code>variants</code>).</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum getLevel() {
        return this.level;
    }

    /**
     *  <p>The searchable Product field to facet on.</p>
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
     *  <p>Define how the buckets are sorted.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression getSort() {
        return this.sort;
    }

    /**
     *  <p>Maximum number of buckets to return.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the IETF language tag format, as described in BCP 47. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>If the <code>field</code> is not standard, this must be the Attribute type.</p>
     */

    public com.commercetools.api.models.search.SearchFieldType getFieldType() {
        return this.fieldType;
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

    public void setScope(final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope) {
        this.scope = scope;
    }

    public void setFilter(final com.commercetools.api.models.search.SearchQuery filter) {
        this.filter = filter;
    }

    public void setLevel(final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level) {
        this.level = level;
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

    public void setSort(
            final com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpression sort) {
        this.sort = sort;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setFieldType(final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
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
                .append(level, that.level)
                .append(field, that.field)
                .append(includes, that.includes)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(language, that.language)
                .append(fieldType, that.fieldType)
                .append(missing, that.missing)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(level, that.level)
                .append(field, that.field)
                .append(includes, that.includes)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(language, that.language)
                .append(fieldType, that.fieldType)
                .append(missing, that.missing)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(scope)
                .append(filter)
                .append(level)
                .append(field)
                .append(includes)
                .append(sort)
                .append(limit)
                .append(language)
                .append(fieldType)
                .append(missing)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("filter", filter)
                .append("level", level)
                .append("field", field)
                .append("includes", includes)
                .append("sort", sort)
                .append("limit", limit)
                .append("language", language)
                .append("fieldType", fieldType)
                .append("missing", missing)
                .build();
    }

}
