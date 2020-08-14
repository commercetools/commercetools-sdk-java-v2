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
public final class PaymentSetAnonymousIdActionImpl implements PaymentSetAnonymousIdAction {

    private String action;
    
    private String anonymousId;

    @JsonCreator
    PaymentSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousId = anonymousId;
        this.action = "setAnonymousId";
    }
    public PaymentSetAnonymousIdActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>Anonymous ID of the anonymous customer that this payment belongs to.
    *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */
    public String getAnonymousId(){
        return this.anonymousId;
    }

    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }

}
