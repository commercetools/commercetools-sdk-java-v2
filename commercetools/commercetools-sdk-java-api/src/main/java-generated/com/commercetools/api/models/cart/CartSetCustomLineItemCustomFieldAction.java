
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemCustomFieldAction cartSetCustomLineItemCustomFieldAction = CartSetCustomLineItemCustomFieldAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemCustomFieldActionImpl.class)
public interface CartSetCustomLineItemCustomFieldAction extends CartUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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

    public void setCustomLineItemId(final String customLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetCustomLineItemCustomFieldAction of() {
        return new CartSetCustomLineItemCustomFieldActionImpl();
    }

    public static CartSetCustomLineItemCustomFieldAction of(final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder builder() {
        return CartSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder builder(
            final CartSetCustomLineItemCustomFieldAction template) {
        return CartSetCustomLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemCustomFieldAction(
            Function<CartSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemCustomFieldAction>";
            }
        };
    }
}
