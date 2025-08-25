
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
 * ProductSearchFacetStatsValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetStatsValueImpl implements ProductSearchFacetStatsValue, ModelBase {

    private String name;

    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    private com.commercetools.api.models.search.SearchQuery filter;

    private String field;

    private com.commercetools.api.models.search.SearchFieldType fieldType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetStatsValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("scope") final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope,
            @JsonProperty("filter") final com.commercetools.api.models.search.SearchQuery filter,
            @JsonProperty("field") final String field,
            @JsonProperty("fieldType") final com.commercetools.api.models.search.SearchFieldType fieldType) {
        this.name = name;
        this.scope = scope;
        this.filter = filter;
        this.field = field;
        this.fieldType = fieldType;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetStatsValueImpl() {
    }

    /**
     *  <p>Name of the stats facet to appear in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetResultStats" rel="nofollow">ProductSearchFacetResultStats</a>.</p>
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
     *  <p>Additional filtering expression to apply to the search result before calculating the facet.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getFilter() {
        return this.filter;
    }

    /**
     *  <p>The <span>searchable Product field</span> to facet on.</p>
     */

    public String getField() {
        return this.field;
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

    public void setField(final String field) {
        this.field = field;
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

        ProductSearchFacetStatsValueImpl that = (ProductSearchFacetStatsValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(field, that.field)
                .append(fieldType, that.fieldType)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(field, that.field)
                .append(fieldType, that.fieldType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(scope)
                .append(filter)
                .append(field)
                .append(fieldType)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("filter", filter)
                .append("field", field)
                .append("fieldType", fieldType)
                .build();
    }

    @Override
    public ProductSearchFacetStatsValue copyDeep() {
        return ProductSearchFacetStatsValue.deepCopy(this);
    }
}
