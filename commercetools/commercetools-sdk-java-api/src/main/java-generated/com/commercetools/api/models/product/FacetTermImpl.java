
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
 * FacetTerm
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetTermImpl implements FacetTerm, ModelBase {

    private java.lang.Object term;

    private Long count;

    private Long productCount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FacetTermImpl(@JsonProperty("term") final java.lang.Object term, @JsonProperty("count") final Long count,
            @JsonProperty("productCount") final Long productCount) {
        this.term = term;
        this.count = count;
        this.productCount = productCount;
    }

    /**
     * create empty instance
     */
    public FacetTermImpl() {
    }

    /**
     *  <p>Value for the field specified in the <span>term facet expression</span> for which at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> could be found.</p>
     */

    public java.lang.Object getTerm() {
        return this.term;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> for which the <code>term</code> applies.</p>
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> for which the <code>term</code> applies. Only available if the <code>counting products</code> <span>extension</span> is enabled.</p>
     */

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

        FacetTermImpl that = (FacetTermImpl) o;

        return new EqualsBuilder().append(term, that.term)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .append(term, that.term)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(term).append(count).append(productCount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("term", term)
                .append("count", count)
                .append("productCount", productCount)
                .build();
    }

    @Override
    public FacetTerm copyDeep() {
        return FacetTerm.deepCopy(this);
    }
}
