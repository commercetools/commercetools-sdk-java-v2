
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomFieldAction orderEditSetCustomFieldAction = OrderEditSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditSetCustomFieldActionImpl.class)
public interface OrderEditSetCustomFieldAction extends OrderEditUpdateAction {

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

    public static OrderEditSetCustomFieldAction of() {
        return new OrderEditSetCustomFieldActionImpl();
    }

    public static OrderEditSetCustomFieldAction of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionImpl instance = new OrderEditSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetCustomFieldActionBuilder builder() {
        return OrderEditSetCustomFieldActionBuilder.of();
    }

    public static OrderEditSetCustomFieldActionBuilder builder(final OrderEditSetCustomFieldAction template) {
        return OrderEditSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderEditSetCustomFieldAction(Function<OrderEditSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderEditSetCustomFieldAction ofUnset(final String name) {
        return OrderEditSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetCustomFieldAction>";
            }
        };
    }
}
