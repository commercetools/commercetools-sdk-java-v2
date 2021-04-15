
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCompanyNameActionImpl.class)
public interface MyCustomerSetCompanyNameAction extends MyCustomerUpdateAction {

    String SET_COMPANY_NAME = "setCompanyName";

    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static MyCustomerSetCompanyNameAction of() {
        return new MyCustomerSetCompanyNameActionImpl();
    }

    public static MyCustomerSetCompanyNameAction of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionImpl instance = new MyCustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public static MyCustomerSetCompanyNameActionBuilder builder() {
        return MyCustomerSetCompanyNameActionBuilder.of();
    }

    public static MyCustomerSetCompanyNameActionBuilder builder(final MyCustomerSetCompanyNameAction template) {
        return MyCustomerSetCompanyNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetCompanyNameAction(Function<MyCustomerSetCompanyNameAction, T> helper) {
        return helper.apply(this);
    }
}
