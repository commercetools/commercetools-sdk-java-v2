package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
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
 *  <p>Removing the address from a Business Unit generates the BusinessUnitAddressRemoved Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitRemoveAddressActionImpl implements MyBusinessUnitRemoveAddressAction, ModelBase {

    
    private String action;
    
    
    private String addressId;
    
    
    private String addressKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitRemoveAddressActionImpl(@JsonProperty("addressId") final String addressId, @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action =  REMOVE_ADDRESS;
    }
    /**
     * create empty instance
     */
    public MyBusinessUnitRemoveAddressActionImpl() {
        this.action =  REMOVE_ADDRESS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */
    
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */
    
    public String getAddressKey(){
        return this.addressKey;
    }

    
    public void setAddressId(final String addressId){
        this.addressId = addressId;
    }
    
    
    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyBusinessUnitRemoveAddressActionImpl that = (MyBusinessUnitRemoveAddressActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(addressId)
            .append(addressKey)
            .toHashCode();
    }

}
