
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = PaymentUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<PaymentUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public PaymentUpdateAction copyDeep();

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

        if (!(template instanceof PaymentUpdateActionImpl)) {
            return template.copyDeep();
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
