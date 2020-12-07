package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerGroupSetMessagePayloadImpl implements OrderCustomerGroupSetMessagePayload {

    private String type;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    @JsonCreator
    OrderCustomerGroupSetMessagePayloadImpl(@JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customerGroup = customerGroup;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type = "OrderCustomerGroupSet";
    }
    public OrderCustomerGroupSetMessagePayloadImpl() {
        this.type = "OrderCustomerGroupSet";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
        return this.oldCustomerGroup;
    }

    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setOldCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup){
        this.oldCustomerGroup = oldCustomerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderCustomerGroupSetMessagePayloadImpl that = (OrderCustomerGroupSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customerGroup)
            .append(oldCustomerGroup)
            .toHashCode();
    }

}
