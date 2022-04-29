
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomFieldActionImpl.class)
public interface MyCustomerSetCustomFieldAction extends MyCustomerUpdateAction {

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

    public static MyCustomerSetCustomFieldAction of() {
        return new MyCustomerSetCustomFieldActionImpl();
    }

    public static MyCustomerSetCustomFieldAction of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionImpl instance = new MyCustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyCustomerSetCustomFieldActionBuilder builder() {
        return MyCustomerSetCustomFieldActionBuilder.of();
    }

    public static MyCustomerSetCustomFieldActionBuilder builder(final MyCustomerSetCustomFieldAction template) {
        return MyCustomerSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetCustomFieldAction(Function<MyCustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetCustomFieldAction>";
            }
        };
    }
}
