package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.message.OrderMessagePayload;
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
 *  <p>Generated after a successful Set Shipping Method and Set Custom Shipping Method update actions.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderShippingInfoSetMessagePayloadImpl implements OrderShippingInfoSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;
    
    
    private com.commercetools.api.models.cart.ShippingInfo oldShippingInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderShippingInfoSetMessagePayloadImpl(@JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo, @JsonProperty("oldShippingInfo") final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.shippingInfo = shippingInfo;
        this.oldShippingInfo = oldShippingInfo;
        this.type =  ORDER_SHIPPING_INFO_SET;
    }
    /**
     * create empty instance
     */
    public OrderShippingInfoSetMessagePayloadImpl() {
        this.type =  ORDER_SHIPPING_INFO_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>ShippingInfo after the Set Shipping Method or Set Custom Shipping Method update action.</p>
     */
    
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo(){
        return this.shippingInfo;
    }
    
    /**
     *  <p>ShippingInfo before the Set Shipping Method or Set Custom Shipping Method update action.</p>
     */
    
    public com.commercetools.api.models.cart.ShippingInfo getOldShippingInfo(){
        return this.oldShippingInfo;
    }

    
    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo){
        this.shippingInfo = shippingInfo;
    }
    
    
    public void setOldShippingInfo(final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo){
        this.oldShippingInfo = oldShippingInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderShippingInfoSetMessagePayloadImpl that = (OrderShippingInfoSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(shippingInfo, that.shippingInfo)
                .append(oldShippingInfo, that.oldShippingInfo)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(shippingInfo)
            .append(oldShippingInfo)
            .toHashCode();
    }

}
