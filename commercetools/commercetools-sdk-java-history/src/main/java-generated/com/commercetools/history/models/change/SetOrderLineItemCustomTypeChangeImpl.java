package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
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
 * SetOrderLineItemCustomTypeChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetOrderLineItemCustomTypeChangeImpl implements SetOrderLineItemCustomTypeChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    private String variant;
    
    
    private com.commercetools.history.models.common.CustomFields nextValue;
    
    
    private com.commercetools.history.models.common.CustomFields previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetOrderLineItemCustomTypeChangeImpl(@JsonProperty("change") final String change, @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem, @JsonProperty("variant") final String variant, @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue, @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.variant = variant;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_ORDER_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetOrderLineItemCustomTypeChangeImpl() {
        this.type =  SET_ORDER_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setLineItemCustomType</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getLineItem(){
        return this.lineItem;
    }
    
    /**
     *
     */
    
    public String getVariant(){
        return this.variant;
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
    
    
    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem){
        this.lineItem = lineItem;
    }
    
    
    public void setVariant(final String variant){
        this.variant = variant;
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
    
        SetOrderLineItemCustomTypeChangeImpl that = (SetOrderLineItemCustomTypeChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(lineItem)
            .append(variant)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
