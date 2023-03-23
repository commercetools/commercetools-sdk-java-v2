
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomFieldAction shoppingListSetCustomFieldAction = ShoppingListSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetCustomFieldActionImpl.class)
public interface ShoppingListSetCustomFieldAction extends ShoppingListUpdateAction {

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

    public static ShoppingListSetCustomFieldAction of() {
        return new ShoppingListSetCustomFieldActionImpl();
    }

    public static ShoppingListSetCustomFieldAction of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionImpl instance = new ShoppingListSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShoppingListSetCustomFieldActionBuilder builder() {
        return ShoppingListSetCustomFieldActionBuilder.of();
    }

    public static ShoppingListSetCustomFieldActionBuilder builder(final ShoppingListSetCustomFieldAction template) {
        return ShoppingListSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withShoppingListSetCustomFieldAction(Function<ShoppingListSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetCustomFieldAction ofUnset(final String name) {
        return ShoppingListSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetCustomFieldAction>";
            }
        };
    }
}
