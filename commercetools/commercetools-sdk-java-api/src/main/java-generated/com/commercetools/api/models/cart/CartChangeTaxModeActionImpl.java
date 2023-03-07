
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

/**
 *  <ul>
 *   <li>When <code>External</code> TaxMode is changed to <code>Platform</code> or <code>Disabled</code>, all previously set external Tax Rates are removed.</li>
 *   <li>When set to <code>Platform</code>, Line Items, Custom Line Items, and Shipping Method require a Tax Category with a Tax Rate for the Cart's <code>shippingAddress</code>.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeTaxModeActionImpl implements CartChangeTaxModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    @JsonCreator
    CartChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        this.action = CHANGE_TAX_MODE;
    }

    public CartChangeTaxModeActionImpl() {
        this.action = CHANGE_TAX_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The new TaxMode.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangeTaxModeActionImpl that = (CartChangeTaxModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxMode, that.taxMode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxMode).toHashCode();
    }

}
