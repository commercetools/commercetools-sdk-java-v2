
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

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the MyCustomer with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the MyCustomer.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetCustomTypeAction>";
            }
        };
    }
}
