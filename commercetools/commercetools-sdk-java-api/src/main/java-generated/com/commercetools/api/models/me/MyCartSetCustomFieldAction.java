
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomFieldActionImpl.class)
public interface MyCartSetCustomFieldAction extends MyCartUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyCartSetCustomFieldAction of() {
        return new MyCartSetCustomFieldActionImpl();
    }

    public static MyCartSetCustomFieldAction of(final MyCartSetCustomFieldAction template) {
        MyCartSetCustomFieldActionImpl instance = new MyCartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyCartSetCustomFieldActionBuilder builder() {
        return MyCartSetCustomFieldActionBuilder.of();
    }

    public static MyCartSetCustomFieldActionBuilder builder(final MyCartSetCustomFieldAction template) {
        return MyCartSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyCartSetCustomFieldAction(Function<MyCartSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
