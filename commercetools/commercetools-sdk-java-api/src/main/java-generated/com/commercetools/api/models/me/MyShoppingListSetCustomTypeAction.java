
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

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     <*  <p>Defines the Type that extends the MyShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyShoppingList.</p>>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     <*  <p>Sets the Custom Fields fields for the MyShoppingList.</p>>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyShoppingListSetCustomTypeAction of() {
        return new MyShoppingListSetCustomTypeActionImpl();
    }

    public static MyShoppingListSetCustomTypeAction of(final MyShoppingListSetCustomTypeAction template) {
        MyShoppingListSetCustomTypeActionImpl instance = new MyShoppingListSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyShoppingListSetCustomTypeActionBuilder builder() {
        return MyShoppingListSetCustomTypeActionBuilder.of();
    }

    public static MyShoppingListSetCustomTypeActionBuilder builder(final MyShoppingListSetCustomTypeAction template) {
        return MyShoppingListSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetCustomTypeAction(Function<MyShoppingListSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetCustomTypeAction>";
            }
        };
    }
}
