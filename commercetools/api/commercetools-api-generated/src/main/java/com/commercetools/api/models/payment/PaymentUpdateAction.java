package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.api.models.payment.PaymentAddTransactionAction;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.api.models.payment.PaymentSetAmountPaidAction;
import com.commercetools.api.models.payment.PaymentSetAmountRefundedAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.api.models.payment.PaymentSetAuthorizationAction;
import com.commercetools.api.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.api.models.payment.PaymentSetCustomerAction;
import com.commercetools.api.models.payment.PaymentSetExternalIdAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.models.payment.PaymentSetKeyAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.api.models.payment.PaymentTransitionStateAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionImpl.class, name = "addInterfaceInteraction"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddTransactionActionImpl.class, name = "addTransaction"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionImpl.class, name = "changeAmountPlanned"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionImpl.class, name = "changeTransactionInteractionId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionStateActionImpl.class, name = "changeTransactionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionImpl.class, name = "changeTransactionTimestamp"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAmountPaidActionImpl.class, name = "setAmountPaid"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAmountRefundedActionImpl.class, name = "setAmountRefunded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAuthorizationActionImpl.class, name = "setAuthorization"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetInterfaceIdActionImpl.class, name = "setInterfaceId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionImpl.class, name = "setMethodInfoInterface"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionImpl.class, name = "setMethodInfoMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionImpl.class, name = "setMethodInfoName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionImpl.class, name = "setStatusInterfaceCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionImpl.class, name = "setStatusInterfaceText"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentTransitionStateActionImpl.class, name = "transitionState")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = PaymentUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface PaymentUpdateAction  {





}
