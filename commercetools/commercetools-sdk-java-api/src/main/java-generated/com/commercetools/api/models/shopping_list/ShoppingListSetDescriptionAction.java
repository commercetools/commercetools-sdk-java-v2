
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDescriptionActionImpl.class)
public interface ShoppingListSetDescriptionAction extends ShoppingListUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static ShoppingListSetDescriptionAction of() {
        return new ShoppingListSetDescriptionActionImpl();
    }

    public static ShoppingListSetDescriptionAction of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShoppingListSetDescriptionActionBuilder builder() {
        return ShoppingListSetDescriptionActionBuilder.of();
    }

    public static ShoppingListSetDescriptionActionBuilder builder(final ShoppingListSetDescriptionAction template) {
        return ShoppingListSetDescriptionActionBuilder.of(template);
    }

    default <T> T withShoppingListSetDescriptionAction(Function<ShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetDescriptionAction>";
            }
        };
    }
}
