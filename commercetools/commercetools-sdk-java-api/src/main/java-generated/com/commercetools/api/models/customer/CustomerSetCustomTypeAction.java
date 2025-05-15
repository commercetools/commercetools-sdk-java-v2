
package com.commercetools.api.models.customer;

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
 *  <p>Adding or updating a Custom Type on a Customer generates the CustomerCustomTypeSet Message, removing one generates the CustomerCustomTypeRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomTypeAction customerSetCustomTypeAction = CustomerSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomTypeActionImpl.class)
public interface CustomerSetCustomTypeAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CustomerSetCustomTypeAction
     */
    public static CustomerSetCustomTypeAction of() {
        return new CustomerSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCustomTypeAction of(final CustomerSetCustomTypeAction template) {
        CustomerSetCustomTypeActionImpl instance = new CustomerSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public CustomerSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetCustomTypeAction deepCopy(@Nullable final CustomerSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetCustomTypeActionImpl instance = new CustomerSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CustomerSetCustomTypeAction
     * @return builder
     */
    public static CustomerSetCustomTypeActionBuilder builder() {
        return CustomerSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomTypeActionBuilder builder(final CustomerSetCustomTypeAction template) {
        return CustomerSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCustomTypeAction(Function<CustomerSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomTypeAction>";
            }
        };
    }
}
