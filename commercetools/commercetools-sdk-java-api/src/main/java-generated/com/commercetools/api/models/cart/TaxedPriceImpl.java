
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TaxedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedPriceImpl implements TaxedPrice, ModelBase {

    private com.commercetools.api.models.common.CentPrecisionMoney totalNet;

    private com.commercetools.api.models.common.CentPrecisionMoney totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

    private com.commercetools.api.models.common.CentPrecisionMoney totalTax;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.CentPrecisionMoney totalNet,
            @JsonProperty("totalGross") final com.commercetools.api.models.common.CentPrecisionMoney totalGross,
            @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions,
            @JsonProperty("totalTax") final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
        this.totalTax = totalTax;
    }

    /**
     * create empty instance
     */
    public TaxedPriceImpl() {
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalNet() {
        return this.totalNet;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalGross() {
        return this.totalGross;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions() {
        return this.taxPortions;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalTax() {
        return this.totalTax;
    }

    public void setTotalNet(final com.commercetools.api.models.common.CentPrecisionMoney totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.api.models.common.CentPrecisionMoney totalGross) {
        this.totalGross = totalGross;
    }

    public void setTaxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
    }

    public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
    }

    public void setTotalTax(final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
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
                .append(totalNet, that.totalNet)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("totalNet", totalNet)
                .append("totalGross", totalGross)
                .append("taxPortions", taxPortions)
                .append("totalTax", totalTax)
                .build();
    }

    @Override
    public TaxedPrice copyDeep() {
        return TaxedPrice.deepCopy(this);
    }
}
