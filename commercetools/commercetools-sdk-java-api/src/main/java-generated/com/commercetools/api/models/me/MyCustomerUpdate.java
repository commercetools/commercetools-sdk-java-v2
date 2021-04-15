
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerUpdateImpl.class)
public interface MyCustomerUpdate
        extends com.commercetools.api.models.ResourceUpdate<MyCustomerUpdate, MyCustomerUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCustomerUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyCustomerUpdateAction... actions);

    public void setActions(final List<MyCustomerUpdateAction> actions);

    public static MyCustomerUpdate of() {
        return new MyCustomerUpdateImpl();
    }

    public static MyCustomerUpdate of(final MyCustomerUpdate template) {
        MyCustomerUpdateImpl instance = new MyCustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyCustomerUpdateBuilder builder() {
        return MyCustomerUpdateBuilder.of();
    }

    public static MyCustomerUpdateBuilder builder(final MyCustomerUpdate template) {
        return MyCustomerUpdateBuilder.of(template);
    }

    default <T> T withMyCustomerUpdate(Function<MyCustomerUpdate, T> helper) {
        return helper.apply(this);
    }
}
