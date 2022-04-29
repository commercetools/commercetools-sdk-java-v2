
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentAddTransactionActionImpl.class, name = MyPaymentAddTransactionAction.ADD_TRANSACTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionImpl.class, name = MyPaymentChangeAmountPlannedAction.CHANGE_AMOUNT_PLANNED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetCustomFieldActionImpl.class, name = MyPaymentSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionImpl.class, name = MyPaymentSetMethodInfoInterfaceAction.SET_METHOD_INFO_INTERFACE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionImpl.class, name = MyPaymentSetMethodInfoMethodAction.SET_METHOD_INFO_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionImpl.class, name = MyPaymentSetMethodInfoNameAction.SET_METHOD_INFO_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionImpl.class, name = MyPaymentSetTransactionCustomFieldAction.SET_TRANSACTION_CUSTOM_FIELD) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyPaymentUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyPaymentUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MyPaymentUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyPaymentUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder addTransactionBuilder() {
        return com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
        return com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder.of();
    }

    default <T> T withMyPaymentUpdateAction(Function<MyPaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentUpdateAction>";
            }
        };
    }
}
