
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomFieldActionImpl.class)
public interface CustomerSetCustomFieldAction extends CustomerUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static CustomerSetCustomFieldAction of() {
        return new CustomerSetCustomFieldActionImpl();
    }

    public static CustomerSetCustomFieldAction of(final CustomerSetCustomFieldAction template) {
        CustomerSetCustomFieldActionImpl instance = new CustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerSetCustomFieldActionBuilder builder() {
        return CustomerSetCustomFieldActionBuilder.of();
    }

    public static CustomerSetCustomFieldActionBuilder builder(final CustomerSetCustomFieldAction template) {
        return CustomerSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCustomerSetCustomFieldAction(Function<CustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomFieldAction>";
            }
        };
    }
}
