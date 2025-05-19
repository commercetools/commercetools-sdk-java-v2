
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ShoppingListSetSlugAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetSlugAction shoppingListSetSlugAction = ShoppingListSetSlugAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSlug")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetSlugActionImpl.class)
public interface ShoppingListSetSlugAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetSlugAction
     */
    String SET_SLUG = "setSlug";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     * factory method
     * @return instance of ShoppingListSetSlugAction
     */
    public static ShoppingListSetSlugAction of() {
        return new ShoppingListSetSlugActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetSlugAction of(final ShoppingListSetSlugAction template) {
        ShoppingListSetSlugActionImpl instance = new ShoppingListSetSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public ShoppingListSetSlugAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetSlugAction deepCopy(@Nullable final ShoppingListSetSlugAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetSlugActionImpl instance = new ShoppingListSetSlugActionImpl();
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetSlugAction
     * @return builder
     */
    public static ShoppingListSetSlugActionBuilder builder() {
        return ShoppingListSetSlugActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetSlugActionBuilder builder(final ShoppingListSetSlugAction template) {
        return ShoppingListSetSlugActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetSlugAction(Function<ShoppingListSetSlugAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetSlugAction ofUnset() {
        return ShoppingListSetSlugAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetSlugAction>";
            }
        };
    }
}
