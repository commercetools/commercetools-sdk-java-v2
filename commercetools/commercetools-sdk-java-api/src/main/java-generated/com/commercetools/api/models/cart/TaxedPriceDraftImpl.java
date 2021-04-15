
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceDraftImpl implements TaxedPriceDraft {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

    @JsonCreator
    TaxedPriceDraftImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.Money totalNet,
            @JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross,
            @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
    }

    public TaxedPriceDraftImpl() {
    }

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions() {
        return this.taxPortions;
    }

    public void setTotalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
    }

    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
    }

    public void setTaxPortions(final com.commercetools.api.models.cart.TaxPortionDraft... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
    }

    public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
        this.taxPortions = taxPortions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxedPriceDraftImpl that = (TaxedPriceDraftImpl) o;

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
