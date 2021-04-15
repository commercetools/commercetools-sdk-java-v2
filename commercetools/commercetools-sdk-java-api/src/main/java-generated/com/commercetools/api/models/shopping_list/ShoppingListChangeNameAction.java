
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeNameActionImpl.class)
public interface ShoppingListChangeNameAction extends ShoppingListUpdateAction {

    String CHANGE_NAME = "changeName";

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ShoppingListChangeNameAction of() {
        return new ShoppingListChangeNameActionImpl();
    }

    public static ShoppingListChangeNameAction of(final ShoppingListChangeNameAction template) {
        ShoppingListChangeNameActionImpl instance = new ShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ShoppingListChangeNameActionBuilder builder() {
        return ShoppingListChangeNameActionBuilder.of();
    }

    public static ShoppingListChangeNameActionBuilder builder(final ShoppingListChangeNameAction template) {
        return ShoppingListChangeNameActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeNameAction(Function<ShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
