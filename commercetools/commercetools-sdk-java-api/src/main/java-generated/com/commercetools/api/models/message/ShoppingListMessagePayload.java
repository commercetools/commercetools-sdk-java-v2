
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListMessagePayload shoppingListMessagePayload = ShoppingListMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShoppingListMessagePayload extends MessagePayload {

    public ShoppingListMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListMessagePayload deepCopy(@Nullable final ShoppingListMessagePayload template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ShoppingListMessagePayloadImpl)) {
            return template.copyDeep();
        }
        ShoppingListMessagePayloadImpl instance = new ShoppingListMessagePayloadImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListMessagePayload(Function<ShoppingListMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListMessagePayload>";
            }
        };
    }
}
