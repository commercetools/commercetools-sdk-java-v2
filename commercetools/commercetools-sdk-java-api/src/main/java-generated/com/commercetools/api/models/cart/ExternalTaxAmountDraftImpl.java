
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
 *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
 *  <p>Can only be set by these update actions:</p>
 *  <ul>
 *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
 *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxAmountDraftImpl implements ExternalTaxAmountDraft, ModelBase {

    private com.commercetools.api.models.common.Money totalGross;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    @JsonCreator
    ExternalTaxAmountDraftImpl(@JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross,
            @JsonProperty("taxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.totalGross = totalGross;
        this.taxRate = taxRate;
    }

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

        return new EqualsBuilder().append(totalGross, that.totalGross).append(taxRate, that.taxRate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(totalGross).append(taxRate).toHashCode();
    }

}
