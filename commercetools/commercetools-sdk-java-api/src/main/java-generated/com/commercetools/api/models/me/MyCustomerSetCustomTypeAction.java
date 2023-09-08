
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding or updating a Custom Type on a Customer generates the CustomerCustomTypeSet Message, removing one generates the CustomerCustomTypeRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCustomTypeAction myCustomerSetCustomTypeAction = MyCustomerSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomTypeActionImpl.class)
public interface MyCustomerSetCustomTypeAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the MyCustomer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the MyCustomer.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the MyCustomer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the MyCustomer.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyCustomerSetCustomTypeAction
     */
    public static MyCustomerSetCustomTypeAction of() {
        return new MyCustomerSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetCustomTypeAction of(final MyCustomerSetCustomTypeAction template) {
        MyCustomerSetCustomTypeActionImpl instance = new MyCustomerSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetCustomTypeAction deepCopy(@Nullable final MyCustomerSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetCustomTypeActionImpl instance = new MyCustomerSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetCustomTypeAction
     * @return builder
     */
    public static MyCustomerSetCustomTypeActionBuilder builder() {
        return MyCustomerSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetCustomTypeActionBuilder builder(final MyCustomerSetCustomTypeAction template) {
        return MyCustomerSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetCustomTypeAction(Function<MyCustomerSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetCustomTypeAction>";
            }
        };
    }
}
