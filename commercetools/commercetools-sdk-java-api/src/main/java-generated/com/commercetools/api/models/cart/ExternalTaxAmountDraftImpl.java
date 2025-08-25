
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
 *  <p>Cannot be used in <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemDraft" rel="nofollow">LineItemDraft</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemDraft" rel="nofollow">CustomLineItemDraft</a>.</p>
 *  <p>Can only be set by these update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemTaxAmountAction" rel="nofollow">Set LineItem TaxAmount</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetCustomLineItemTaxAmountAction" rel="nofollow">Set CustomLineItem TaxAmount</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodTaxAmountAction" rel="nofollow">Set ShippingMethod TaxAmount</a> on Carts</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemTaxAmountAction" rel="nofollow">Set LineItem TaxAmount</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomLineItemTaxAmountAction" rel="nofollow">Set CustomLineItem TaxAmount</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodTaxAmountAction" rel="nofollow">Set ShippingMethod TaxAmount</a> on Order Edits</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxAmountDraftImpl implements ExternalTaxAmountDraft, ModelBase {

    private com.commercetools.api.models.common.Money totalGross;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalTaxAmountDraftImpl(@JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross,
            @JsonProperty("taxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.totalGross = totalGross;
        this.taxRate = taxRate;
    }

    /**
     * create empty instance
     */
    public ExternalTaxAmountDraftImpl() {
    }

    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     */

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
    }

    public void setTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExternalTaxAmountDraftImpl that = (ExternalTaxAmountDraftImpl) o;

        return new EqualsBuilder().append(totalGross, that.totalGross)
                .append(taxRate, that.taxRate)
                .append(totalGross, that.totalGross)
                .append(taxRate, that.taxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalGross).append(taxRate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("totalGross", totalGross)
                .append("taxRate", taxRate)
                .build();
    }

    @Override
    public ExternalTaxAmountDraft copyDeep() {
        return ExternalTaxAmountDraft.deepCopy(this);
    }
}
