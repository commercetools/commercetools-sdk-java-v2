
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetOrderTotalTaxActionImpl implements StagedOrderSetOrderTotalTaxAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Money externalTotalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    @JsonCreator
    StagedOrderSetOrderTotalTaxActionImpl(
            @JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross,
            @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action = SET_ORDER_TOTAL_TAX;
    }

    public StagedOrderSetOrderTotalTaxActionImpl() {
        this.action = SET_ORDER_TOTAL_TAX;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
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

        StagedOrderSetOrderTotalTaxActionImpl that = (StagedOrderSetOrderTotalTaxActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(externalTotalGross, that.externalTotalGross)
                .append(externalTaxPortions, that.externalTaxPortions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(externalTotalGross)
                .append(externalTaxPortions)
                .toHashCode();
    }

}
