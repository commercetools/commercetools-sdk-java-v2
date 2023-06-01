package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
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
 *  <p>Generated after a successful Set Customer Id update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    
    private com.commercetools.api.models.customer.CustomerReference oldCustomer;
    
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomerSetMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomer") final com.commercetools.api.models.customer.CustomerReference oldCustomer, @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customer = customer;
        this.customerGroup = customerGroup;
        this.oldCustomer = oldCustomer;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type =  ORDER_CUSTOMER_SET;
    }
    /**
     * create empty instance
     */
    public OrderCustomerSetMessagePayloadImpl() {
        this.type =  ORDER_CUSTOMER_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     */
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getOldCustomer(){
        return this.oldCustomer;
    }
    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     */
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
        return this.oldCustomerGroup;
    }

    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }
    
    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    
    public void setOldCustomer(final com.commercetools.api.models.customer.CustomerReference oldCustomer){
        this.oldCustomer = oldCustomer;
    }
    
    
    public void setOldCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup){
        this.oldCustomerGroup = oldCustomerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderCustomerSetMessagePayloadImpl that = (OrderCustomerSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customer, that.customer)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomer, that.oldCustomer)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customer)
            .append(customerGroup)
            .append(oldCustomer)
            .append(oldCustomerGroup)
            .toHashCode();
    }

}
