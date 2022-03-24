
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodTaxAmountChangeValueImpl implements ShippingMethodTaxAmountChangeValue, ModelBase {

    private com.commercetools.history.models.common.TaxedPrice taxedPrice;

    private com.commercetools.history.models.common.TaxRate taxRate;

    @JsonCreator
    ShippingMethodTaxAmountChangeValueImpl(
            @JsonProperty("taxedPrice") final com.commercetools.history.models.common.TaxedPrice taxedPrice,
            @JsonProperty("taxRate") final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxedPrice = taxedPrice;
        this.taxRate = taxRate;
    }

    public ShippingMethodTaxAmountChangeValueImpl() {
    }

    public com.commercetools.history.models.common.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public void setTaxedPrice(final com.commercetools.history.models.common.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxRate(final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodTaxAmountChangeValueImpl that = (ShippingMethodTaxAmountChangeValueImpl) o;

        return new EqualsBuilder().append(taxedPrice, that.taxedPrice).append(taxRate, that.taxRate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(taxedPrice).append(taxRate).toHashCode();
    }

}
