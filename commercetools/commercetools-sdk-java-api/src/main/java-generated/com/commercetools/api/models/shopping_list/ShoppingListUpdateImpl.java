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
 * ShoppingListUpdate
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListUpdateImpl implements ShoppingListUpdate, ModelBase {

    
    private Long version;
    
    
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }
    /**
     * create empty instance
     */
    public ShoppingListUpdateImpl() {
    }

    /**
     *  <p>Expected version of the ShoppingList on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>List of update actions to be performed on the ShoppingList.</p>
     */
    
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> getActions(){
        return this.actions;
    }

    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setActions(final com.commercetools.api.models.shopping_list.ShoppingListUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    
    public void setActions(final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions){
       this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListUpdateImpl that = (ShoppingListUpdateImpl) o;
    
        return new EqualsBuilder()
                .append(version, that.version)
                .append(actions, that.actions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(version)
            .append(actions)
            .toHashCode();
    }

}
