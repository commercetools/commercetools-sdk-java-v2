package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
public final class CustomerSetVatIdActionImpl implements CustomerSetVatIdAction {

    private String action;
    
    private String vatId;

    @JsonCreator
    CustomerSetVatIdActionImpl(@JsonProperty("vatId") final String vatId) {
        this.vatId = vatId;
        this.action = "setVatId";
    }
    public CustomerSetVatIdActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not defined, the vat Id is unset.</p>
    */
    public String getVatId(){
        return this.vatId;
    }

    public void setVatId(final String vatId){
        this.vatId = vatId;
    }

}
