
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerSetSalutationActionImpl;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetSalutationActionImpl.class)
public interface MyCustomerSetSalutationAction extends MyCustomerUpdateAction {

    @JsonProperty("salutation")
    public String getSalutation();

    public void setSalutation(final String salutation);

    public static MyCustomerSetSalutationAction of() {
        return new MyCustomerSetSalutationActionImpl();
    }

    public static MyCustomerSetSalutationAction of(final MyCustomerSetSalutationAction template) {
        MyCustomerSetSalutationActionImpl instance = new MyCustomerSetSalutationActionImpl();
        instance.setSalutation(template.getSalutation());
        return instance;
    }

    public static MyCustomerSetSalutationActionBuilder builder() {
        return MyCustomerSetSalutationActionBuilder.of();
    }

    public static MyCustomerSetSalutationActionBuilder builder(final MyCustomerSetSalutationAction template) {
        return MyCustomerSetSalutationActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetSalutationAction(Function<MyCustomerSetSalutationAction, T> helper) {
        return helper.apply(this);
    }
}
