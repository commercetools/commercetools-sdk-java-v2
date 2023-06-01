package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
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
 * ShoppingListChangeTextLineItemQuantityAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListChangeTextLineItemQuantityActionImpl implements ShoppingListChangeTextLineItemQuantityAction, ModelBase {

    
    private String action;
    
    
    private String textLineItemId;
    
    
    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListChangeTextLineItemQuantityActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("quantity") final Long quantity) {
        this.textLineItemId = textLineItemId;
        this.quantity = quantity;
        this.action =  CHANGE_TEXT_LINE_ITEM_QUANTITY;
    }
    /**
     * create empty instance
     */
    public ShoppingListChangeTextLineItemQuantityActionImpl() {
        this.action =  CHANGE_TEXT_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     */
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    /**
     *  <p>New value to set. If <code>0</code>, the TextLineItem is removed from the ShoppingList.</p>
     */
    
    public Long getQuantity(){
        return this.quantity;
    }

    
    public void setTextLineItemId(final String textLineItemId){
        this.textLineItemId = textLineItemId;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListChangeTextLineItemQuantityActionImpl that = (ShoppingListChangeTextLineItemQuantityActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(quantity, that.quantity)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(textLineItemId)
            .append(quantity)
            .toHashCode();
    }

}
