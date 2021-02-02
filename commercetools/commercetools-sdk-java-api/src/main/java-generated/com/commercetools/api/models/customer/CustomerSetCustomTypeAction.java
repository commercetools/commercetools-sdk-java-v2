
package com.commercetools.api.models.customer;

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
@JsonDeserialize(as = CustomerSetCustomTypeActionImpl.class)
public interface CustomerSetCustomTypeAction extends CustomerUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
    *  Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CustomerSetCustomTypeAction of() {
        return new CustomerSetCustomTypeActionImpl();
    }

    public static CustomerSetCustomTypeAction of(final CustomerSetCustomTypeAction template) {
        CustomerSetCustomTypeActionImpl instance = new CustomerSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomerSetCustomTypeActionBuilder builder() {
        return CustomerSetCustomTypeActionBuilder.of();
    }

    public static CustomerSetCustomTypeActionBuilder builder(final CustomerSetCustomTypeAction template) {
        return CustomerSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCustomerSetCustomTypeAction(Function<CustomerSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
