
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemCustomFieldAction orderSetCustomLineItemCustomFieldAction = OrderSetCustomLineItemCustomFieldAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomLineItemCustomFieldActionImpl.class)
public interface OrderSetCustomLineItemCustomFieldAction extends OrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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

    public void setCustomLineItemId(final String customLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetCustomLineItemCustomFieldAction of() {
        return new OrderSetCustomLineItemCustomFieldActionImpl();
    }

    public static OrderSetCustomLineItemCustomFieldAction of(final OrderSetCustomLineItemCustomFieldAction template) {
        OrderSetCustomLineItemCustomFieldActionImpl instance = new OrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder builder() {
        return OrderSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder builder(
            final OrderSetCustomLineItemCustomFieldAction template) {
        return OrderSetCustomLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomLineItemCustomFieldAction(
            Function<OrderSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetCustomLineItemCustomFieldAction ofUnset(final String name, final String customLineItemId) {
        return OrderSetCustomLineItemCustomFieldActionBuilder.of()
                .name(name)
                .customLineItemId(customLineItemId)
                .build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomLineItemCustomFieldAction>";
            }
        };
    }
}
