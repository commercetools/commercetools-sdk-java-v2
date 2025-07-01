
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
 *  <p>Adding a Custom Field to a PaymentMethodInfo generates the PaymentMethodInfoCustomFieldAdded Message, removing one generates the PaymentMethodInfoCustomFieldRemoved Message, and updating an existing one generates the PaymentMethodInfoCustomFieldChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoCustomFieldAction myPaymentSetMethodInfoCustomFieldAction = MyPaymentSetMethodInfoCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMethodInfoCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoCustomFieldActionImpl.class)
public interface MyPaymentSetMethodInfoCustomFieldAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoCustomFieldAction
     */
    String SET_METHOD_INFO_CUSTOM_FIELD = "setMethodInfoCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoCustomFieldAction
     */
    public static MyPaymentSetMethodInfoCustomFieldAction of() {
        return new MyPaymentSetMethodInfoCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoCustomFieldAction of(final MyPaymentSetMethodInfoCustomFieldAction template) {
        MyPaymentSetMethodInfoCustomFieldActionImpl instance = new MyPaymentSetMethodInfoCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MyPaymentSetMethodInfoCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoCustomFieldAction deepCopy(
            @Nullable final MyPaymentSetMethodInfoCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoCustomFieldActionImpl instance = new MyPaymentSetMethodInfoCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoCustomFieldAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomFieldActionBuilder builder() {
        return MyPaymentSetMethodInfoCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomFieldActionBuilder builder(
            final MyPaymentSetMethodInfoCustomFieldAction template) {
        return MyPaymentSetMethodInfoCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoCustomFieldAction(
            Function<MyPaymentSetMethodInfoCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoCustomFieldAction>";
            }
        };
    }
}
