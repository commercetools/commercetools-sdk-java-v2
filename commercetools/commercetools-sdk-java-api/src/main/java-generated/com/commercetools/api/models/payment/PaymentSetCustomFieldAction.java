
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetCustomFieldAction paymentSetCustomFieldAction = PaymentSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetCustomFieldActionImpl.class)
public interface PaymentSetCustomFieldAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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
     * @return instance of PaymentSetCustomFieldAction
     */
    public static PaymentSetCustomFieldAction of() {
        return new PaymentSetCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of PaymentSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentSetCustomFieldAction of(final PaymentSetCustomFieldAction template) {
        PaymentSetCustomFieldActionImpl instance = new PaymentSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentSetCustomFieldAction
     * @return builder
     */
    public static PaymentSetCustomFieldActionBuilder builder() {
        return PaymentSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for PaymentSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetCustomFieldActionBuilder builder(final PaymentSetCustomFieldAction template) {
        return PaymentSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentSetCustomFieldAction(Function<PaymentSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static PaymentSetCustomFieldAction ofUnset(final String name) {
        return PaymentSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetCustomFieldAction>";
            }
        };
    }
}
