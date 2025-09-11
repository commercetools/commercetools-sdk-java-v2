
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
 *  <p>Adding a Custom Field to a PaymentMethodInfo generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldAddedMessage" rel="nofollow">PaymentMethodInfoCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldRemovedMessage" rel="nofollow">PaymentMethodInfoCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldChangedMessage" rel="nofollow">PaymentMethodInfoCustomFieldChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoCustomFieldAction paymentSetMethodInfoCustomFieldAction = PaymentSetMethodInfoCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoCustomFieldActionImpl.class)
public interface PaymentSetMethodInfoCustomFieldAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetMethodInfoCustomFieldAction
     */
    String SET_METHOD_INFO_CUSTOM_FIELD = "setMethodInfoCustomField";

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentSetMethodInfoCustomFieldAction
     */
    public static PaymentSetMethodInfoCustomFieldAction of() {
        return new PaymentSetMethodInfoCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentSetMethodInfoCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetMethodInfoCustomFieldAction of(final PaymentSetMethodInfoCustomFieldAction template) {
        PaymentSetMethodInfoCustomFieldActionImpl instance = new PaymentSetMethodInfoCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentSetMethodInfoCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentSetMethodInfoCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentSetMethodInfoCustomFieldAction deepCopy(
            @Nullable final PaymentSetMethodInfoCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        PaymentSetMethodInfoCustomFieldActionImpl instance = new PaymentSetMethodInfoCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentSetMethodInfoCustomFieldAction
     * @return builder
     */
    public static PaymentSetMethodInfoCustomFieldActionBuilder builder() {
        return PaymentSetMethodInfoCustomFieldActionBuilder.of();
    }

    /**
     * create builder for PaymentSetMethodInfoCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomFieldActionBuilder builder(
            final PaymentSetMethodInfoCustomFieldAction template) {
        return PaymentSetMethodInfoCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetMethodInfoCustomFieldAction(Function<PaymentSetMethodInfoCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoCustomFieldAction>";
            }
        };
    }
}
