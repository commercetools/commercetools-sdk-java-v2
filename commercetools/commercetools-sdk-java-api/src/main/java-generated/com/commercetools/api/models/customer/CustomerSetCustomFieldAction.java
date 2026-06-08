
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Custom Field to a Customer generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCustomFieldAddedMessage" rel="nofollow">CustomerCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCustomFieldRemovedMessage" rel="nofollow">CustomerCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCustomFieldChangedMessage" rel="nofollow">CustomerCustomFieldChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomFieldAction customerSetCustomFieldAction = CustomerSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomFieldActionImpl.class)
public interface CustomerSetCustomFieldAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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
     * @return instance of CustomerSetCustomFieldAction
     */
    public static CustomerSetCustomFieldAction of() {
        return new CustomerSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomFieldAction of(final CustomerSetCustomFieldAction template) {
        CustomerSetCustomFieldActionImpl instance = new CustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CustomerSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetCustomFieldAction deepCopy(@Nullable final CustomerSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetCustomFieldActionImpl instance = new CustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerSetCustomFieldAction
     * @return builder
     */
    public static CustomerSetCustomFieldActionBuilder builder() {
        return CustomerSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomFieldActionBuilder builder(final CustomerSetCustomFieldAction template) {
        return CustomerSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCustomFieldAction(Function<CustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerSetCustomFieldAction ofUnset(final String name) {
        return CustomerSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomFieldAction>";
            }
        };
    }
}
