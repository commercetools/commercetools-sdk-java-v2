
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetVariantExclusionAction" rel="nofollow">Set Variant Exclusion</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVariantExclusionChangeImpl implements SetVariantExclusionChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Reference product;

    private com.commercetools.history.models.common.ProductVariantExclusion previousValue;

    private com.commercetools.history.models.common.ProductVariantExclusion nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetVariantExclusionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("product") final com.commercetools.history.models.common.Reference product,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ProductVariantExclusion previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ProductVariantExclusion nextValue) {
        this.change = change;
        this.product = product;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_VARIANT_EXCLUSION_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetVariantExclusionChangeImpl() {
        this.type = SET_VARIANT_EXCLUSION_CHANGE;
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
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setProduct(final com.commercetools.history.models.common.Reference product) {
        this.product = product;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ProductVariantExclusion previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ProductVariantExclusion nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetVariantExclusionChangeImpl that = (SetVariantExclusionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(product, that.product)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(product, that.product)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(product)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("product", product)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetVariantExclusionChange copyDeep() {
        return SetVariantExclusionChange.deepCopy(this);
    }
}
