package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TaxMode;
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
 * SetOrderTotalTaxChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetOrderTotalTaxChangeImpl implements SetOrderTotalTaxChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.common.TaxMode taxMode;
    
    
    private com.commercetools.history.models.common.Money nextValue;
    
    
    private com.commercetools.history.models.common.Money previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetOrderTotalTaxChangeImpl(@JsonProperty("change") final String change, @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode, @JsonProperty("nextValue") final com.commercetools.history.models.common.Money nextValue, @JsonProperty("previousValue") final com.commercetools.history.models.common.Money previousValue) {
        this.change = change;
        this.taxMode = taxMode;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_ORDER_TOTAL_TAX_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetOrderTotalTaxChangeImpl() {
        this.type =  SET_ORDER_TOTAL_TAX_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setOrderTotalTax</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.TaxMode getTaxMode(){
        return this.taxMode;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode){
        this.taxMode = taxMode;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.Money nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.Money previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetOrderTotalTaxChangeImpl that = (SetOrderTotalTaxChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(taxMode, that.taxMode)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(taxMode)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
