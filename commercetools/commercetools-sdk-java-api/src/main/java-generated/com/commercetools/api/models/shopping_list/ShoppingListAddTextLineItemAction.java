
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListAddTextLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListAddTextLineItemAction shoppingListAddTextLineItemAction = ShoppingListAddTextLineItemAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListAddTextLineItemActionImpl.class)
public interface ShoppingListAddTextLineItemAction extends ShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<ShoppingListAddTextLineItemAction> {

    String ADD_TEXT_LINE_ITEM = "addTextLineItem";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public static ShoppingListAddTextLineItemAction of() {
        return new ShoppingListAddTextLineItemActionImpl();
    }

    public static ShoppingListAddTextLineItemAction of(final ShoppingListAddTextLineItemAction template) {
        ShoppingListAddTextLineItemActionImpl instance = new ShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ShoppingListAddTextLineItemActionBuilder builder() {
        return ShoppingListAddTextLineItemActionBuilder.of();
    }

    public static ShoppingListAddTextLineItemActionBuilder builder(final ShoppingListAddTextLineItemAction template) {
        return ShoppingListAddTextLineItemActionBuilder.of(template);
    }

    default <T> T withShoppingListAddTextLineItemAction(Function<ShoppingListAddTextLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListAddTextLineItemAction>";
            }
        };
    }
}
