package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ValidFromAndUntilValue;
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
 * SetValidFromAndUntilChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetValidFromAndUntilChangeImpl implements SetValidFromAndUntilChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue;
    
    
    private com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetValidFromAndUntilChangeImpl(@JsonProperty("change") final String change, @JsonProperty("previousValue") final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue, @JsonProperty("nextValue") final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  SET_VALID_FROM_AND_UNTIL_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetValidFromAndUntilChangeImpl() {
        this.type =  SET_VALID_FROM_AND_UNTIL_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */
    
    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */
    
    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue){
        this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetValidFromAndUntilChangeImpl that = (SetValidFromAndUntilChangeImpl) o;
    
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
