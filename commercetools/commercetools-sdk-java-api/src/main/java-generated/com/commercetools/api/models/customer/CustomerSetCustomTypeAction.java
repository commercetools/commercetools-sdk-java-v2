
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
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Customer with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Customer.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Customer.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomTypeAction>";
            }
        };
    }
}
