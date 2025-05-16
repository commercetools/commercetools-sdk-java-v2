
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
 * CartSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomFieldAction cartSetCustomFieldAction = CartSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomFieldActionImpl.class)
public interface CartSetCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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
     * @return instance of CartSetCustomFieldAction
     */
    public static CartSetCustomFieldAction of() {
        return new CartSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomFieldAction of(final CartSetCustomFieldAction template) {
        CartSetCustomFieldActionImpl instance = new CartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CartSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomFieldAction deepCopy(@Nullable final CartSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomFieldActionImpl instance = new CartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomFieldAction
     * @return builder
     */
    public static CartSetCustomFieldActionBuilder builder() {
        return CartSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomFieldActionBuilder builder(final CartSetCustomFieldAction template) {
        return CartSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomFieldAction(Function<CartSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetCustomFieldAction ofUnset(final String name) {
        return CartSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomFieldAction>";
            }
        };
    }
}
