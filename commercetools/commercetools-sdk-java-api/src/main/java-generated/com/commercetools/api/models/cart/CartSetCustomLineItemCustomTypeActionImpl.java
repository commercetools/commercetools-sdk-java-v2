package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
 * CartSetCustomLineItemCustomTypeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetCustomLineItemCustomTypeActionImpl implements CartSetCustomLineItemCustomTypeAction, ModelBase {

    
    private String action;
    
    
    private String customLineItemId;
    
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomLineItemCustomTypeActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.customLineItemId = customLineItemId;
        this.type = type;
        this.fields = fields;
        this.action =  SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE;
    }
    /**
     * create empty instance
     */
    public CartSetCustomLineItemCustomTypeActionImpl() {
        this.action =  SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     */
    
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     */
    
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetCustomLineItemCustomTypeActionImpl that = (CartSetCustomLineItemCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customLineItemId)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
