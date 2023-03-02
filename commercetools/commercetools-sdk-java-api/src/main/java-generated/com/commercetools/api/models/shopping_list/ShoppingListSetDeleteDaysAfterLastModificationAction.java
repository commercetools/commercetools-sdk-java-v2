
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface ShoppingListSetDeleteDaysAfterLastModificationAction extends ShoppingListUpdateAction {

    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public static ShoppingListSetDeleteDaysAfterLastModificationAction of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationAction of(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        ShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withShoppingListSetDeleteDaysAfterLastModificationAction(
            Function<ShoppingListSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationAction ofUnset() {
        return ShoppingListSetDeleteDaysAfterLastModificationAction.of();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
