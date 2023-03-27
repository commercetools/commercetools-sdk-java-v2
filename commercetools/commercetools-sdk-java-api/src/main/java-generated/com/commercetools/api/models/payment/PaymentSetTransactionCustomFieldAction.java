
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetTransactionCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionCustomFieldAction paymentSetTransactionCustomFieldAction = PaymentSetTransactionCustomFieldAction.builder()
 *             .transactionId("{transactionId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetTransactionCustomFieldActionImpl.class)
public interface PaymentSetTransactionCustomFieldAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetTransactionCustomFieldAction
     */
    String SET_TRANSACTION_CUSTOM_FIELD = "setTransactionCustomField";

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentSetTransactionCustomFieldAction
     */
    public static PaymentSetTransactionCustomFieldAction of() {
        return new PaymentSetTransactionCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of PaymentSetTransactionCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetTransactionCustomFieldAction of(final PaymentSetTransactionCustomFieldAction template) {
        PaymentSetTransactionCustomFieldActionImpl instance = new PaymentSetTransactionCustomFieldActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentSetTransactionCustomFieldAction
     * @return builder
     */
    public static PaymentSetTransactionCustomFieldActionBuilder builder() {
        return PaymentSetTransactionCustomFieldActionBuilder.of();
    }

    /**
     * create builder for PaymentSetTransactionCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionCustomFieldActionBuilder builder(
            final PaymentSetTransactionCustomFieldAction template) {
        return PaymentSetTransactionCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetTransactionCustomFieldAction(
            Function<PaymentSetTransactionCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static PaymentSetTransactionCustomFieldAction ofUnset(final String name, final String transactionId) {
        return PaymentSetTransactionCustomFieldActionBuilder.of().name(name).transactionId(transactionId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetTransactionCustomFieldAction>";
            }
        };
    }
}
