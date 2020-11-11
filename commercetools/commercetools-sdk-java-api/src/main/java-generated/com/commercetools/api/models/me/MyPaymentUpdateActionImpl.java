package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.api.models.me.MyPaymentSetCustomFieldAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction;
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
public final class MyPaymentUpdateActionImpl implements MyPaymentUpdateAction {

    private String action;

    @JsonCreator
    MyPaymentUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public MyPaymentUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}
