
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
 * MyCartSetLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemCustomFieldAction myCartSetLineItemCustomFieldAction = MyCartSetLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemCustomFieldActionImpl.class)
public interface MyCartSetLineItemCustomFieldAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetLineItemCustomFieldAction
     */
    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
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
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
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
     * @return instance of MyCartSetLineItemCustomFieldAction
     */
    public static MyCartSetLineItemCustomFieldAction of() {
        return new MyCartSetLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetLineItemCustomFieldAction of(final MyCartSetLineItemCustomFieldAction template) {
        MyCartSetLineItemCustomFieldActionImpl instance = new MyCartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MyCartSetLineItemCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetLineItemCustomFieldAction deepCopy(
            @Nullable final MyCartSetLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetLineItemCustomFieldActionImpl instance = new MyCartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyCartSetLineItemCustomFieldAction
     * @return builder
     */
    public static MyCartSetLineItemCustomFieldActionBuilder builder() {
        return MyCartSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyCartSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemCustomFieldActionBuilder builder(final MyCartSetLineItemCustomFieldAction template) {
        return MyCartSetLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetLineItemCustomFieldAction(Function<MyCartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemCustomFieldAction>";
            }
        };
    }
}
