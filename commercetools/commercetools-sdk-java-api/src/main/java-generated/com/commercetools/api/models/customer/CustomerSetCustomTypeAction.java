
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

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerSetCustomTypeAction customerSetCustomTypeAction = CustomerSetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomTypeActionImpl.class)
public interface CustomerSetCustomTypeAction extends CustomerUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
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
