
package com.commercetools.api.models.cart;

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
public class TaxedPriceImpl implements TaxedPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney totalNet;

    private com.commercetools.api.models.common.TypedMoney totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

    private com.commercetools.api.models.common.TypedMoney totalTax;

    @JsonCreator
    TaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.TypedMoney totalNet,
            @JsonProperty("totalGross") final com.commercetools.api.models.common.TypedMoney totalGross,
            @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions,
            @JsonProperty("totalTax") final com.commercetools.api.models.common.TypedMoney totalTax) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
        this.totalTax = totalTax;
    }

    public TaxedPriceImpl() {
    }

    public com.commercetools.api.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    /**
    *  <p>TaxedPrice fields that can be used in query predicates: <code>totalNet</code>, <code>totalGross</code>.</p>
    */
    public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions() {
        return this.taxPortions;
    }

    /**
    *  <p>Platform-calculated value as subtraction of <code>totalGross</code> - <code>totalNet</code>.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getTotalTax() {
        return this.totalTax;
    }

    public void setTotalNet(final com.commercetools.api.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
    }

    public void setTaxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
    }

    public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
    }

    public void setTotalTax(final com.commercetools.api.models.common.TypedMoney totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxedPriceImpl that = (TaxedPriceImpl) o;

        return new EqualsBuilder().append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .append(taxPortions, that.taxPortions)
                .append(totalTax, that.totalTax)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet)
                .append(totalGross)
                .append(taxPortions)
                .append(totalTax)
                .toHashCode();
    }

}
