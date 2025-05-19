
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetDeleteDaysAfterLastModificationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetDeleteDaysAfterLastModificationAction shoppingListSetDeleteDaysAfterLastModificationAction = ShoppingListSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDeleteDaysAfterLastModification")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface ShoppingListSetDeleteDaysAfterLastModificationAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetDeleteDaysAfterLastModificationAction
     */
    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     * factory method
     * @return instance of ShoppingListSetDeleteDaysAfterLastModificationAction
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationAction of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationAction of(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        ShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public ShoppingListSetDeleteDaysAfterLastModificationAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetDeleteDaysAfterLastModificationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetDeleteDaysAfterLastModificationAction deepCopy(
            @Nullable final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetDeleteDaysAfterLastModificationAction
     * @return builder
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetDeleteDaysAfterLastModificationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetDeleteDaysAfterLastModificationAction(
            Function<ShoppingListSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationAction ofUnset() {
        return ShoppingListSetDeleteDaysAfterLastModificationAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
