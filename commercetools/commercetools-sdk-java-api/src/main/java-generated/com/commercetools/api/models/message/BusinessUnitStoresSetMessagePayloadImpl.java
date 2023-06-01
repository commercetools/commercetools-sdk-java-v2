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
 *  <p>Generated after a successful Set Stores update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitStoresSetMessagePayloadImpl implements BusinessUnitStoresSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitStoresSetMessagePayloadImpl(@JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        this.type =  BUSINESS_UNIT_STORES_SET;
    }
    /**
     * create empty instance
     */
    public BusinessUnitStoresSetMessagePayloadImpl() {
        this.type =  BUSINESS_UNIT_STORES_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     */
    
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores(){
        return this.stores;
    }

    
    public void setStores(final com.commercetools.api.models.store.StoreKeyReference ...stores){
       this.stores = new ArrayList<>(Arrays.asList(stores));
    }
    
    
    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores){
       this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitStoresSetMessagePayloadImpl that = (BusinessUnitStoresSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(stores, that.stores)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(stores)
            .toHashCode();
    }

}
