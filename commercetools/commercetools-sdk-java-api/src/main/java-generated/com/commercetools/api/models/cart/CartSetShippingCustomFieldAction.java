
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingCustomFieldAction cartSetShippingCustomFieldAction = CartSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingCustomFieldActionImpl.class)
public interface CartSetShippingCustomFieldAction extends CartUpdateAction {

    String SET_SHIPPING_CUSTOM_FIELD = "setShippingCustomField";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setShippingKey(final String shippingKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetShippingCustomFieldAction of() {
        return new CartSetShippingCustomFieldActionImpl();
    }

    public static CartSetShippingCustomFieldAction of(final CartSetShippingCustomFieldAction template) {
        CartSetShippingCustomFieldActionImpl instance = new CartSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetShippingCustomFieldActionBuilder builder() {
        return CartSetShippingCustomFieldActionBuilder.of();
    }

    public static CartSetShippingCustomFieldActionBuilder builder(final CartSetShippingCustomFieldAction template) {
        return CartSetShippingCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetShippingCustomFieldAction(Function<CartSetShippingCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingCustomFieldAction>";
            }
        };
    }
}
