package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Last Name update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerLastNameSetMessagePayloadImpl implements CustomerLastNameSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private String lastName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerLastNameSetMessagePayloadImpl(@JsonProperty("lastName") final String lastName) {
        this.lastName = lastName;
        this.type =  CUSTOMER_LAST_NAME_SET;
    }
    /**
     * create empty instance
     */
    public CustomerLastNameSetMessagePayloadImpl() {
        this.type =  CUSTOMER_LAST_NAME_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     */
    
    public String getLastName(){
        return this.lastName;
    }

    
    public void setLastName(final String lastName){
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerLastNameSetMessagePayloadImpl that = (CustomerLastNameSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(lastName, that.lastName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(lastName)
            .toHashCode();
    }

}
