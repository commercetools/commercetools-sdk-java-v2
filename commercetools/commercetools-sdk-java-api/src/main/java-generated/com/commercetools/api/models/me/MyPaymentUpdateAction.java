
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyPaymentUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentUpdateAction myPaymentUpdateAction = MyPaymentUpdateAction.addTransactionBuilder()
 *             transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyPaymentUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyPaymentUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of MyPaymentUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentUpdateAction deepCopy(@Nullable final MyPaymentUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentAddTransactionAction) {
            return com.commercetools.api.models.me.MyPaymentAddTransactionAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentAddTransactionAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction) {
            return com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentSetCustomFieldAction) {
            return com.commercetools.api.models.me.MyPaymentSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction) {
            return com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction) {
            return com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction) {
            return com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldAction) {
            return com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldAction
                    .deepCopy((com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldAction) template);
        }
        MyPaymentUpdateActionImpl instance = new MyPaymentUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addTransaction subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder addTransactionBuilder() {
        return com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder.of();
    }

    /**
     * builder for changeAmountPlanned subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
        return com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setMethodInfoInterface subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    /**
     * builder for setMethodInfoMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder.of();
    }

    /**
     * builder for setMethodInfoName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder.of();
    }

    /**
     * builder for setTransactionCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentUpdateAction(Function<MyPaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentUpdateAction>";
            }
        };
    }
}
