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
 * ChangeInitialChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeInitialChangeImpl implements ChangeInitialChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private Boolean previousValue;
    
    
    private Boolean nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeInitialChangeImpl(@JsonProperty("change") final String change, @JsonProperty("previousValue") final Boolean previousValue, @JsonProperty("nextValue") final Boolean nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  CHANGE_INITIAL_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeInitialChangeImpl() {
        this.type =  CHANGE_INITIAL_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Shape of the action for <code>changeInitial</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public Boolean getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *
     */
    
    public Boolean getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setPreviousValue(final Boolean previousValue){
        this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final Boolean nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeInitialChangeImpl that = (ChangeInitialChangeImpl) o;
    
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
