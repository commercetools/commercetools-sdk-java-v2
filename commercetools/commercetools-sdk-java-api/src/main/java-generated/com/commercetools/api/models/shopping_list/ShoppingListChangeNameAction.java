
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
import jakarta.validation.constraints.NotNull;

/**
 * ShoppingListChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeNameAction shoppingListChangeNameAction = ShoppingListChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeNameActionImpl.class)
public interface ShoppingListChangeNameAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ShoppingListChangeNameAction
     */
    public static ShoppingListChangeNameAction of() {
        return new ShoppingListChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeNameAction of(final ShoppingListChangeNameAction template) {
        ShoppingListChangeNameActionImpl instance = new ShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeNameAction deepCopy(@Nullable final ShoppingListChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeNameActionImpl instance = new ShoppingListChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeNameAction
     * @return builder
     */
    public static ShoppingListChangeNameActionBuilder builder() {
        return ShoppingListChangeNameActionBuilder.of();
    }

    /**
     * create builder for ShoppingListChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeNameActionBuilder builder(final ShoppingListChangeNameAction template) {
        return ShoppingListChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeNameAction(Function<ShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeNameAction>";
            }
        };
    }
}
