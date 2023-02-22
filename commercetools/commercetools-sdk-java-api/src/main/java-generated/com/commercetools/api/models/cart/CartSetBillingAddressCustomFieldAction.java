
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomFieldAction cartSetBillingAddressCustomFieldAction = CartSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetBillingAddressCustomFieldActionImpl.class)
public interface CartSetBillingAddressCustomFieldAction extends CartUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

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

    public static CartSetBillingAddressCustomFieldAction of() {
        return new CartSetBillingAddressCustomFieldActionImpl();
    }

    public static CartSetBillingAddressCustomFieldAction of(final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionImpl instance = new CartSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetBillingAddressCustomFieldActionBuilder builder() {
        return CartSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static CartSetBillingAddressCustomFieldActionBuilder builder(
            final CartSetBillingAddressCustomFieldAction template) {
        return CartSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetBillingAddressCustomFieldAction(
            Function<CartSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetBillingAddressCustomFieldAction ofUnset(final String name) {
        return CartSetBillingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
