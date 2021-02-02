
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetSlugActionImpl.class)
public interface ShoppingListSetSlugAction extends ShoppingListUpdateAction {

    String SET_SLUG = "setSlug";

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
}
