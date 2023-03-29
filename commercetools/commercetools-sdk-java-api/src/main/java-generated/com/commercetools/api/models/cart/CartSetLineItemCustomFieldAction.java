
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemCustomFieldAction cartSetLineItemCustomFieldAction = CartSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemCustomFieldActionImpl.class)
public interface CartSetLineItemCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemCustomFieldAction
     */
    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

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
     * @return instance of CartSetLineItemCustomFieldAction
     */
    public static CartSetLineItemCustomFieldAction of() {
        return new CartSetLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemCustomFieldAction of(final CartSetLineItemCustomFieldAction template) {
        CartSetLineItemCustomFieldActionImpl instance = new CartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemCustomFieldAction deepCopy(@Nullable final CartSetLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemCustomFieldActionImpl instance = new CartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemCustomFieldAction
     * @return builder
     */
    public static CartSetLineItemCustomFieldActionBuilder builder() {
        return CartSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemCustomFieldActionBuilder builder(final CartSetLineItemCustomFieldAction template) {
        return CartSetLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemCustomFieldAction(Function<CartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetLineItemCustomFieldAction ofUnset(final String name, final String lineItemId) {
        return CartSetLineItemCustomFieldActionBuilder.of().name(name).lineItemId(lineItemId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemCustomFieldAction>";
            }
        };
    }
}
