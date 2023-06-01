package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
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
 * ShoppingListSetStoreAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListSetStoreActionImpl implements ShoppingListSetStoreAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListSetStoreActionImpl(@JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action =  SET_STORE;
    }
    /**
     * create empty instance
     */
    public ShoppingListSetStoreActionImpl() {
        this.action =  SET_STORE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The Store the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     */
    
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }

    
    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store){
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListSetStoreActionImpl that = (ShoppingListSetStoreActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(store, that.store)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(store)
            .toHashCode();
    }

}
