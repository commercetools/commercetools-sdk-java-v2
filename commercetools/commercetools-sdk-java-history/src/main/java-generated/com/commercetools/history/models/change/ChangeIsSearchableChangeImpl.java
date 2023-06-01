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
 * ChangeIsSearchableChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeIsSearchableChangeImpl implements ChangeIsSearchableChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String attributeName;
    
    
    private Boolean nextValue;
    
    
    private Boolean previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeIsSearchableChangeImpl(@JsonProperty("change") final String change, @JsonProperty("attributeName") final String attributeName, @JsonProperty("nextValue") final Boolean nextValue, @JsonProperty("previousValue") final Boolean previousValue) {
        this.change = change;
        this.attributeName = attributeName;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  CHANGE_IS_SEARCHABLE_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeIsSearchableChangeImpl() {
        this.type =  CHANGE_IS_SEARCHABLE_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>The name of the updated attribute.</p>
     */
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     *
     */
    
    public Boolean getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public Boolean getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    
    public void setNextValue(final Boolean nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final Boolean previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeIsSearchableChangeImpl that = (ChangeIsSearchableChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(attributeName, that.attributeName)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(attributeName)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
