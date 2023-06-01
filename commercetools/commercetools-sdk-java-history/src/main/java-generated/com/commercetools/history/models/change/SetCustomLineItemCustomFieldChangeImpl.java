package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
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
 * SetCustomLineItemCustomFieldChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetCustomLineItemCustomFieldChangeImpl implements SetCustomLineItemCustomFieldChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String name;
    
    
    private com.commercetools.history.models.common.LocalizedString customLineItem;
    
    
    private String customLineItemId;
    
    
    private java.lang.Object nextValue;
    
    
    private java.lang.Object previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomLineItemCustomFieldChangeImpl(@JsonProperty("change") final String change, @JsonProperty("name") final String name, @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.name = name;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetCustomLineItemCustomFieldChangeImpl() {
        this.type =  SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setCustomLineItemCustomField</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getCustomLineItem(){
        return this.customLineItem;
    }
    
    /**
     *
     */
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
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
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem){
        this.customLineItem = customLineItem;
    }
    
    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
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
    
        SetCustomLineItemCustomFieldChangeImpl that = (SetCustomLineItemCustomFieldChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(name, that.name)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(name)
            .append(customLineItem)
            .append(customLineItemId)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
