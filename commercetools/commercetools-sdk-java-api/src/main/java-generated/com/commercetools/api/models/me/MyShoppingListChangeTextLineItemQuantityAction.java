
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface MyShoppingListChangeTextLineItemQuantityAction extends MyShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEM_QUANTITY = "changeTextLineItemQuantity";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);

    public void setQuantity(final Long quantity);

    public static MyShoppingListChangeTextLineItemQuantityAction of() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl();
    }

    public static MyShoppingListChangeTextLineItemQuantityAction of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionImpl instance = new MyShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder() {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder builder(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        return MyShoppingListChangeTextLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeTextLineItemQuantityAction(
            Function<MyShoppingListChangeTextLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
