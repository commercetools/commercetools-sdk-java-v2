
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListRemoveTextLineItemActionImpl.class)
public interface ShoppingListRemoveTextLineItemAction extends ShoppingListUpdateAction {

    String REMOVE_TEXT_LINE_ITEM = "removeTextLineItem";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);

    public void setQuantity(final Long quantity);

    public static ShoppingListRemoveTextLineItemAction of() {
        return new ShoppingListRemoveTextLineItemActionImpl();
    }

    public static ShoppingListRemoveTextLineItemAction of(final ShoppingListRemoveTextLineItemAction template) {
        ShoppingListRemoveTextLineItemActionImpl instance = new ShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ShoppingListRemoveTextLineItemActionBuilder builder() {
        return ShoppingListRemoveTextLineItemActionBuilder.of();
    }

    public static ShoppingListRemoveTextLineItemActionBuilder builder(
            final ShoppingListRemoveTextLineItemAction template) {
        return ShoppingListRemoveTextLineItemActionBuilder.of(template);
    }

    default <T> T withShoppingListRemoveTextLineItemAction(Function<ShoppingListRemoveTextLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
