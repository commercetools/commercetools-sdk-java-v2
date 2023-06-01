package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.Order;
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
 *  <p>Generated after a successful Create Order request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderCreatedMessagePayloadImpl implements OrderCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.order.Order order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCreatedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.models.order.Order order) {
        this.order = order;
        this.type =  ORDER_CREATED;
    }
    /**
     * create empty instance
     */
    public OrderCreatedMessagePayloadImpl() {
        this.type =  ORDER_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Order that was created.</p>
     */
    
    public com.commercetools.api.models.order.Order getOrder(){
        return this.order;
    }

    
    public void setOrder(final com.commercetools.api.models.order.Order order){
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderCreatedMessagePayloadImpl that = (OrderCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(order, that.order)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(order)
            .toHashCode();
    }

}
