
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListRemoveLineItemActionImpl.class)
public interface MyShoppingListRemoveLineItemAction extends MyShoppingListUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListRemoveLineItemAction of() {
        return new MyShoppingListRemoveLineItemActionImpl();
    }

    public static MyShoppingListRemoveLineItemAction of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionImpl instance = new MyShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListRemoveLineItemActionBuilder builder() {
        return MyShoppingListRemoveLineItemActionBuilder.of();
    }

    public static MyShoppingListRemoveLineItemActionBuilder builder(final MyShoppingListRemoveLineItemAction template) {
        return MyShoppingListRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListRemoveLineItemAction(Function<MyShoppingListRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
