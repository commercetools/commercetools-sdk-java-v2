
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomTypeActionImpl.class)
public interface MyCustomerSetCustomTypeAction extends MyCustomerUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyCustomerSetCustomTypeAction of() {
        return new MyCustomerSetCustomTypeActionImpl();
    }

    public static MyCustomerSetCustomTypeAction of(final MyCustomerSetCustomTypeAction template) {
        MyCustomerSetCustomTypeActionImpl instance = new MyCustomerSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyCustomerSetCustomTypeActionBuilder builder() {
        return MyCustomerSetCustomTypeActionBuilder.of();
    }

    public static MyCustomerSetCustomTypeActionBuilder builder(final MyCustomerSetCustomTypeAction template) {
        return MyCustomerSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetCustomTypeAction(Function<MyCustomerSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
