
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface MyShoppingListSetTextLineItemDescriptionAction extends MyShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_DESCRIPTION = "setTextLineItemDescription";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setTextLineItemId(final String textLineItemId);

    public void setDescription(final LocalizedString description);

    public static MyShoppingListSetTextLineItemDescriptionAction of() {
        return new MyShoppingListSetTextLineItemDescriptionActionImpl();
    }

    public static MyShoppingListSetTextLineItemDescriptionAction of(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        MyShoppingListSetTextLineItemDescriptionActionImpl instance = new MyShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static MyShoppingListSetTextLineItemDescriptionActionBuilder builder() {
        return MyShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    public static MyShoppingListSetTextLineItemDescriptionActionBuilder builder(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        return MyShoppingListSetTextLineItemDescriptionActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetTextLineItemDescriptionAction(
            Function<MyShoppingListSetTextLineItemDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetTextLineItemDescriptionAction>";
            }
        };
    }
}
