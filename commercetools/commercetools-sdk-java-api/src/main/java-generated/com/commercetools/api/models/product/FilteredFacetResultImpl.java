
package com.commercetools.api.models.product;

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
 * FilteredFacetResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FilteredFacetResultImpl implements FilteredFacetResult, ModelBase {

    private com.commercetools.api.models.product.FacetTypes type;

    private Long count;

    private Long productCount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FilteredFacetResultImpl(@JsonProperty("count") final Long count,
            @JsonProperty("productCount") final Long productCount) {
        this.count = count;
        this.productCount = productCount;
        this.type = FacetTypes.findEnum("filter");
    }

    /**
     * create empty instance
     */
    public FilteredFacetResultImpl() {
        this.type = FacetTypes.findEnum("filter");
    }

    /**
     *
     */

    public com.commercetools.api.models.product.FacetTypes getType() {
        return this.type;
    }

    /**
     *  <p>Number of ProductVariants matching the value specified in filtered facet expression.</p>
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Number of Products matching the value specified in filtered facet expression.</p>
     *  <p>Present only if the <code>counting products</code> extension is enabled.</p>
     */

    public Long getProductCount() {
        return this.productCount;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setProductCount(final Long productCount) {
        this.productCount = productCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        FilteredFacetResultImpl that = (FilteredFacetResultImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .append(type, that.type)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(count).append(productCount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("count", count)
                .append("productCount", productCount)
                .build();
    }

}
