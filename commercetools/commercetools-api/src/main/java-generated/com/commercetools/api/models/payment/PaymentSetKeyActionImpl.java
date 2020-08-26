package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetKeyActionImpl implements PaymentSetKeyAction {

    private String action;
    
    private String key;

    @JsonCreator
    PaymentSetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = "setKey";
    }
    public PaymentSetKeyActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>User-specific unique identifier for the payment (max.
    *  256 characters).
    *  If not provided an existing key will be removed.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
