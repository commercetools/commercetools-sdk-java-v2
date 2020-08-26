package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.api.models.me.MyPaymentSetCustomFieldAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentAddTransactionActionImpl.class, name = "addTransaction"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionImpl.class, name = "changeAmountPlanned"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionImpl.class, name = "setMethodInfoInterface"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionImpl.class, name = "setMethodInfoMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionImpl.class, name = "setMethodInfoName")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = MyPaymentUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MyPaymentUpdateAction  {





}
