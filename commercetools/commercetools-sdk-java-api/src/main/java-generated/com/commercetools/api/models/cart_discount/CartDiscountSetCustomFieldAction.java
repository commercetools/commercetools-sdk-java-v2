
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetCustomFieldAction cartDiscountSetCustomFieldAction = CartDiscountSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomFieldActionImpl.class)
public interface CartDiscountSetCustomFieldAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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
     * @return instance of CartDiscountSetCustomFieldAction
     */
    public static CartDiscountSetCustomFieldAction of() {
        return new CartDiscountSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetCustomFieldAction of(final CartDiscountSetCustomFieldAction template) {
        CartDiscountSetCustomFieldActionImpl instance = new CartDiscountSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CartDiscountSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetCustomFieldAction deepCopy(@Nullable final CartDiscountSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetCustomFieldActionImpl instance = new CartDiscountSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetCustomFieldAction
     * @return builder
     */
    public static CartDiscountSetCustomFieldActionBuilder builder() {
        return CartDiscountSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetCustomFieldActionBuilder builder(final CartDiscountSetCustomFieldAction template) {
        return CartDiscountSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetCustomFieldAction(Function<CartDiscountSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartDiscountSetCustomFieldAction ofUnset(final String name) {
        return CartDiscountSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetCustomFieldAction>";
            }
        };
    }
}
