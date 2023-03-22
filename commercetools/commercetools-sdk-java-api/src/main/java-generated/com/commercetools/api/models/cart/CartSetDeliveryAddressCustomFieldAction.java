
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDeliveryAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeliveryAddressCustomFieldAction cartSetDeliveryAddressCustomFieldAction = CartSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetDeliveryAddressCustomFieldActionImpl.class)
public interface CartSetDeliveryAddressCustomFieldAction extends CartUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

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

    public void setDeliveryId(final String deliveryId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetDeliveryAddressCustomFieldAction of() {
        return new CartSetDeliveryAddressCustomFieldActionImpl();
    }

    public static CartSetDeliveryAddressCustomFieldAction of(final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionImpl instance = new CartSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder builder() {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder builder(
            final CartSetDeliveryAddressCustomFieldAction template) {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetDeliveryAddressCustomFieldAction(
            Function<CartSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetDeliveryAddressCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeliveryAddressCustomFieldAction>";
            }
        };
    }
}
