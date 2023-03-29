
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ShoppingList.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListResourceIdentifier shoppingListResourceIdentifier = ShoppingListResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListResourceIdentifierImpl.class)
public interface ShoppingListResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ShoppingList> {

    /**
     * discriminator value for ShoppingListResourceIdentifier
     */
    String SHOPPING_LIST = "shopping-list";

    /**
     *  <p>Unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ShoppingListResourceIdentifier
     */
    public static ShoppingListResourceIdentifier of() {
        return new ShoppingListResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListResourceIdentifier of(final ShoppingListResourceIdentifier template) {
        ShoppingListResourceIdentifierImpl instance = new ShoppingListResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListResourceIdentifier deepCopy(@Nullable final ShoppingListResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ShoppingListResourceIdentifierImpl instance = new ShoppingListResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ShoppingListResourceIdentifier
     * @return builder
     */
    public static ShoppingListResourceIdentifierBuilder builder() {
        return ShoppingListResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ShoppingListResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListResourceIdentifierBuilder builder(final ShoppingListResourceIdentifier template) {
        return ShoppingListResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListResourceIdentifier(Function<ShoppingListResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListResourceIdentifier>";
            }
        };
    }
}
