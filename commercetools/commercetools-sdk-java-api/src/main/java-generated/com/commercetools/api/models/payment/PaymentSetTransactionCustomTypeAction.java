
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentSetTransactionCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionCustomTypeAction paymentSetTransactionCustomTypeAction = PaymentSetTransactionCustomTypeAction.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTransactionCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetTransactionCustomTypeActionImpl.class)
public interface PaymentSetTransactionCustomTypeAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetTransactionCustomTypeAction
     */
    String SET_TRANSACTION_CUSTOM_TYPE = "setTransactionCustomType";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>. If the specified <code>transactionId</code> does not exist, the request will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Transaction with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Transaction.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>. If the specified <code>transactionId</code> does not exist, the request will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Transaction with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Transaction.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of PaymentSetTransactionCustomTypeAction
     */
    public static PaymentSetTransactionCustomTypeAction of() {
        return new PaymentSetTransactionCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetTransactionCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetTransactionCustomTypeAction of(final PaymentSetTransactionCustomTypeAction template) {
        PaymentSetTransactionCustomTypeActionImpl instance = new PaymentSetTransactionCustomTypeActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public PaymentSetTransactionCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetTransactionCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetTransactionCustomTypeAction deepCopy(
            @Nullable final PaymentSetTransactionCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetTransactionCustomTypeActionImpl instance = new PaymentSetTransactionCustomTypeActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for PaymentSetTransactionCustomTypeAction
     * @return builder
     */
    public static PaymentSetTransactionCustomTypeActionBuilder builder() {
        return PaymentSetTransactionCustomTypeActionBuilder.of();
    }

    /**
     * create builder for PaymentSetTransactionCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionCustomTypeActionBuilder builder(
            final PaymentSetTransactionCustomTypeAction template) {
        return PaymentSetTransactionCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetTransactionCustomTypeAction(Function<PaymentSetTransactionCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetTransactionCustomTypeAction>";
            }
        };
    }
}
