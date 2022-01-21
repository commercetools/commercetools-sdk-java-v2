
package com.commercetools.api.models.tax_category;

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
public class TaxCategoryAddTaxRateActionImpl implements TaxCategoryAddTaxRateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    @JsonCreator
    TaxCategoryAddTaxRateActionImpl(
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        this.action = ADD_TAX_RATE;
    }

    public TaxCategoryAddTaxRateActionImpl() {
        this.action = ADD_TAX_RATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Value to append to the <code>rates</code> array.</p>
    */
    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxCategoryAddTaxRateActionImpl that = (TaxCategoryAddTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxRate, that.taxRate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxRate).toHashCode();
    }

}
