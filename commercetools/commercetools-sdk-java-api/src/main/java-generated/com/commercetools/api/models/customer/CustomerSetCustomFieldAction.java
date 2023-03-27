
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomFieldAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomFieldActionImpl.class)
public interface CustomerSetCustomFieldAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomFieldAction
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
     * @return instance of CustomerSetCustomFieldAction
     */
    public static CustomerSetCustomFieldAction of() {
        return new CustomerSetCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomFieldAction of(final CustomerSetCustomFieldAction template) {
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
