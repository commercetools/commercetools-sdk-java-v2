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
 * ChangeLineItemQuantityChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeLineItemQuantityChangeImpl implements ChangeLineItemQuantityChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    private String lineItemId;
    
    
    private Integer nextValue;
    
    
    private Integer previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeLineItemQuantityChangeImpl(@JsonProperty("change") final String change, @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("nextValue") final Integer nextValue, @JsonProperty("previousValue") final Integer previousValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.lineItemId = lineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  CHANGE_LINE_ITEM_QUANTITY_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeLineItemQuantityChangeImpl() {
        this.type =  CHANGE_LINE_ITEM_QUANTITY_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>changeLineItemQuantity</code></p>
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
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     */
    
    public Integer getNextValue(){
        return this.nextValue;
    }
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     */
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem){
        this.lineItem = lineItem;
    }
    
    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
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
    
        ChangeLineItemQuantityChangeImpl that = (ChangeLineItemQuantityChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
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
            .append(lineItemId)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
