
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetSlugActionImpl.class)
public interface ShoppingListSetSlugAction extends ShoppingListUpdateAction {

    String SET_SLUG = "setSlug";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Each slug is unique across a Project, but a ShoppingList can have the same slug for different languages. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code></p>
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static ShoppingListSetSlugAction of() {
        return new ShoppingListSetSlugActionImpl();
    }

    public static ShoppingListSetSlugAction of(final ShoppingListSetSlugAction template) {
        ShoppingListSetSlugActionImpl instance = new ShoppingListSetSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static ShoppingListSetSlugActionBuilder builder() {
        return ShoppingListSetSlugActionBuilder.of();
    }

    public static ShoppingListSetSlugActionBuilder builder(final ShoppingListSetSlugAction template) {
        return ShoppingListSetSlugActionBuilder.of(template);
    }

    default <T> T withShoppingListSetSlugAction(Function<ShoppingListSetSlugAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetSlugAction ofUnset() {
        return new ShoppingListSetSlugActionImpl(null);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetSlugAction>";
            }
        };
    }
}
