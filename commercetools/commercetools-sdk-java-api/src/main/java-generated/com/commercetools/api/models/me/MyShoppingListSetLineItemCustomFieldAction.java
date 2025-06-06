
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyShoppingListSetLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetLineItemCustomFieldAction myShoppingListSetLineItemCustomFieldAction = MyShoppingListSetLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetLineItemCustomFieldAction
     */
    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *  <p>Unique identifier of an the ShoppingListLineItem. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Unique identifier of an the ShoppingListLineItem. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyShoppingListSetLineItemCustomFieldAction
     */
    public static MyShoppingListSetLineItemCustomFieldAction of() {
        return new MyShoppingListSetLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetLineItemCustomFieldAction of(
            final MyShoppingListSetLineItemCustomFieldAction template) {
        MyShoppingListSetLineItemCustomFieldActionImpl instance = new MyShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MyShoppingListSetLineItemCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetLineItemCustomFieldAction deepCopy(
            @Nullable final MyShoppingListSetLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetLineItemCustomFieldActionImpl instance = new MyShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetLineItemCustomFieldAction
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomFieldActionBuilder builder() {
        return MyShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomFieldActionBuilder builder(
            final MyShoppingListSetLineItemCustomFieldAction template) {
        return MyShoppingListSetLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetLineItemCustomFieldAction(
            Function<MyShoppingListSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetLineItemCustomFieldAction>";
            }
        };
    }
}
