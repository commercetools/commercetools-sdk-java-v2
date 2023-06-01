package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
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
 *  <p>Generated after a successful Set Store Mode update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitStoreModeChangedMessagePayloadImpl implements BusinessUnitStoreModeChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;
    
    
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitStoreModeChangedMessagePayloadImpl(@JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores, @JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode, @JsonProperty("oldStores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores, @JsonProperty("oldStoreMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode) {
        this.stores = stores;
        this.storeMode = storeMode;
        this.oldStores = oldStores;
        this.oldStoreMode = oldStoreMode;
        this.type =  BUSINESS_UNIT_STORE_MODE_CHANGED;
    }
    /**
     * create empty instance
     */
    public BusinessUnitStoreModeChangedMessagePayloadImpl() {
        this.type =  BUSINESS_UNIT_STORE_MODE_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     */
    
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores(){
        return this.stores;
    }
    
    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode(){
        return this.storeMode;
    }
    
    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     */
    
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores(){
        return this.oldStores;
    }
    
    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getOldStoreMode(){
        return this.oldStoreMode;
    }

    
    public void setStores(final com.commercetools.api.models.store.StoreKeyReference ...stores){
       this.stores = new ArrayList<>(Arrays.asList(stores));
    }
    
    
    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores){
       this.stores = stores;
    }
    
    
    public void setStoreMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode){
        this.storeMode = storeMode;
    }
    
    
    public void setOldStores(final com.commercetools.api.models.store.StoreKeyReference ...oldStores){
       this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
    }
    
    
    public void setOldStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores){
       this.oldStores = oldStores;
    }
    
    
    public void setOldStoreMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode oldStoreMode){
        this.oldStoreMode = oldStoreMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitStoreModeChangedMessagePayloadImpl that = (BusinessUnitStoreModeChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(stores, that.stores)
                .append(storeMode, that.storeMode)
                .append(oldStores, that.oldStores)
                .append(oldStoreMode, that.oldStoreMode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(stores)
            .append(storeMode)
            .append(oldStores)
            .append(oldStoreMode)
            .toHashCode();
    }

}
