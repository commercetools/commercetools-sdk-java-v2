
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
 *  <p>Adding a Custom Field to a Customer generates the CustomerCustomFieldAdded Message, removing one generates the CustomerCustomFieldRemoved Message, and updating an existing one generates the CustomerCustomFieldChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCustomFieldAction myCustomerSetCustomFieldAction = MyCustomerSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomFieldActionImpl.class)
public interface MyCustomerSetCustomFieldAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetCustomFieldAction
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
     * @return instance of MyCustomerSetCustomFieldAction
     */
    public static MyCustomerSetCustomFieldAction of() {
        return new MyCustomerSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetCustomFieldAction of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionImpl instance = new MyCustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetCustomFieldAction deepCopy(@Nullable final MyCustomerSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetCustomFieldActionImpl instance = new MyCustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetCustomFieldAction
     * @return builder
     */
    public static MyCustomerSetCustomFieldActionBuilder builder() {
        return MyCustomerSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetCustomFieldActionBuilder builder(final MyCustomerSetCustomFieldAction template) {
        return MyCustomerSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetCustomFieldAction(Function<MyCustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetCustomFieldAction>";
            }
        };
    }
}
