
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
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode. This update action adds the <code>taxedPrice</code> field to the Cart. It sets the <code>totalGross</code> amount, and Composable Commerce calculates the <code>totalNet</code> and <code>totalTax</code> values based on the provided <code>externalTotalGross</code>. You must use this update action after any price-affecting change occurs within the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCartTotalTaxActionImpl implements CartSetCartTotalTaxAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.Money externalTotalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCartTotalTaxActionImpl(
            @JsonProperty("externalTotalGross") final com.commercetools.api.models.common.Money externalTotalGross,
            @JsonProperty("externalTaxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTotalGross = externalTotalGross;
        this.externalTaxPortions = externalTaxPortions;
        this.action = SET_CART_TOTAL_TAX;
    }

    /**
     * create empty instance
     */
    public CartSetCartTotalTaxActionImpl() {
        this.action = SET_CART_TOTAL_TAX;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The total gross amount of the Cart, including tax. This value is used to calculate the <code>totalNet</code> and <code>totalTax</code> fields of the Cart's <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.common.Money getExternalTotalGross() {
        return this.externalTotalGross;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

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

        return new EqualsBuilder().append(action, that.action)
                .append(externalTotalGross, that.externalTotalGross)
                .append(externalTaxPortions, that.externalTaxPortions)
                .append(action, that.action)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("externalTotalGross", externalTotalGross)
                .append("externalTaxPortions", externalTaxPortions)
                .build();
    }

    @Override
    public CartSetCartTotalTaxAction copyDeep() {
        return CartSetCartTotalTaxAction.deepCopy(this);
    }
}
