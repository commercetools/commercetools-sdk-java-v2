
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerGroupSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetCustomFieldAction customerGroupSetCustomFieldAction = CustomerGroupSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomFieldActionImpl.class)
public interface CustomerGroupSetCustomFieldAction extends CustomerGroupUpdateAction {

    /**
     * discriminator value for CustomerGroupSetCustomFieldAction
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
     * @return instance of CustomerGroupSetCustomFieldAction
     */
    public static CustomerGroupSetCustomFieldAction of() {
        return new CustomerGroupSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupSetCustomFieldAction of(final CustomerGroupSetCustomFieldAction template) {
        CustomerGroupSetCustomFieldActionImpl instance = new CustomerGroupSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CustomerGroupSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupSetCustomFieldAction deepCopy(
            @Nullable final CustomerGroupSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CustomerGroupSetCustomFieldActionImpl instance = new CustomerGroupSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupSetCustomFieldAction
     * @return builder
     */
    public static CustomerGroupSetCustomFieldActionBuilder builder() {
        return CustomerGroupSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CustomerGroupSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetCustomFieldActionBuilder builder(final CustomerGroupSetCustomFieldAction template) {
        return CustomerGroupSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupSetCustomFieldAction(Function<CustomerGroupSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerGroupSetCustomFieldAction ofUnset(final String name) {
        return CustomerGroupSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetCustomFieldAction>";
            }
        };
    }
}
