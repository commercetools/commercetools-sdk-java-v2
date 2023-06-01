package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.store.StoreKeyReference;
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
 * ShoppingListStoreSetMessagePayload
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListStoreSetMessagePayloadImpl implements ShoppingListStoreSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListStoreSetMessagePayloadImpl(@JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        this.type =  SHOPPING_LIST_STORE_SET;
    }
    /**
     * create empty instance
     */
    public ShoppingListStoreSetMessagePayloadImpl() {
        this.type =  SHOPPING_LIST_STORE_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Reference to a Store by its key.</p>
     */
    
    public com.commercetools.api.models.store.StoreKeyReference getStore(){
        return this.store;
    }

    
    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store){
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListStoreSetMessagePayloadImpl that = (ShoppingListStoreSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(store, that.store)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(store)
            .toHashCode();
    }

}
