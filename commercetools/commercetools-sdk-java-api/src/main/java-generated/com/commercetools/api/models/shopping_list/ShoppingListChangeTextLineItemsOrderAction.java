
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface ShoppingListChangeTextLineItemsOrderAction extends ShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEMS_ORDER = "changeTextLineItemsOrder";

    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    @JsonIgnore
    public void setTextLineItemOrder(final String... textLineItemOrder);

    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    public static ShoppingListChangeTextLineItemsOrderAction of() {
        return new ShoppingListChangeTextLineItemsOrderActionImpl();
    }

    public static ShoppingListChangeTextLineItemsOrderAction of(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionImpl instance = new ShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder() {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeTextLineItemsOrderAction(
            Function<ShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeTextLineItemsOrderAction>";
            }
        };
    }
}
