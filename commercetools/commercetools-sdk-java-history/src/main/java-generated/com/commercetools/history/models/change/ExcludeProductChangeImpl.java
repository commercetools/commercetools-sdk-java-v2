
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExcludeProductChangeImpl implements ExcludeProductChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ProductVariantExclusion variantExclusion;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExcludeProductChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("variantExclusion") final com.commercetools.history.models.common.ProductVariantExclusion variantExclusion,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Reference nextValue) {
        this.change = change;
        this.variantExclusion = variantExclusion;
        this.nextValue = nextValue;
        this.type = EXCLUDE_PRODUCT_CHANGE;
    }

    /**
     * create empty instance
     */
    public ExcludeProductChangeImpl() {
        this.type = EXCLUDE_PRODUCT_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setVariantExclusion(
            final com.commercetools.history.models.common.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
    }

    public void setNextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExcludeProductChangeImpl that = (ExcludeProductChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(variantExclusion, that.variantExclusion)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(variantExclusion, that.variantExclusion)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(variantExclusion)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("variantExclusion", variantExclusion)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ExcludeProductChange copyDeep() {
        return ExcludeProductChange.deepCopy(this);
    }
}
