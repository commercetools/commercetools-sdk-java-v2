package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
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
public final class CartSetAnonymousIdActionImpl implements CartSetAnonymousIdAction {

    private String action;
    
    private String anonymousId;

    @JsonCreator
    CartSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousId = anonymousId;
        this.action = "setAnonymousId";
    }
    public CartSetAnonymousIdActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not set, any existing anonymous ID will be removed.</p>
    */
    public String getAnonymousId(){
        return this.anonymousId;
    }

    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }

}
