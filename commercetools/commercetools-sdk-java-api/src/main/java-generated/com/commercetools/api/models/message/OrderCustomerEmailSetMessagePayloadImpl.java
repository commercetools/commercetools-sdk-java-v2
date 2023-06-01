package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Customer Email update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderCustomerEmailSetMessagePayloadImpl implements OrderCustomerEmailSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private String email;
    
    
    private String oldEmail;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomerEmailSetMessagePayloadImpl(@JsonProperty("email") final String email, @JsonProperty("oldEmail") final String oldEmail) {
        this.email = email;
        this.oldEmail = oldEmail;
        this.type =  ORDER_CUSTOMER_EMAIL_SET;
    }
    /**
     * create empty instance
     */
    public OrderCustomerEmailSetMessagePayloadImpl() {
        this.type =  ORDER_CUSTOMER_EMAIL_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     */
    
    public String getEmail(){
        return this.email;
    }
    
    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     */
    
    public String getOldEmail(){
        return this.oldEmail;
    }

    
    public void setEmail(final String email){
        this.email = email;
    }
    
    
    public void setOldEmail(final String oldEmail){
        this.oldEmail = oldEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderCustomerEmailSetMessagePayloadImpl that = (OrderCustomerEmailSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(email, that.email)
                .append(oldEmail, that.oldEmail)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(email)
            .append(oldEmail)
            .toHashCode();
    }

}
