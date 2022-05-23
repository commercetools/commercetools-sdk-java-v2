
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetItemShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetItemShippingAddressCustomFieldAction orderSetItemShippingAddressCustomFieldAction = OrderSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface OrderSetItemShippingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    /**
     <>
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     <*  <p>Name of the Custom Field.</p>>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     <*  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setAddressKey(final String addressKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetItemShippingAddressCustomFieldAction of() {
        return new OrderSetItemShippingAddressCustomFieldActionImpl();
    }

    public static OrderSetItemShippingAddressCustomFieldAction of(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        OrderSetItemShippingAddressCustomFieldActionImpl instance = new OrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetItemShippingAddressCustomFieldAction(
            Function<OrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetItemShippingAddressCustomFieldAction>";
            }
        };
    }
}
