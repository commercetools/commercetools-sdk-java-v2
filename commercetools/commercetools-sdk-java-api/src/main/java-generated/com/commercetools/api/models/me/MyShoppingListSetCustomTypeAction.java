
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
 * MyShoppingListSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetCustomTypeAction myShoppingListSetCustomTypeAction = MyShoppingListSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetCustomTypeActionImpl.class)
public interface MyShoppingListSetCustomTypeAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the MyShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the MyShoppingList.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the MyShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the MyShoppingList.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyShoppingListSetCustomTypeAction
     */
    public static MyShoppingListSetCustomTypeAction of() {
        return new MyShoppingListSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetCustomTypeAction of(final MyShoppingListSetCustomTypeAction template) {
        MyShoppingListSetCustomTypeActionImpl instance = new MyShoppingListSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetCustomTypeAction deepCopy(
            @Nullable final MyShoppingListSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetCustomTypeActionImpl instance = new MyShoppingListSetCustomTypeActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetCustomTypeAction
     * @return builder
     */
    public static MyShoppingListSetCustomTypeActionBuilder builder() {
        return MyShoppingListSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetCustomTypeActionBuilder builder(final MyShoppingListSetCustomTypeAction template) {
        return MyShoppingListSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetCustomTypeAction(Function<MyShoppingListSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetCustomTypeAction>";
            }
        };
    }
}
