package com.commercetools.api.models.message;

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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerEmailSetMessagePayloadImpl implements OrderCustomerEmailSetMessagePayload {

    private String type;
    
    private String email;
    
    private String oldEmail;

    @JsonCreator
    OrderCustomerEmailSetMessagePayloadImpl(@JsonProperty("email") final String email, @JsonProperty("oldEmail") final String oldEmail) {
        this.email = email;
        this.oldEmail = oldEmail;
        this.type = "OrderCustomerEmailSet";
    }
    public OrderCustomerEmailSetMessagePayloadImpl() {
        this.type = "OrderCustomerEmailSet";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getEmail(){
        return this.email;
    }
    
    
    public String getOldEmail(){
        return this.oldEmail;
    }

    public void setEmail(final String email){
        this.email = email;
    }
    
    public void setOldEmail(final String oldEmail){
        this.oldEmail = oldEmail;
    }

}
