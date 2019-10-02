package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.models.payment.PaymentAddTransactionAction;
import com.commercetools.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.models.payment.PaymentSetAmountPaidAction;
import com.commercetools.models.payment.PaymentSetAmountRefundedAction;
import com.commercetools.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.models.payment.PaymentSetAuthorizationAction;
import com.commercetools.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.models.payment.PaymentSetCustomerAction;
import com.commercetools.models.payment.PaymentSetExternalIdAction;
import com.commercetools.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.models.payment.PaymentSetKeyAction;
import com.commercetools.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.models.payment.PaymentTransitionStateAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentAddInterfaceInteractionActionImpl.class, name = "addInterfaceInteraction"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentAddTransactionActionImpl.class, name = "addTransaction"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentChangeAmountPlannedActionImpl.class, name = "changeAmountPlanned"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentChangeTransactionInteractionIdActionImpl.class, name = "changeTransactionInteractionId"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentChangeTransactionStateActionImpl.class, name = "changeTransactionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentChangeTransactionTimestampActionImpl.class, name = "changeTransactionTimestamp"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetAmountPaidActionImpl.class, name = "setAmountPaid"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetAmountRefundedActionImpl.class, name = "setAmountRefunded"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetAuthorizationActionImpl.class, name = "setAuthorization"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetInterfaceIdActionImpl.class, name = "setInterfaceId"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetMethodInfoInterfaceActionImpl.class, name = "setMethodInfoInterface"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetMethodInfoMethodActionImpl.class, name = "setMethodInfoMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetMethodInfoNameActionImpl.class, name = "setMethodInfoName"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetStatusInterfaceCodeActionImpl.class, name = "setStatusInterfaceCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentSetStatusInterfaceTextActionImpl.class, name = "setStatusInterfaceText"),
   @JsonSubTypes.Type(value = com.commercetools.models.payment.PaymentTransitionStateActionImpl.class, name = "transitionState")
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