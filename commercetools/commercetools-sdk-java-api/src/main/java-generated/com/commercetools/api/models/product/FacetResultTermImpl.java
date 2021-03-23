
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
public final class FacetResultTermImpl implements FacetResultTerm {

    private java.lang.Object term;

    private Long count;

    private Long productCount;

    @JsonCreator
    FacetResultTermImpl(@JsonProperty("term") final java.lang.Object term, @JsonProperty("count") final Long count,
            @JsonProperty("productCount") final Long productCount) {
        this.term = term;
        this.count = count;
        this.productCount = productCount;
    }

    public FacetResultTermImpl() {
    }

    public java.lang.Object getTerm() {
        return this.term;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getProductCount() {
        return this.productCount;
    }

    public void setTerm(final java.lang.Object term) {
        this.term = term;
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

        FacetResultTermImpl that = (FacetResultTermImpl) o;

        return new EqualsBuilder().append(term, that.term)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(term).append(count).append(productCount).toHashCode();
    }

}
