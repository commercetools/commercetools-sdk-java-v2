
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FilteredFacetResultImpl implements FilteredFacetResult {

    private com.commercetools.api.models.product.FacetTypes type;

    private Long count;

    private Long productCount;

    @JsonCreator
    FilteredFacetResultImpl(@JsonProperty("count") final Long count,
            @JsonProperty("productCount") final Long productCount) {
        this.count = count;
        this.productCount = productCount;
        this.type = FacetTypes.findEnum("filter");
    }

    public FilteredFacetResultImpl() {
        this.type = FacetTypes.findEnum("filter");
    }

    public com.commercetools.api.models.product.FacetTypes getType() {
        return this.type;
    }

    public Long getCount() {
        return this.count;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(count).append(productCount).toHashCode();
    }

}
