
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetKeyAction shoppingListSetKeyAction = ShoppingListSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetKeyActionImpl.class)
public interface ShoppingListSetKeyAction extends ShoppingListUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ShoppingListSetKeyAction of() {
        return new ShoppingListSetKeyActionImpl();
    }

    public static ShoppingListSetKeyAction of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionImpl instance = new ShoppingListSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShoppingListSetKeyActionBuilder builder() {
        return ShoppingListSetKeyActionBuilder.of();
    }

    public static ShoppingListSetKeyActionBuilder builder(final ShoppingListSetKeyAction template) {
        return ShoppingListSetKeyActionBuilder.of(template);
    }

    default <T> T withShoppingListSetKeyAction(Function<ShoppingListSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetKeyAction ofUnset() {
        return ShoppingListSetKeyAction.of();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetKeyAction>";
            }
        };
    }
}
