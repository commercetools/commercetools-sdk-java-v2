
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
public final class CartChangeTaxCalculationModeActionImpl implements CartChangeTaxCalculationModeAction {

    private String action;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @JsonCreator
    CartChangeTaxCalculationModeActionImpl(
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        this.action = CHANGE_TAX_CALCULATION_MODE;
    }

    public CartChangeTaxCalculationModeActionImpl() {
        this.action = CHANGE_TAX_CALCULATION_MODE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangeTaxCalculationModeActionImpl that = (CartChangeTaxCalculationModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(taxCalculationMode, that.taxCalculationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxCalculationMode).toHashCode();
    }

}
