
package com.commercetools.api.models.me;

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
import jakarta.validation.constraints.NotNull;

/**
 * MyShoppingListSetLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetLineItemCustomTypeAction myShoppingListSetLineItemCustomTypeAction = MyShoppingListSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetLineItemCustomTypeActionImpl.class)
public interface MyShoppingListSetLineItemCustomTypeAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetLineItemCustomTypeAction
     */
    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *  <p>Unique identifier of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Unique identifier of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">ShoppingListLineItem</a> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ShoppingListLineItem with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShoppingListLineItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the ShoppingListLineItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyShoppingListSetLineItemCustomTypeAction
     */
    public static MyShoppingListSetLineItemCustomTypeAction of() {
        return new MyShoppingListSetLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetLineItemCustomTypeAction of(
            final MyShoppingListSetLineItemCustomTypeAction template) {
        MyShoppingListSetLineItemCustomTypeActionImpl instance = new MyShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public MyShoppingListSetLineItemCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetLineItemCustomTypeAction deepCopy(
            @Nullable final MyShoppingListSetLineItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetLineItemCustomTypeActionImpl instance = new MyShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetLineItemCustomTypeAction
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomTypeActionBuilder builder() {
        return MyShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomTypeActionBuilder builder(
            final MyShoppingListSetLineItemCustomTypeAction template) {
        return MyShoppingListSetLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetLineItemCustomTypeAction(
            Function<MyShoppingListSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetLineItemCustomTypeAction>";
            }
        };
    }
}
