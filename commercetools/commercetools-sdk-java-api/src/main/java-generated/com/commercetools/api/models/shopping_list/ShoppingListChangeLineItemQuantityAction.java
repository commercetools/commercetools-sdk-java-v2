
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeLineItemQuantityActionImpl.class)
public interface ShoppingListChangeLineItemQuantityAction extends ShoppingListUpdateAction {

    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public static ShoppingListChangeLineItemQuantityAction of() {
        return new ShoppingListChangeLineItemQuantityActionImpl();
    }

    public static ShoppingListChangeLineItemQuantityAction of(final ShoppingListChangeLineItemQuantityAction template) {
        ShoppingListChangeLineItemQuantityActionImpl instance = new ShoppingListChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder builder() {
        return ShoppingListChangeLineItemQuantityActionBuilder.of();
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder builder(
            final ShoppingListChangeLineItemQuantityAction template) {
        return ShoppingListChangeLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeLineItemQuantityAction(
            Function<ShoppingListChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
