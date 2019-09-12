package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentAddTransactionAction;
import com.commercetools.models.Me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.models.Me.MyPaymentSetCustomFieldAction;
import com.commercetools.models.Me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.models.Me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.models.Me.MyPaymentSetMethodInfoNameAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentAddTransactionActionImpl.class, name = "addTransaction"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentChangeAmountPlannedActionImpl.class, name = "changeAmountPlanned"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentSetMethodInfoInterfaceActionImpl.class, name = "setMethodInfoInterface"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentSetMethodInfoMethodActionImpl.class, name = "setMethodInfoMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Me.MyPaymentSetMethodInfoNameActionImpl.class, name = "setMethodInfoName")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyPaymentUpdateAction  {


   


}