
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

    public MyPaymentUpdateAction copyDeep();

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

        if (!(template instanceof MyPaymentUpdateActionImpl)) {
            return template.copyDeep();
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
