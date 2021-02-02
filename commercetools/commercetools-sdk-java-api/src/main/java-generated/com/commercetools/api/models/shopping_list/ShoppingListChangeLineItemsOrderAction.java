
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeLineItemsOrderActionImpl.class)
public interface ShoppingListChangeLineItemsOrderAction extends ShoppingListUpdateAction {

    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    @JsonIgnore
    public void setLineItemOrder(final String... lineItemOrder);

    public void setLineItemOrder(final List<String> lineItemOrder);

    public static ShoppingListChangeLineItemsOrderAction of() {
        return new ShoppingListChangeLineItemsOrderActionImpl();
    }

    public static ShoppingListChangeLineItemsOrderAction of(final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionImpl instance = new ShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder builder() {
        return ShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder builder(
            final ShoppingListChangeLineItemsOrderAction template) {
        return ShoppingListChangeLineItemsOrderActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeLineItemsOrderAction(
            Function<ShoppingListChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
