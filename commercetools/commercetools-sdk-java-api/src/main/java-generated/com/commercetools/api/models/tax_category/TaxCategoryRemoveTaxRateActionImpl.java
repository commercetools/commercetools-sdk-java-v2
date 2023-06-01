package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
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
 * TaxCategoryRemoveTaxRateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryRemoveTaxRateActionImpl implements TaxCategoryRemoveTaxRateAction, ModelBase {

    
    private String action;
    
    
    private String taxRateId;
    
    
    private String taxRateKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxCategoryRemoveTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId, @JsonProperty("taxRateKey") final String taxRateKey) {
        this.taxRateId = taxRateId;
        this.taxRateKey = taxRateKey;
        this.action =  REMOVE_TAX_RATE;
    }
    /**
     * create empty instance
     */
    public TaxCategoryRemoveTaxRateActionImpl() {
        this.action =  REMOVE_TAX_RATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>ID of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     */
    
    public String getTaxRateId(){
        return this.taxRateId;
    }
    
    /**
     *  <p>Key of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     */
    
    public String getTaxRateKey(){
        return this.taxRateKey;
    }

    
    public void setTaxRateId(final String taxRateId){
        this.taxRateId = taxRateId;
    }
    
    
    public void setTaxRateKey(final String taxRateKey){
        this.taxRateKey = taxRateKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxCategoryRemoveTaxRateActionImpl that = (TaxCategoryRemoveTaxRateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxRateId, that.taxRateId)
                .append(taxRateKey, that.taxRateKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxRateId)
            .append(taxRateKey)
            .toHashCode();
    }

}
