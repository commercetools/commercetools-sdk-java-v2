
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
 * TermFacetResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TermFacetResultImpl implements TermFacetResult, ModelBase {

    private com.commercetools.api.models.product.FacetTypes type;

    private com.commercetools.api.models.product.TermFacetResultType dataType;

    private Long missing;

    private Long total;

    private Long other;

    private java.util.List<com.commercetools.api.models.product.FacetTerm> terms;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TermFacetResultImpl(
            @JsonProperty("dataType") final com.commercetools.api.models.product.TermFacetResultType dataType,
            @JsonProperty("missing") final Long missing, @JsonProperty("total") final Long total,
            @JsonProperty("other") final Long other,
            @JsonProperty("terms") final java.util.List<com.commercetools.api.models.product.FacetTerm> terms) {
        this.dataType = dataType;
        this.missing = missing;
        this.total = total;
        this.other = other;
        this.terms = terms;
        this.type = FacetTypes.findEnum("terms");
    }

    /**
     * create empty instance
     */
    public TermFacetResultImpl() {
        this.type = FacetTypes.findEnum("terms");
    }

    /**
     *
     */

    public com.commercetools.api.models.product.FacetTypes getType() {
        return this.type;
    }

    /**
     *
     */

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    /**
     *
     */

    public Long getMissing() {
        return this.missing;
    }

    /**
     *
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *
     */

    public Long getOther() {
        return this.other;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product.FacetTerm> getTerms() {
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

    public void setTerms(final com.commercetools.api.models.product.FacetTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
    }

    public void setTerms(final java.util.List<com.commercetools.api.models.product.FacetTerm> terms) {
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
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("dataType", dataType)
                .append("missing", missing)
                .append("total", total)
                .append("other", other)
                .append("terms", terms)
                .build();
    }

}
