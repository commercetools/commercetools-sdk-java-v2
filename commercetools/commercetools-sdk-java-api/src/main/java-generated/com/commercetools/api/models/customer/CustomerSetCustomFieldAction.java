
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
