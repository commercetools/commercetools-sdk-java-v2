package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Set Customer Group update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerGroupSetMessagePayloadImpl implements CustomerGroupSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupSetMessagePayloadImpl(@JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        this.type =  CUSTOMER_GROUP_SET;
    }
    /**
     * create empty instance
     */
    public CustomerGroupSetMessagePayloadImpl() {
        this.type =  CUSTOMER_GROUP_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     */
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }

    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerGroupSetMessagePayloadImpl that = (CustomerGroupSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customerGroup)
            .toHashCode();
    }

}
