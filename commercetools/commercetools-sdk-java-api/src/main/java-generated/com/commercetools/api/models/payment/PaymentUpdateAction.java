
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionImpl.class, name = PaymentSetTransactionCustomFieldAction.SET_TRANSACTION_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionImpl.class, name = PaymentSetTransactionCustomTypeAction.SET_TRANSACTION_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentTransitionStateActionImpl.class, name = PaymentTransitionStateAction.TRANSITION_STATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = PaymentUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PaymentUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<PaymentUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder addInterfaceInteractionBuilder() {
        return com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder addTransactionBuilder() {
        return com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
        return com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder changeTransactionInteractionIdBuilder() {
        return com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder changeTransactionStateBuilder() {
        return com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder changeTransactionTimestampBuilder() {
        return com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetAmountPaidActionBuilder setAmountPaidBuilder() {
        return com.commercetools.api.models.payment.PaymentSetAmountPaidActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetAmountRefundedActionBuilder setAmountRefundedBuilder() {
        return com.commercetools.api.models.payment.PaymentSetAmountRefundedActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
        return com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetAuthorizationActionBuilder setAuthorizationBuilder() {
        return com.commercetools.api.models.payment.PaymentSetAuthorizationActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder setCustomerBuilder() {
        return com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetExternalIdActionBuilder setExternalIdBuilder() {
        return com.commercetools.api.models.payment.PaymentSetExternalIdActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder setInterfaceIdBuilder() {
        return com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.payment.PaymentSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
        return com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
        return com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
        return com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder setStatusInterfaceCodeBuilder() {
        return com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder setStatusInterfaceTextBuilder() {
        return com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
        return com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder setTransactionCustomTypeBuilder() {
        return com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder.of();
    }

    default <T> T withPaymentUpdateAction(Function<PaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentUpdateAction>";
            }
        };
    }
}
