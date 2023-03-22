
package com.commercetools.api.models.me;

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
 * MyShoppingListAddTextLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListAddTextLineItemAction myShoppingListAddTextLineItemAction = MyShoppingListAddTextLineItemAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListAddTextLineItemActionImpl.class)
public interface MyShoppingListAddTextLineItemAction extends MyShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<MyShoppingListAddTextLineItemAction> {

    String ADD_TEXT_LINE_ITEM = "addTextLineItem";

    /**
     *  <p>Name of the TextLineItem.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyShoppingListAddTextLineItemAction of() {
        return new MyShoppingListAddTextLineItemActionImpl();
    }

    public static MyShoppingListAddTextLineItemAction of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionImpl instance = new MyShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyShoppingListAddTextLineItemActionBuilder builder() {
        return MyShoppingListAddTextLineItemActionBuilder.of();
    }

    public static MyShoppingListAddTextLineItemActionBuilder builder(
            final MyShoppingListAddTextLineItemAction template) {
        return MyShoppingListAddTextLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListAddTextLineItemAction(Function<MyShoppingListAddTextLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListAddTextLineItemAction>";
            }
        };
    }
}
