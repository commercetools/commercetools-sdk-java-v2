package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.CustomFields;
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
 * SetTextLineItemCustomTypeChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetTextLineItemCustomTypeChangeImpl implements SetTextLineItemCustomTypeChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;
    
    
    private com.commercetools.history.models.common.CustomFields nextValue;
    
    
    private com.commercetools.history.models.common.CustomFields previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetTextLineItemCustomTypeChangeImpl(@JsonProperty("change") final String change, @JsonProperty("textLineItem") final com.commercetools.history.models.change_value.TextLineItemValue textLineItem, @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue, @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue) {
        this.change = change;
        this.textLineItem = textLineItem;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_TEXT_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetTextLineItemCustomTypeChangeImpl() {
        this.type =  SET_TEXT_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setTextLineItemCustomType</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem(){
        return this.textLineItem;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.CustomFields getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.CustomFields getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setTextLineItem(final com.commercetools.history.models.change_value.TextLineItemValue textLineItem){
        this.textLineItem = textLineItem;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.CustomFields nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.CustomFields previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetTextLineItemCustomTypeChangeImpl that = (SetTextLineItemCustomTypeChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(textLineItem, that.textLineItem)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(textLineItem)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
