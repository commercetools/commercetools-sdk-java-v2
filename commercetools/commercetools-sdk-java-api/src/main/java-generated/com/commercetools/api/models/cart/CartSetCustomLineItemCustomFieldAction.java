
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartSetCustomLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemCustomFieldAction cartSetCustomLineItemCustomFieldAction = CartSetCustomLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomLineItemCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemCustomFieldActionImpl.class)
public interface CartSetCustomLineItemCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomLineItemCustomFieldAction
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CartSetCustomLineItemCustomFieldAction
     */
    public static CartSetCustomLineItemCustomFieldAction of() {
        return new CartSetCustomLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomLineItemCustomFieldAction of(final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CartSetCustomLineItemCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetCustomLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomLineItemCustomFieldAction deepCopy(
            @Nullable final CartSetCustomLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomLineItemCustomFieldAction
     * @return builder
     */
    public static CartSetCustomLineItemCustomFieldActionBuilder builder() {
        return CartSetCustomLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemCustomFieldActionBuilder builder(
            final CartSetCustomLineItemCustomFieldAction template) {
        return CartSetCustomLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomLineItemCustomFieldAction(
            Function<CartSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetCustomLineItemCustomFieldAction ofUnset(final String name, final String customLineItemId) {
        return CartSetCustomLineItemCustomFieldActionBuilder.of().name(name).customLineItemId(customLineItemId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemCustomFieldAction>";
            }
        };
    }
}
