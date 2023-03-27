
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetAnonymousIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetAnonymousIdAction shoppingListSetAnonymousIdAction = ShoppingListSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetAnonymousIdActionImpl.class)
public interface ShoppingListSetAnonymousIdAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetAnonymousIdAction
     */
    String SET_ANONYMOUS_ID = "setAnonymousId";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     * factory method
     * @return instance of ShoppingListSetAnonymousIdAction
     */
    public static ShoppingListSetAnonymousIdAction of() {
        return new ShoppingListSetAnonymousIdActionImpl();
    }

    /**
     * factory method to copy an instance of ShoppingListSetAnonymousIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetAnonymousIdAction of(final ShoppingListSetAnonymousIdAction template) {
        ShoppingListSetAnonymousIdActionImpl instance = new ShoppingListSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetAnonymousIdAction
     * @return builder
     */
    public static ShoppingListSetAnonymousIdActionBuilder builder() {
        return ShoppingListSetAnonymousIdActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetAnonymousIdActionBuilder builder(final ShoppingListSetAnonymousIdAction template) {
        return ShoppingListSetAnonymousIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetAnonymousIdAction(Function<ShoppingListSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetAnonymousIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetAnonymousIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetAnonymousIdAction>";
            }
        };
    }
}
