
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomFieldActionImpl.class)
public interface CartDiscountSetCustomFieldAction extends CartDiscountUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

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

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartDiscountSetCustomFieldAction of() {
        return new CartDiscountSetCustomFieldActionImpl();
    }

    public static CartDiscountSetCustomFieldAction of(final CartDiscountSetCustomFieldAction template) {
        CartDiscountSetCustomFieldActionImpl instance = new CartDiscountSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartDiscountSetCustomFieldActionBuilder builder() {
        return CartDiscountSetCustomFieldActionBuilder.of();
    }

    public static CartDiscountSetCustomFieldActionBuilder builder(final CartDiscountSetCustomFieldAction template) {
        return CartDiscountSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetCustomFieldAction(Function<CartDiscountSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartDiscountSetCustomFieldAction ofUnset(final String name) {
        return CartDiscountSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetCustomFieldAction>";
            }
        };
    }
}
