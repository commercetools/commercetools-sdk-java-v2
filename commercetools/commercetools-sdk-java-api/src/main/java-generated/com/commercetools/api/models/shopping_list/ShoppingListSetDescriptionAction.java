
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
 * ShoppingListSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetDescriptionAction shoppingListSetDescriptionAction = ShoppingListSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDescriptionActionImpl.class)
public interface ShoppingListSetDescriptionAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of ShoppingListSetDescriptionAction
     */
    public static ShoppingListSetDescriptionAction of() {
        return new ShoppingListSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetDescriptionAction of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public ShoppingListSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetDescriptionAction deepCopy(@Nullable final ShoppingListSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetDescriptionAction
     * @return builder
     */
    public static ShoppingListSetDescriptionActionBuilder builder() {
        return ShoppingListSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetDescriptionActionBuilder builder(final ShoppingListSetDescriptionAction template) {
        return ShoppingListSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetDescriptionAction(Function<ShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetDescriptionAction>";
            }
        };
    }
}
