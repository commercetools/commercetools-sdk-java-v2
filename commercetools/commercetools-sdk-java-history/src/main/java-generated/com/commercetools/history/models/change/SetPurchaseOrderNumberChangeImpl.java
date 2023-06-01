package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
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
 * SetPurchaseOrderNumberChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetPurchaseOrderNumberChangeImpl implements SetPurchaseOrderNumberChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String previousValue;
    
    
    private String nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetPurchaseOrderNumberChangeImpl(@JsonProperty("change") final String change, @JsonProperty("previousValue") final String previousValue, @JsonProperty("nextValue") final String nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  SET_PURCHASE_ORDER_NUMBER_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetPurchaseOrderNumberChangeImpl() {
        this.type =  SET_PURCHASE_ORDER_NUMBER_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setPurchaseOrderNumber</code>.</p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>Purchase Order number prior to the update action.</p>
     */
    
    public String getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *  <p>Purchase Order number after the update action.</p>
     */
    
    public String getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setPreviousValue(final String previousValue){
        this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final String nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetPurchaseOrderNumberChangeImpl that = (SetPurchaseOrderNumberChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(previousValue)
            .append(nextValue)
            .toHashCode();
    }

}
