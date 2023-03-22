
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomFieldActionImpl.class)
public interface CustomerGroupSetCustomFieldAction extends CustomerGroupUpdateAction {

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

    public void setName(final String name);

    public void setValue(final Object value);

    public static CustomerGroupSetCustomFieldAction of() {
        return new CustomerGroupSetCustomFieldActionImpl();
    }

    public static CustomerGroupSetCustomFieldAction of(final CustomerGroupSetCustomFieldAction template) {
        CustomerGroupSetCustomFieldActionImpl instance = new CustomerGroupSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerGroupSetCustomFieldActionBuilder builder() {
        return CustomerGroupSetCustomFieldActionBuilder.of();
    }

    public static CustomerGroupSetCustomFieldActionBuilder builder(final CustomerGroupSetCustomFieldAction template) {
        return CustomerGroupSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCustomerGroupSetCustomFieldAction(Function<CustomerGroupSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerGroupSetCustomFieldAction ofUnset(final String name) {
        return CustomerGroupSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetCustomFieldAction>";
            }
        };
    }
}
