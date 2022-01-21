
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
public class TaxCategoryRemoveTaxRateActionImpl implements TaxCategoryRemoveTaxRateAction, ModelBase {

    private String action;

    private String taxRateId;

    @JsonCreator
    TaxCategoryRemoveTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId) {
        this.taxRateId = taxRateId;
        this.action = REMOVE_TAX_RATE;
    }

    public TaxCategoryRemoveTaxRateActionImpl() {
        this.action = REMOVE_TAX_RATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>ID of the TaxRate to remove.</p>
    */
    public String getTaxRateId() {
        return this.taxRateId;
    }

    public void setTaxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxCategoryRemoveTaxRateActionImpl that = (TaxCategoryRemoveTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxRateId, that.taxRateId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxRateId).toHashCode();
    }

}
