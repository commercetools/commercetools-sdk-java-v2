
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
public final class TermFacetResultImpl implements TermFacetResult {

    private com.commercetools.api.models.product.FacetTypes type;

    private com.commercetools.api.models.product.TermFacetResultType dataType;

    private Long missing;

    private Long total;

    private Long other;

    private java.util.List<com.commercetools.api.models.product.FacetResultTerm> terms;

    @JsonCreator
    TermFacetResultImpl(
            @JsonProperty("dataType") final com.commercetools.api.models.product.TermFacetResultType dataType,
            @JsonProperty("missing") final Long missing, @JsonProperty("total") final Long total,
            @JsonProperty("other") final Long other,
            @JsonProperty("terms") final java.util.List<com.commercetools.api.models.product.FacetResultTerm> terms) {
        this.dataType = dataType;
        this.missing = missing;
        this.total = total;
        this.other = other;
        this.terms = terms;
        this.type = FacetTypes.findEnum("terms");
    }

    public TermFacetResultImpl() {
        this.type = FacetTypes.findEnum("terms");
    }

    public com.commercetools.api.models.product.FacetTypes getType() {
        return this.type;
    }

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    public Long getMissing() {
        return this.missing;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOther() {
        return this.other;
    }

    public java.util.List<com.commercetools.api.models.product.FacetResultTerm> getTerms() {
        return this.terms;
    }

    public void setDataType(final com.commercetools.api.models.product.TermFacetResultType dataType) {
        this.dataType = dataType;
    }

    public void setMissing(final Long missing) {
        this.missing = missing;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOther(final Long other) {
        this.other = other;
    }

    public void setTerms(final com.commercetools.api.models.product.FacetResultTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
    }

    public void setTerms(final java.util.List<com.commercetools.api.models.product.FacetResultTerm> terms) {
        this.terms = terms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TermFacetResultImpl that = (TermFacetResultImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(dataType, that.dataType)
                .append(missing, that.missing)
                .append(total, that.total)
                .append(other, that.other)
                .append(terms, that.terms)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(dataType)
                .append(missing)
                .append(total)
                .append(other)
                .append(terms)
                .toHashCode();
    }

}
