package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxRateDraft;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * TaxCategoryReplaceTaxRateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryReplaceTaxRateActionImpl implements TaxCategoryReplaceTaxRateAction, ModelBase {

    
    private String action;
    
    
    private String taxRateId;
    
    
    private String taxRateKey;
    
    
    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxCategoryReplaceTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId, @JsonProperty("taxRateKey") final String taxRateKey, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRateId = taxRateId;
        this.taxRateKey = taxRateKey;
        this.taxRate = taxRate;
        this.action =  REPLACE_TAX_RATE;
    }
    /**
     * create empty instance
     */
    public TaxCategoryReplaceTaxRateActionImpl() {
        this.action =  REPLACE_TAX_RATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>ID of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     */
    
    public String getTaxRateId(){
        return this.taxRateId;
    }
    
    /**
     *  <p>Key of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     */
    
    public String getTaxRateKey(){
        return this.taxRateKey;
    }
    
    /**
     *  <p>New TaxRate to replace with.</p>
     */
    
    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate(){
        return this.taxRate;
    }

    
    public void setTaxRateId(final String taxRateId){
        this.taxRateId = taxRateId;
    }
    
    
    public void setTaxRateKey(final String taxRateKey){
        this.taxRateKey = taxRateKey;
    }
    
    
    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRateDraft taxRate){
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxCategoryReplaceTaxRateActionImpl that = (TaxCategoryReplaceTaxRateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxRateId, that.taxRateId)
                .append(taxRateKey, that.taxRateKey)
                .append(taxRate, that.taxRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxRateId)
            .append(taxRateKey)
            .append(taxRate)
            .toHashCode();
    }

}
