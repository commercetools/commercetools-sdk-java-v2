package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
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
 * ChangeShoppingListLineItemsOrderChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeShoppingListLineItemsOrderChangeImpl implements ChangeShoppingListLineItemsOrderChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue;
    
    
    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeShoppingListLineItemsOrderChangeImpl(@JsonProperty("change") final String change, @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue, @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeShoppingListLineItemsOrderChangeImpl() {
        this.type =  CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE;
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
     *
     */
    
    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.change_value.ShoppingListLineItemValue ...previousValue){
       this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }
    
    
    public void setPreviousValue(final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue){
       this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.change_value.ShoppingListLineItemValue ...nextValue){
       this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }
    
    
    public void setNextValue(final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue){
       this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeShoppingListLineItemsOrderChangeImpl that = (ChangeShoppingListLineItemsOrderChangeImpl) o;
    
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
