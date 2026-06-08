
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
 * ProductSearchFacetStatsExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetStatsExpressionImpl implements ProductSearchFacetStatsExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFacetStatsValue stats;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetStatsExpressionImpl(
            @JsonProperty("stats") final com.commercetools.api.models.product_search.ProductSearchFacetStatsValue stats) {
        this.stats = stats;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetStatsExpressionImpl() {
    }

    /**
     *  <p>Definition of the stats facet.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetStatsValue getStats() {
        return this.stats;
    }

    public void setStats(final com.commercetools.api.models.product_search.ProductSearchFacetStatsValue stats) {
        this.stats = stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetStatsExpressionImpl that = (ProductSearchFacetStatsExpressionImpl) o;

        return new EqualsBuilder().append(stats, that.stats).append(stats, that.stats).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(stats).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("stats", stats).build();
    }

    @Override
    public ProductSearchFacetStatsExpression copyDeep() {
        return ProductSearchFacetStatsExpression.deepCopy(this);
    }
}
