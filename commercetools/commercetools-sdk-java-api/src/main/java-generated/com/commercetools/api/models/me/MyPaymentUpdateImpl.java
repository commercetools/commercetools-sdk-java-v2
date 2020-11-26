package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
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
public final class MyPaymentUpdateImpl implements MyPaymentUpdate {

    private Long version;
    
    private java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions;

    @JsonCreator
    MyPaymentUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }
    public MyPaymentUpdateImpl() {
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> getActions(){
        return this.actions;
    }

    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setActions(final com.commercetools.api.models.me.MyPaymentUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    public void setActions(final java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions){
       this.actions = actions;
    }

}
