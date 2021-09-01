
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This action sets or removes the custom type for an existing customer group.
*  If present, this action overwrites any existing <a href="/../api/projects/custom-fields#custom">custom</a> type and fields.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomTypeActionImpl.class)
public interface CustomerGroupSetCustomTypeAction extends CustomerGroupUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the <a href="/../api/projects/custom-fields#custom">custom</a> type and any existing <a href="/../api/projects/custom-fields">CustomFields</a> are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Valid JSON object, based on the <a href="/../api/projects/types#fielddefinition">FieldDefinitions</a> of the <a href="/../api/projects/types#type">Type</a>.
    *  Sets the <a href="/../api/projects/custom-fields#custom">custom</a> fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CustomerGroupSetCustomTypeAction of() {
        return new CustomerGroupSetCustomTypeActionImpl();
    }

    public static CustomerGroupSetCustomTypeAction of(final CustomerGroupSetCustomTypeAction template) {
        CustomerGroupSetCustomTypeActionImpl instance = new CustomerGroupSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CustomerGroupSetCustomTypeActionBuilder builder() {
        return CustomerGroupSetCustomTypeActionBuilder.of();
    }

    public static CustomerGroupSetCustomTypeActionBuilder builder(final CustomerGroupSetCustomTypeAction template) {
        return CustomerGroupSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCustomerGroupSetCustomTypeAction(Function<CustomerGroupSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
