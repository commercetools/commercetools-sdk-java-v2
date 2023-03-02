
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetLineItemCustomFieldAction of() {
        return new CartSetLineItemCustomFieldActionImpl();
    }

    public static CartSetLineItemCustomFieldAction of(final CartSetLineItemCustomFieldAction template) {
        CartSetLineItemCustomFieldActionImpl instance = new CartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetLineItemCustomFieldActionBuilder builder() {
        return CartSetLineItemCustomFieldActionBuilder.of();
    }

    public static CartSetLineItemCustomFieldActionBuilder builder(final CartSetLineItemCustomFieldAction template) {
        return CartSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemCustomFieldAction(Function<CartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetLineItemCustomFieldAction ofUnset(final String name, final String lineItemId) {
        return CartSetLineItemCustomFieldActionBuilder.of().name(name).lineItemId(lineItemId).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemCustomFieldAction>";
            }
        };
    }
}
