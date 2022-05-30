
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

/**
 * ShoppingListChangeTextLineItemNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemNameAction shoppingListChangeTextLineItemNameAction = ShoppingListChangeTextLineItemNameAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeTextLineItemNameActionImpl.class)
public interface ShoppingListChangeTextLineItemNameAction extends ShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEM_NAME = "changeTextLineItemName";

    /**
     *
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setTextLineItemId(final String textLineItemId);

    public void setName(final LocalizedString name);

    public static ShoppingListChangeTextLineItemNameAction of() {
        return new ShoppingListChangeTextLineItemNameActionImpl();
    }

    public static ShoppingListChangeTextLineItemNameAction of(final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionImpl instance = new ShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder builder() {
        return ShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder builder(
            final ShoppingListChangeTextLineItemNameAction template) {
        return ShoppingListChangeTextLineItemNameActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeTextLineItemNameAction(
            Function<ShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeTextLineItemNameAction>";
            }
        };
    }
}
