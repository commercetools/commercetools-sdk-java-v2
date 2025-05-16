
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
 *  <p>Changing the tax calculation mode leads to recalculation of taxes.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeTaxCalculationModeActionImpl implements CartChangeTaxCalculationModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartChangeTaxCalculationModeActionImpl(
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        this.action = CHANGE_TAX_CALCULATION_MODE;
    }

    /**
     * create empty instance
     */
    public CartChangeTaxCalculationModeActionImpl() {
        this.action = CHANGE_TAX_CALCULATION_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

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
                .append(action, that.action)
                .append(taxCalculationMode, that.taxCalculationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxCalculationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("taxCalculationMode", taxCalculationMode)
                .build();
    }

    @Override
    public CartChangeTaxCalculationModeAction copyDeep() {
        return CartChangeTaxCalculationModeAction.deepCopy(this);
    }
}
