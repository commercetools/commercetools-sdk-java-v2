
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
@JsonDeserialize(as = MyCartUpdateImpl.class)
public interface MyCartUpdate extends com.commercetools.api.models.ResourceUpdate<MyCartUpdate, MyCartUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCartUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyCartUpdateAction... actions);

    public void setActions(final List<MyCartUpdateAction> actions);

    public static MyCartUpdate of() {
        return new MyCartUpdateImpl();
    }

    public static MyCartUpdate of(final MyCartUpdate template) {
        MyCartUpdateImpl instance = new MyCartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyCartUpdateBuilder builder() {
        return MyCartUpdateBuilder.of();
    }

    public static MyCartUpdateBuilder builder(final MyCartUpdate template) {
        return MyCartUpdateBuilder.of(template);
    }

    default <T> T withMyCartUpdate(Function<MyCartUpdate, T> helper) {
        return helper.apply(this);
    }
}
