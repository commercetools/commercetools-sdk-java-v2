package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.api.models.payment.PaymentAddTransactionAction;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.api.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.api.models.payment.PaymentSetCustomerAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.models.payment.PaymentSetKeyAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction;
import com.commercetools.api.models.payment.PaymentTransitionStateAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * PaymentUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentUpdateAction paymentUpdateAction = PaymentUpdateAction.addInterfaceInteractionBuilder()
 *             type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionImpl.class, name = PaymentAddInterfaceInteractionAction.ADD_INTERFACE_INTERACTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentAddTransactionActionImpl.class, name = PaymentAddTransactionAction.ADD_TRANSACTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionImpl.class, name = PaymentChangeAmountPlannedAction.CHANGE_AMOUNT_PLANNED),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionImpl.class, name = PaymentChangeTransactionInteractionIdAction.CHANGE_TRANSACTION_INTERACTION_ID),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionStateActionImpl.class, name = PaymentChangeTransactionStateAction.CHANGE_TRANSACTION_STATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionImpl.class, name = PaymentChangeTransactionTimestampAction.CHANGE_TRANSACTION_TIMESTAMP),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetAnonymousIdActionImpl.class, name = PaymentSetAnonymousIdAction.SET_ANONYMOUS_ID),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomFieldActionImpl.class, name = PaymentSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomTypeActionImpl.class, name = PaymentSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetCustomerActionImpl.class, name = PaymentSetCustomerAction.SET_CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetInterfaceIdActionImpl.class, name = PaymentSetInterfaceIdAction.SET_INTERFACE_ID),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetKeyActionImpl.class, name = PaymentSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionImpl.class, name = PaymentSetMethodInfoInterfaceAction.SET_METHOD_INFO_INTERFACE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionImpl.class, name = PaymentSetMethodInfoMethodAction.SET_METHOD_INFO_METHOD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionImpl.class, name = PaymentSetMethodInfoNameAction.SET_METHOD_INFO_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionImpl.class, name = PaymentSetStatusInterfaceCodeAction.SET_STATUS_INTERFACE_CODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionImpl.class, name = PaymentSetStatusInterfaceTextAction.SET_STATUS_INTERFACE_TEXT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionImpl.class, name = PaymentSetTransactionCustomFieldAction.SET_TRANSACTION_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionImpl.class, name = PaymentSetTransactionCustomTypeAction.SET_TRANSACTION_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.payment.PaymentTransitionStateActionImpl.class, name = PaymentTransitionStateAction.TRANSITION_STATE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = PaymentUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = PaymentUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface PaymentUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<PaymentUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of PaymentUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentUpdateAction deepCopy(@Nullable final PaymentUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction) {
            return com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction.deepCopy((com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentAddTransactionAction) {
            return com.commercetools.api.models.payment.PaymentAddTransactionAction.deepCopy((com.commercetools.api.models.payment.PaymentAddTransactionAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction) {
            return com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction.deepCopy((com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction) {
            return com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction.deepCopy((com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentChangeTransactionStateAction) {
            return com.commercetools.api.models.payment.PaymentChangeTransactionStateAction.deepCopy((com.commercetools.api.models.payment.PaymentChangeTransactionStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction) {
            return com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction.deepCopy((com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetAnonymousIdAction) {
            return com.commercetools.api.models.payment.PaymentSetAnonymousIdAction.deepCopy((com.commercetools.api.models.payment.PaymentSetAnonymousIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetCustomFieldAction) {
            return com.commercetools.api.models.payment.PaymentSetCustomFieldAction.deepCopy((com.commercetools.api.models.payment.PaymentSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetCustomTypeAction) {
            return com.commercetools.api.models.payment.PaymentSetCustomTypeAction.deepCopy((com.commercetools.api.models.payment.PaymentSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetCustomerAction) {
            return com.commercetools.api.models.payment.PaymentSetCustomerAction.deepCopy((com.commercetools.api.models.payment.PaymentSetCustomerAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetInterfaceIdAction) {
            return com.commercetools.api.models.payment.PaymentSetInterfaceIdAction.deepCopy((com.commercetools.api.models.payment.PaymentSetInterfaceIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetKeyAction) {
            return com.commercetools.api.models.payment.PaymentSetKeyAction.deepCopy((com.commercetools.api.models.payment.PaymentSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction) {
            return com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction.deepCopy((com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction) {
            return com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction.deepCopy((com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction) {
            return com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction.deepCopy((com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction) {
            return com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction.deepCopy((com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction) {
            return com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction.deepCopy((com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction) {
            return com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction.deepCopy((com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction) {
            return com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction.deepCopy((com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.payment.PaymentTransitionStateAction) {
            return com.commercetools.api.models.payment.PaymentTransitionStateAction.deepCopy((com.commercetools.api.models.payment.PaymentTransitionStateAction)template);
        }
        PaymentUpdateActionImpl instance = new PaymentUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addInterfaceInteraction subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder addInterfaceInteractionBuilder() {
       return com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder.of();
    }
    /**
     * builder for addTransaction subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder addTransactionBuilder() {
       return com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder.of();
    }
    /**
     * builder for changeAmountPlanned subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder.of();
    }
    /**
     * builder for changeTransactionInteractionId subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder changeTransactionInteractionIdBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder.of();
    }
    /**
     * builder for changeTransactionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder changeTransactionStateBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder.of();
    }
    /**
     * builder for changeTransactionTimestamp subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder changeTransactionTimestampBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder.of();
    }
    /**
     * builder for setAnonymousId subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
       return com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder.of();
    }
    /**
     * builder for setInterfaceId subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder setInterfaceIdBuilder() {
       return com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.payment.PaymentSetKeyActionBuilder.of();
    }
    /**
     * builder for setMethodInfoInterface subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder.of();
    }
    /**
     * builder for setMethodInfoMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder.of();
    }
    /**
     * builder for setMethodInfoName subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder.of();
    }
    /**
     * builder for setStatusInterfaceCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder setStatusInterfaceCodeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder.of();
    }
    /**
     * builder for setStatusInterfaceText subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder setStatusInterfaceTextBuilder() {
       return com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder.of();
    }
    /**
     * builder for setTransactionCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
       return com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder.of();
    }
    /**
     * builder for setTransactionCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder setTransactionCustomTypeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder.of();
    }
    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentUpdateAction(Function<PaymentUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentUpdateAction>";
            }
        };
    }
}
