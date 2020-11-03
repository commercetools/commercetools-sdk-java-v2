package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentUpdateAction;
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
public final class PaymentSetMethodInfoNameActionImpl implements PaymentSetMethodInfoNameAction {

    private String action;
    
    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    PaymentSetMethodInfoNameActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.action = "setMethodInfoName";
    }
    public PaymentSetMethodInfoNameActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not provided, the name is unset.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }

}
