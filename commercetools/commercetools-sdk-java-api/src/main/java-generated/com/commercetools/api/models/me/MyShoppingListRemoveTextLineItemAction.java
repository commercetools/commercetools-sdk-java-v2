
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListRemoveTextLineItemActionImpl.class)
public interface MyShoppingListRemoveTextLineItemAction extends MyShoppingListUpdateAction {

    String REMOVE_TEXT_LINE_ITEM = "removeTextLineItem";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListRemoveTextLineItemAction of() {
        return new MyShoppingListRemoveTextLineItemActionImpl();
    }

    public static MyShoppingListRemoveTextLineItemAction of(final MyShoppingListRemoveTextLineItemAction template) {
        MyShoppingListRemoveTextLineItemActionImpl instance = new MyShoppingListRemoveTextLineItemActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListRemoveTextLineItemActionBuilder builder() {
        return MyShoppingListRemoveTextLineItemActionBuilder.of();
    }

    public static MyShoppingListRemoveTextLineItemActionBuilder builder(
            final MyShoppingListRemoveTextLineItemAction template) {
        return MyShoppingListRemoveTextLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListRemoveTextLineItemAction(
            Function<MyShoppingListRemoveTextLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
