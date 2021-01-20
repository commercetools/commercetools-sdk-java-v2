
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeLineItemsOrderActionImpl.class)
public interface MyShoppingListChangeLineItemsOrderAction extends MyShoppingListUpdateAction {

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
}
