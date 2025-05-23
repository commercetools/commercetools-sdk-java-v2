
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
 * ProductSearchFacetCountValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetCountValueImpl implements ProductSearchFacetCountValue, ModelBase {

    private String name;

    private com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope;

    private com.commercetools.api.models.search.SearchQuery filter;

    private com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetCountValueImpl(@JsonProperty("name") final String name,
            @JsonProperty("scope") final com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum scope,
            @JsonProperty("filter") final com.commercetools.api.models.search.SearchQuery filter,
            @JsonProperty("level") final com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum level) {
        this.name = name;
        this.scope = scope;
        this.filter = filter;
        this.level = level;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetCountValueImpl() {
    }

    /**
     *  <p>Name of the count facet to appear in the ProductSearchFacetResultCount.</p>
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetCountValueImpl that = (ProductSearchFacetCountValueImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(level, that.level)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(filter, that.filter)
                .append(level, that.level)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(scope).append(filter).append(level).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("filter", filter)
                .append("level", level)
                .build();
    }

    @Override
    public ProductSearchFacetCountValue copyDeep() {
        return ProductSearchFacetCountValue.deepCopy(this);
    }
}
