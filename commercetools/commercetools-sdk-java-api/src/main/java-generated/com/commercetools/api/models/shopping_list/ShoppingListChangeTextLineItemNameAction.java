
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
@JsonDeserialize(as = ShoppingListChangeTextLineItemNameActionImpl.class)
public interface ShoppingListChangeTextLineItemNameAction extends ShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEM_NAME = "changeTextLineItemName";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setTextLineItemId(final String textLineItemId);

    public void setName(final LocalizedString name);

    public static ShoppingListChangeTextLineItemNameAction of() {
        return new ShoppingListChangeTextLineItemNameActionImpl();
    }

    public static ShoppingListChangeTextLineItemNameAction of(final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionImpl instance = new ShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder builder() {
        return ShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder builder(
            final ShoppingListChangeTextLineItemNameAction template) {
        return ShoppingListChangeTextLineItemNameActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeTextLineItemNameAction(
            Function<ShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }
}
