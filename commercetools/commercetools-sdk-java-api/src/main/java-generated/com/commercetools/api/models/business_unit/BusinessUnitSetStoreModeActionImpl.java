package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
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
 *  <p>Only Business Units of type <code>Division</code> can be have a store mode of <code>FromParent</code>. Changing the <code>storeMode</code> to <code>FromParent</code> empties the <code>stores</code> array on the BusinessUnit. This update action generates a BusinessUnitStoreModeChanged Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitSetStoreModeActionImpl implements BusinessUnitSetStoreModeAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;
    
    
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetStoreModeActionImpl(@JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode, @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.storeMode = storeMode;
        this.stores = stores;
        this.action =  SET_STORE_MODE;
    }
    /**
     * create empty instance
     */
    public BusinessUnitSetStoreModeActionImpl() {
        this.action =  SET_STORE_MODE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Set to <code>Explicit</code> to specify Stores for the Business Unit. Set to <code>FromParent</code> to inherit Stores from a parent.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode(){
        return this.storeMode;
    }
    
    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     */
    
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores(){
        return this.stores;
    }

    
    public void setStoreMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode){
        this.storeMode = storeMode;
    }
    
    
    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier ...stores){
       this.stores = new ArrayList<>(Arrays.asList(stores));
    }
    
    
    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores){
       this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitSetStoreModeActionImpl that = (BusinessUnitSetStoreModeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(storeMode, that.storeMode)
                .append(stores, that.stores)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(storeMode)
            .append(stores)
            .toHashCode();
    }

}
