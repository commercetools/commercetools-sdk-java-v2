
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
 <p>This action sets or removes the custom type for an existing CustomerGroup. If present, this action overwrites any existing custom type and fields.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupSetCustomTypeAction customerGroupSetCustomTypeAction = CustomerGroupSetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomTypeActionImpl.class)
public interface CustomerGroupSetCustomTypeAction extends CustomerGroupUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetCustomTypeAction>";
            }
        };
    }
}
