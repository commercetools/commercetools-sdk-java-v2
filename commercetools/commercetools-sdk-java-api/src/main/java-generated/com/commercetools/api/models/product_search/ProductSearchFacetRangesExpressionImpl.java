
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
 * ProductSearchFacetRangesExpression
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesExpressionImpl implements ProductSearchFacetRangesExpression, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchFacetRangesValue ranges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetRangesExpressionImpl(
            @JsonProperty("ranges") final com.commercetools.api.models.product_search.ProductSearchFacetRangesValue ranges) {
        this.ranges = ranges;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetRangesExpressionImpl() {
    }

    /**
     *  <p>Definition of the ranges facet.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchFacetRangesValue getRanges() {
        return this.ranges;
    }

    public void setRanges(final com.commercetools.api.models.product_search.ProductSearchFacetRangesValue ranges) {
        this.ranges = ranges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetRangesExpressionImpl that = (ProductSearchFacetRangesExpressionImpl) o;

        return new EqualsBuilder().append(ranges, that.ranges).append(ranges, that.ranges).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(ranges).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("ranges", ranges).build();
    }

}
