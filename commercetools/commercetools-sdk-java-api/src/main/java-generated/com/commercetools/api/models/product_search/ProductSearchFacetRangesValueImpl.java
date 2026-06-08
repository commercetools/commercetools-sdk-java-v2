
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
 * ProductSearchFacetRangesValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesValueImpl implements ProductSearchFacetRangesValue, ModelBase {

    private String name;

    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    private com.commercetools.api.models.search.SearchQuery filter;

    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    private String field;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> ranges;

    private String language;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetRangesValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("scope") final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope,
            @JsonProperty("filter") final com.commercetools.api.models.search.SearchQuery filter,
            @JsonProperty("level") final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level,
            @JsonProperty("field") final String field,
            @JsonProperty("ranges") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> ranges,
            @JsonProperty("language") final String language,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.name = name;
        this.scope = scope;
        this.filter = filter;
        this.level = level;
        this.field = field;
        this.ranges = ranges;
        this.language = language;
        this.fieldType = fieldType;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetRangesValueImpl() {
    }

    /**
     *  <p>Name of the ranges facet to appear in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetResultBucket" rel="nofollow">ProductSearchFacetResultBucket</a>.</p>
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
     *  <p>The <span>searchable Product field</span> to facet on.</p>
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Define ranges for the facet.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> getRanges() {
        return this.ranges;
    }

    /**
     *  <p>String value specifying linguistic and regional preferences using the <span>IETF language tag format</span>, as described in <span>BCP 47</span>. The format combines language, script, and region using hyphen-separated subtags. For example: <code>en</code>, <code>en-US</code>, <code>zh-Hans-SG</code>.</p>
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

    public void setRanges(
            final com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange... ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
    }

    public void setRanges(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRange> ranges) {
        this.ranges = ranges;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setFieldType(final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetRangesValueImpl that = (ProductSearchFacetRangesValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(level, that.level)
                .append(field, that.field)
                .append(ranges, that.ranges)
                .append(language, that.language)
                .append(fieldType, that.fieldType)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(level, that.level)
                .append(field, that.field)
                .append(ranges, that.ranges)
                .append(language, that.language)
                .append(fieldType, that.fieldType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(scope)
                .append(filter)
                .append(level)
                .append(field)
                .append(ranges)
                .append(language)
                .append(fieldType)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("filter", filter)
                .append("level", level)
                .append("field", field)
                .append("ranges", ranges)
                .append("language", language)
                .append("fieldType", fieldType)
                .build();
    }

    @Override
    public ProductSearchFacetRangesValue copyDeep() {
        return ProductSearchFacetRangesValue.deepCopy(this);
    }
}
