package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetVatIdActionImpl implements MyCustomerSetVatIdAction {

    private String action;
    
    private String vatId;

    @JsonCreator
    MyCustomerSetVatIdActionImpl(@JsonProperty("vatId") final String vatId) {
        this.vatId = vatId;
        this.action = "setVatId";
    }
    public MyCustomerSetVatIdActionImpl() {
        this.action = "setVatId";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getVatId(){
        return this.vatId;
    }

    public void setVatId(final String vatId){
        this.vatId = vatId;
    }

}
