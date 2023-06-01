package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
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
 *  <p>Generated after a successful Add Parcel To Delivery update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelAddedToDeliveryMessagePayloadImpl implements ParcelAddedToDeliveryMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.order.Delivery delivery;
    
    
    private com.commercetools.api.models.order.Parcel parcel;
    
    
    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelAddedToDeliveryMessagePayloadImpl(@JsonProperty("delivery") final com.commercetools.api.models.order.Delivery delivery, @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel, @JsonProperty("shippingKey") final String shippingKey) {
        this.delivery = delivery;
        this.parcel = parcel;
        this.shippingKey = shippingKey;
        this.type =  PARCEL_ADDED_TO_DELIVERY;
    }
    /**
     * create empty instance
     */
    public ParcelAddedToDeliveryMessagePayloadImpl() {
        this.type =  PARCEL_ADDED_TO_DELIVERY;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    
    public com.commercetools.api.models.order.Delivery getDelivery(){
        return this.delivery;
    }
    
    /**
     *  <p>Parcel that was added to the Delivery.</p>
     */
    
    public com.commercetools.api.models.order.Parcel getParcel(){
        return this.parcel;
    }
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */
    
    public String getShippingKey(){
        return this.shippingKey;
    }

    
    public void setDelivery(final com.commercetools.api.models.order.Delivery delivery){
        this.delivery = delivery;
    }
    
    
    public void setParcel(final com.commercetools.api.models.order.Parcel parcel){
        this.parcel = parcel;
    }
    
    
    public void setShippingKey(final String shippingKey){
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ParcelAddedToDeliveryMessagePayloadImpl that = (ParcelAddedToDeliveryMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(delivery, that.delivery)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(delivery)
            .append(parcel)
            .append(shippingKey)
            .toHashCode();
    }

}
