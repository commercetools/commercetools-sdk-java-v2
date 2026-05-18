
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
 *  <p>Change triggered when the Tax Category of a Shipping Method associated with an Order has changed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodTaxCategoryChangeImpl implements SetShippingMethodTaxCategoryChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetShippingMethodTaxCategoryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Reference previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Reference nextValue) {
        this.change = change;
        this.taxMode = taxMode;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_SHIPPING_METHOD_TAX_CATEGORY_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetShippingMethodTaxCategoryChangeImpl() {
        this.type = SET_SHIPPING_METHOD_TAX_CATEGORY_CHANGE;
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
     *  <p>Indicates how Tax Rates are set.</p>
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
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

    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
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

        SetShippingMethodTaxCategoryChangeImpl that = (SetShippingMethodTaxCategoryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(taxMode, that.taxMode)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(taxMode, that.taxMode)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(taxMode)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("taxMode", taxMode)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetShippingMethodTaxCategoryChange copyDeep() {
        return SetShippingMethodTaxCategoryChange.deepCopy(this);
    }
}
