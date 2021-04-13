package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryRemoveTaxRateActionImpl implements TaxCategoryRemoveTaxRateAction {

    
    private String action;
    
    
    private String taxRateId;

    @JsonCreator
    TaxCategoryRemoveTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId) {
        this.taxRateId = taxRateId;
        this.action =  REMOVE_TAX_RATE;
    }
    public TaxCategoryRemoveTaxRateActionImpl() {
        this.action =  REMOVE_TAX_RATE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTaxRateId(){
        return this.taxRateId;
    }

    
    public void setTaxRateId(final String taxRateId){
        this.taxRateId = taxRateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxCategoryRemoveTaxRateActionImpl that = (TaxCategoryRemoveTaxRateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxRateId, that.taxRateId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxRateId)
            .toHashCode();
    }

}
