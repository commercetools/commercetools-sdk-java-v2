package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentAddTransactionAction;
import com.commercetools.api.generated.models.me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.api.generated.models.me.MyPaymentSetCustomFieldAction;
import com.commercetools.api.generated.models.me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.generated.models.me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.api.generated.models.me.MyPaymentSetMethodInfoNameAction;
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
public final class MyPaymentUpdateActionImpl implements MyPaymentUpdateAction {

   private String action;

   @JsonCreator
   MyPaymentUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}