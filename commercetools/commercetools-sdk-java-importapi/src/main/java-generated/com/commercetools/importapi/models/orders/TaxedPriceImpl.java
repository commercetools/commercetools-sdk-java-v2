
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceImpl implements TaxedPrice {

    private com.commercetools.importapi.models.common.Money totalNet;

    private com.commercetools.importapi.models.common.Money totalGross;

    private java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions;

    @JsonCreator
    TaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.importapi.models.common.Money totalNet,
            @JsonProperty("totalGross") final com.commercetools.importapi.models.common.Money totalGross,
            @JsonProperty("taxPortions") final java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
    }

    public TaxedPriceImpl() {
    }

    /**
    *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
    */
    public com.commercetools.importapi.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    /**
    *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
    */
    public com.commercetools.importapi.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    /**
    *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.TaxPortion> getTaxPortions() {
        return this.taxPortions;
    }

    public void setTotalNet(final com.commercetools.importapi.models.common.Money totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.importapi.models.common.Money totalGross) {
        this.totalGross = totalGross;
    }

    public void setTaxPortions(final com.commercetools.importapi.models.orders.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
    }

    public void setTaxPortions(final java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalNet).append(totalGross).append(taxPortions).toHashCode();
    }

}
