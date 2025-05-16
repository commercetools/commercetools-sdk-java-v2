
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>This action sets or removes the custom type for an existing CustomerGroup. If present, this action overwrites any existing custom type and fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetCustomTypeAction customerGroupSetCustomTypeAction = CustomerGroupSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetCustomTypeActionImpl.class)
public interface CustomerGroupSetCustomTypeAction extends CustomerGroupUpdateAction {

    /**
     * discriminator value for CustomerGroupSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CustomerGroupSetCustomTypeAction
     */
    public static CustomerGroupSetCustomTypeAction of() {
        return new CustomerGroupSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupSetCustomTypeAction of(final CustomerGroupSetCustomTypeAction template) {
        CustomerGroupSetCustomTypeActionImpl instance = new CustomerGroupSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public CustomerGroupSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupSetCustomTypeAction deepCopy(@Nullable final CustomerGroupSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CustomerGroupSetCustomTypeActionImpl instance = new CustomerGroupSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupSetCustomTypeAction
     * @return builder
     */
    public static CustomerGroupSetCustomTypeActionBuilder builder() {
        return CustomerGroupSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CustomerGroupSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetCustomTypeActionBuilder builder(final CustomerGroupSetCustomTypeAction template) {
        return CustomerGroupSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupSetCustomTypeAction(Function<CustomerGroupSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetCustomTypeAction>";
            }
        };
    }
}
