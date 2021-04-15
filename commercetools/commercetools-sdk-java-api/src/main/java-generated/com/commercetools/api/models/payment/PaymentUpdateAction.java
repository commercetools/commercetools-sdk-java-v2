
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionImpl.class, name = PaymentAddInterfaceInteractionAction.ADD_INTERFACE_INTERACTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddTransactionActionImpl.class, name = PaymentAddTransactionAction.ADD_TRANSACTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionImpl.class, name = PaymentChangeAmountPlannedAction.CHANGE_AMOUNT_PLANNED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionImpl.class, name = PaymentChangeTransactionInteractionIdAction.CHANGE_TRANSACTION_INTERACTION_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionStateActionImpl.class, name = PaymentChangeTransactionStateAction.CHANGE_TRANSACTION_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionImpl.class, name = PaymentChangeTransactionTimestampAction.CHANGE_TRANSACTION_TIMESTAMP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAmountPaidActionImpl.class, name = PaymentSetAmountPaidAction.SET_AMOUNT_PAID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAmountRefundedActionImpl.class, name = PaymentSetAmountRefundedAction.SET_AMOUNT_REFUNDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAnonymousIdActionImpl.class, name = PaymentSetAnonymousIdAction.SET_ANONYMOUS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAuthorizationActionImpl.class, name = PaymentSetAuthorizationAction.SET_AUTHORIZATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomFieldActionImpl.class, name = PaymentSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomTypeActionImpl.class, name = PaymentSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomerActionImpl.class, name = PaymentSetCustomerAction.SET_CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetExternalIdActionImpl.class, name = PaymentSetExternalIdAction.SET_EXTERNAL_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetInterfaceIdActionImpl.class, name = PaymentSetInterfaceIdAction.SET_INTERFACE_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetKeyActionImpl.class, name = PaymentSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionImpl.class, name = PaymentSetMethodInfoInterfaceAction.SET_METHOD_INFO_INTERFACE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionImpl.class, name = PaymentSetMethodInfoMethodAction.SET_METHOD_INFO_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionImpl.class, name = PaymentSetMethodInfoNameAction.SET_METHOD_INFO_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionImpl.class, name = PaymentSetStatusInterfaceCodeAction.SET_STATUS_INTERFACE_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionImpl.class, name = PaymentSetStatusInterfaceTextAction.SET_STATUS_INTERFACE_TEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentTransitionStateActionImpl.class, name = PaymentTransitionStateAction.TRANSITION_STATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PaymentUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<PaymentUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withPaymentUpdateAction(Function<PaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
