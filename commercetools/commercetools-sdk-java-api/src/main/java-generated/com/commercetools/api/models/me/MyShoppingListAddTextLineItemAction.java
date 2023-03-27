
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

    /**
     * discriminator value for MyShoppingListAddTextLineItemAction
     */
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

    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of MyShoppingListAddTextLineItemAction
     */
    public static MyShoppingListAddTextLineItemAction of() {
        return new MyShoppingListAddTextLineItemActionImpl();
    }

    /**
     * factory method to copy an instance of MyShoppingListAddTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListAddTextLineItemAction of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionImpl instance = new MyShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListAddTextLineItemAction
     * @return builder
     */
    public static MyShoppingListAddTextLineItemActionBuilder builder() {
        return MyShoppingListAddTextLineItemActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListAddTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListAddTextLineItemActionBuilder builder(
            final MyShoppingListAddTextLineItemAction template) {
        return MyShoppingListAddTextLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListAddTextLineItemAction(Function<MyShoppingListAddTextLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListAddTextLineItemAction>";
            }
        };
    }
}
