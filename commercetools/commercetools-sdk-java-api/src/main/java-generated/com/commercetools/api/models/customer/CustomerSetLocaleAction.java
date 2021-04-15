
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetLocaleActionImpl.class)
public interface CustomerSetLocaleAction extends CustomerUpdateAction {

    String SET_LOCALE = "setLocale";

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static CustomerSetLocaleAction of() {
        return new CustomerSetLocaleActionImpl();
    }

    public static CustomerSetLocaleAction of(final CustomerSetLocaleAction template) {
        CustomerSetLocaleActionImpl instance = new CustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static CustomerSetLocaleActionBuilder builder() {
        return CustomerSetLocaleActionBuilder.of();
    }

    public static CustomerSetLocaleActionBuilder builder(final CustomerSetLocaleAction template) {
        return CustomerSetLocaleActionBuilder.of(template);
    }

    default <T> T withCustomerSetLocaleAction(Function<CustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
