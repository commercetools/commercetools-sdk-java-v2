
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
public class TaxCategoryReplaceTaxRateActionImpl implements TaxCategoryReplaceTaxRateAction, ModelBase {

    private String action;

    private String taxRateId;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    @JsonCreator
    TaxCategoryReplaceTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRateId = taxRateId;
        this.taxRate = taxRate;
        this.action = REPLACE_TAX_RATE;
    }

    public TaxCategoryReplaceTaxRateActionImpl() {
        this.action = REPLACE_TAX_RATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>ID of the TaxRate to replace.</p>
    */
    public String getTaxRateId() {
        return this.taxRateId;
    }

    /**
    *  <p>New TaxRate to replace with.</p>
    */
    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
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

        TaxCategoryReplaceTaxRateActionImpl that = (TaxCategoryReplaceTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(taxRateId, that.taxRateId)
                .append(taxRate, that.taxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxRateId).append(taxRate).toHashCode();
    }

}
