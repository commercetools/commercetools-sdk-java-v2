
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomFieldActionImpl.class)
public interface CustomerGroupSetCustomFieldAction extends CustomerGroupUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
