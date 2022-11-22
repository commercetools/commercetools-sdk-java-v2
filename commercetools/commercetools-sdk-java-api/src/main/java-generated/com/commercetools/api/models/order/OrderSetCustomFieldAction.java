
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomFieldAction orderSetCustomFieldAction = OrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomFieldActionImpl.class)
public interface OrderSetCustomFieldAction extends OrderUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetCustomFieldAction of() {
        return new OrderSetCustomFieldActionImpl();
    }

    public static OrderSetCustomFieldAction of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionImpl instance = new OrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetCustomFieldActionBuilder builder() {
        return OrderSetCustomFieldActionBuilder.of();
    }

    public static OrderSetCustomFieldActionBuilder builder(final OrderSetCustomFieldAction template) {
        return OrderSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomFieldAction(Function<OrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomFieldAction>";
            }
        };
    }
}
