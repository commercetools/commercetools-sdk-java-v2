package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import java.lang.Object;
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
 * SetValueChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetValueChangeImpl implements SetValueChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private java.lang.Object nextValue;
    
    
    private java.lang.Object previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetValueChangeImpl(@JsonProperty("change") final String change, @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_VALUE_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetValueChangeImpl() {
        this.type =  SET_VALUE_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public java.lang.Object getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public java.lang.Object getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setNextValue(final java.lang.Object nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final java.lang.Object previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetValueChangeImpl that = (SetValueChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
