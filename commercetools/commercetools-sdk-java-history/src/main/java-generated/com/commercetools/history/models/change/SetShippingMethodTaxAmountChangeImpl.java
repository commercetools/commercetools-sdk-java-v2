
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
 *  <p>Change triggered by the Set ShippingMethod TaxAmount update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodTaxAmountChangeImpl implements SetShippingMethodTaxAmountChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue;

    private com.commercetools.history.models.common.TaxMode taxMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetShippingMethodTaxAmountChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue,
            @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.taxMode = taxMode;
        this.type = SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetShippingMethodTaxAmountChangeImpl() {
        this.type = SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>"ExternalAmount"</code></p>
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetShippingMethodTaxAmountChangeImpl that = (SetShippingMethodTaxAmountChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(taxMode, that.taxMode)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(taxMode, that.taxMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(taxMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("taxMode", taxMode)
                .build();
    }

}
