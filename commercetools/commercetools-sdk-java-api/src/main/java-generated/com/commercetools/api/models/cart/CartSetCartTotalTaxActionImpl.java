
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
public final class CartSetCartTotalTaxActionImpl implements CartSetCartTotalTaxAction {

    private String action;

    private com.commercetools.api.models.common.Money externalTotalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    @JsonCreator
    CartSetCartTotalTaxActionImpl(
            @JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross,
            @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action = SET_CART_TOTAL_TAX;
    }

    public CartSetCartTotalTaxActionImpl() {
        this.action = SET_CART_TOTAL_TAX;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The total gross amount of the cart (totalNet + taxes).</p>
    */
    public com.commercetools.api.models.common.Money getExternalTotalGross() {
        return this.externalTotalGross;
    }

    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions() {
        return this.externalTaxPortions;
    }

    public void setExternalTotalGross(final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
    }

    public void setExternalTaxPortions(final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
    }

    public void setExternalTaxPortions(
            final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCartTotalTaxActionImpl that = (CartSetCartTotalTaxActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(externalTotalGross,
            that.externalTotalGross).append(externalTaxPortions, that.externalTaxPortions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalTotalGross).append(
            externalTaxPortions).toHashCode();
    }

}
