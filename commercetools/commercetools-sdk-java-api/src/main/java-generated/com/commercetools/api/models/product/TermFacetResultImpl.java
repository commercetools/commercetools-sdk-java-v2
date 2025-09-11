
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
     *  <p>Data type to which the facet is applied.</p>
     */

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> that have no value for the specified <span>term facet expression</span>.</p>
     */

    public Long getMissing() {
        return this.missing;
    }

    /**
     *  <p>Number of terms matching the <span>term facet expression</span>.</p>
     *  <ul>
     *   <li>If the expression refers to Product fields like <code>categories.id</code> and <code>reviewRatingStatistics.count</code>, the value represents the number of Products.</li>
     *   <li>If the expression is defined for fields specific to Product Variants, for example, <code>variants.attributes.{name}</code>, the value represents the number of Product Variants matching the expression.</li>
     *  </ul>
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of terms not represented in this object (such as the number of terms beyond the <span>limit</span>).</p>
     */

    public Long getOther() {
        return this.other;
    }

    /**
     *  <p>Values for the field specified in <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     *  <p>By default, facet terms are returned in a descending order of their <code>count</code>.</p>
     *  <p>If the term facet expression specifies to count <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> through the <code>counting products</code> <span>extension</span>, then facet terms are returned in a descending order of their <code>productCount</code>.</p>
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

    @Override
    public TermFacetResult copyDeep() {
        return TermFacetResult.deepCopy(this);
    }
}
