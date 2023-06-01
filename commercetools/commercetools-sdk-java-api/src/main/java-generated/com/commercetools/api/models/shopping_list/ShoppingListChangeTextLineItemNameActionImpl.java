package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
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
 * ShoppingListChangeTextLineItemNameAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListChangeTextLineItemNameActionImpl implements ShoppingListChangeTextLineItemNameAction, ModelBase {

    
    private String action;
    
    
    private String textLineItemId;
    
    
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListChangeTextLineItemNameActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.textLineItemId = textLineItemId;
        this.name = name;
        this.action =  CHANGE_TEXT_LINE_ITEM_NAME;
    }
    /**
     * create empty instance
     */
    public ShoppingListChangeTextLineItemNameActionImpl() {
        this.action =  CHANGE_TEXT_LINE_ITEM_NAME;
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
     *  <p>New value to set. Must not be empty.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    
    public void setTextLineItemId(final String textLineItemId){
        this.textLineItemId = textLineItemId;
    }
    
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListChangeTextLineItemNameActionImpl that = (ShoppingListChangeTextLineItemNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(name, that.name)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(textLineItemId)
            .append(name)
            .toHashCode();
    }

}
