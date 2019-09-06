package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.models.Payment.PaymentAddTransactionAction;
import com.commercetools.models.Payment.PaymentChangeAmountPlannedAction;
import com.commercetools.models.Payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.models.Payment.PaymentChangeTransactionStateAction;
import com.commercetools.models.Payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.models.Payment.PaymentSetAmountPaidAction;
import com.commercetools.models.Payment.PaymentSetAmountRefundedAction;
import com.commercetools.models.Payment.PaymentSetAnonymousIdAction;
import com.commercetools.models.Payment.PaymentSetAuthorizationAction;
import com.commercetools.models.Payment.PaymentSetCustomFieldAction;
import com.commercetools.models.Payment.PaymentSetCustomTypeAction;
import com.commercetools.models.Payment.PaymentSetCustomerAction;
import com.commercetools.models.Payment.PaymentSetExternalIdAction;
import com.commercetools.models.Payment.PaymentSetInterfaceIdAction;
import com.commercetools.models.Payment.PaymentSetKeyAction;
import com.commercetools.models.Payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.models.Payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.models.Payment.PaymentSetMethodInfoNameAction;
import com.commercetools.models.Payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.models.Payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.models.Payment.PaymentTransitionStateAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentAddInterfaceInteractionActionImpl.class, name = "addInterfaceInteraction"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentAddTransactionActionImpl.class, name = "addTransaction"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentChangeAmountPlannedActionImpl.class, name = "changeAmountPlanned"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentChangeTransactionInteractionIdActionImpl.class, name = "changeTransactionInteractionId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentChangeTransactionStateActionImpl.class, name = "changeTransactionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentChangeTransactionTimestampActionImpl.class, name = "changeTransactionTimestamp"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetAmountPaidActionImpl.class, name = "setAmountPaid"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetAmountRefundedActionImpl.class, name = "setAmountRefunded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetAuthorizationActionImpl.class, name = "setAuthorization"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetInterfaceIdActionImpl.class, name = "setInterfaceId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetMethodInfoInterfaceActionImpl.class, name = "setMethodInfoInterface"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetMethodInfoMethodActionImpl.class, name = "setMethodInfoMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetMethodInfoNameActionImpl.class, name = "setMethodInfoName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetStatusInterfaceCodeActionImpl.class, name = "setStatusInterfaceCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentSetStatusInterfaceTextActionImpl.class, name = "setStatusInterfaceText"),
   @JsonSubTypes.Type(value = com.commercetools.models.Payment.PaymentTransitionStateActionImpl.class, name = "transitionState")
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
public interface PaymentUpdateAction  {


   


}