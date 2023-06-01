package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
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
 * ChangeCustomLineItemQuantityChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeCustomLineItemQuantityChangeImpl implements ChangeCustomLineItemQuantityChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.common.LocalizedString customLineItem;
    
    
    private String customLineItemId;
    
    
    private Integer nextValue;
    
    
    private Integer previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeCustomLineItemQuantityChangeImpl(@JsonProperty("change") final String change, @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("nextValue") final Integer nextValue, @JsonProperty("previousValue") final Integer previousValue) {
        this.change = change;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  CHANGE_CUSTOM_LINE_ITEM_QUANTITY_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeCustomLineItemQuantityChangeImpl() {
        this.type =  CHANGE_CUSTOM_LINE_ITEM_QUANTITY_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     */
    
    public String getChange(){
        return this.change;
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
    
    public Integer getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem){
        this.customLineItem = customLineItem;
    }
    
    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setNextValue(final Integer nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final Integer previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeCustomLineItemQuantityChangeImpl that = (ChangeCustomLineItemQuantityChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
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
            .append(customLineItem)
            .append(customLineItemId)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
