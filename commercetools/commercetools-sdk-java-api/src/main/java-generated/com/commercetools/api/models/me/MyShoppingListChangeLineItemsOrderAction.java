
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeLineItemsOrderAction extends MyShoppingListUpdateAction {

    String CHANGE_LINE_ITEMS_ORDER = "changeLineItemsOrder";

    @NotNull
    @JsonProperty("lineItemOrder")
    public List<String> getLineItemOrder();

    @JsonIgnore
    public void setLineItemOrder(final String... lineItemOrder);

    public void setLineItemOrder(final List<String> lineItemOrder);

    public static MyShoppingListChangeLineItemsOrderAction of() {
        return new MyShoppingListChangeLineItemsOrderActionImpl();
    }

    public static MyShoppingListChangeLineItemsOrderAction of(final MyShoppingListChangeLineItemsOrderAction template) {
        MyShoppingListChangeLineItemsOrderActionImpl instance = new MyShoppingListChangeLineItemsOrderActionImpl();
        instance.setLineItemOrder(template.getLineItemOrder());
        return instance;
    }

    public static MyShoppingListChangeLineItemsOrderActionBuilder builder() {
        return MyShoppingListChangeLineItemsOrderActionBuilder.of();
    }

    public static MyShoppingListChangeLineItemsOrderActionBuilder builder(
            final MyShoppingListChangeLineItemsOrderAction template) {
        return MyShoppingListChangeLineItemsOrderActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeLineItemsOrderAction(
            Function<MyShoppingListChangeLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemsOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeLineItemsOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeLineItemsOrderAction>";
            }
        };
    }
}
