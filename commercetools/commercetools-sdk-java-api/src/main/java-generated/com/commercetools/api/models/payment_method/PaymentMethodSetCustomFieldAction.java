
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Custom Field to a PaymentMethod generates the PaymentMethodCustomFieldAdded Message, removing one generates the PaymentMethodCustomFieldRemoved Message, and updating an existing one generates the PaymentMethodCustomFieldChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetCustomFieldAction paymentMethodSetCustomFieldAction = PaymentMethodSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodSetCustomFieldActionImpl.class)
public interface PaymentMethodSetCustomFieldAction extends PaymentMethodUpdateAction {

    /**
     * discriminator value for PaymentMethodSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodSetCustomFieldAction
     */
    public static PaymentMethodSetCustomFieldAction of() {
        return new PaymentMethodSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodSetCustomFieldAction of(final PaymentMethodSetCustomFieldAction template) {
        PaymentMethodSetCustomFieldActionImpl instance = new PaymentMethodSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodSetCustomFieldAction deepCopy(
            @Nullable final PaymentMethodSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        PaymentMethodSetCustomFieldActionImpl instance = new PaymentMethodSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodSetCustomFieldAction
     * @return builder
     */
    public static PaymentMethodSetCustomFieldActionBuilder builder() {
        return PaymentMethodSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for PaymentMethodSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetCustomFieldActionBuilder builder(final PaymentMethodSetCustomFieldAction template) {
        return PaymentMethodSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodSetCustomFieldAction(Function<PaymentMethodSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodSetCustomFieldAction>";
            }
        };
    }
}
