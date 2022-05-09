
package com.commercetools.api.models.shopping_list;

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
@JsonDeserialize(as = ShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface ShoppingListSetTextLineItemDescriptionAction extends ShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_DESCRIPTION = "setTextLineItemDescription";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setTextLineItemId(final String textLineItemId);

    public void setDescription(final LocalizedString description);

    public static ShoppingListSetTextLineItemDescriptionAction of() {
        return new ShoppingListSetTextLineItemDescriptionActionImpl();
    }

    public static ShoppingListSetTextLineItemDescriptionAction of(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        ShoppingListSetTextLineItemDescriptionActionImpl instance = new ShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShoppingListSetTextLineItemDescriptionActionBuilder builder() {
        return ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    public static ShoppingListSetTextLineItemDescriptionActionBuilder builder(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        return ShoppingListSetTextLineItemDescriptionActionBuilder.of(template);
    }

    default <T> T withShoppingListSetTextLineItemDescriptionAction(
            Function<ShoppingListSetTextLineItemDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetTextLineItemDescriptionAction>";
            }
        };
    }
}
