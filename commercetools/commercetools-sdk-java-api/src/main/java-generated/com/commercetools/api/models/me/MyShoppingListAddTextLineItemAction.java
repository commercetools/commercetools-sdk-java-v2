
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("addTextLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListAddTextLineItemActionImpl.class)
public interface MyShoppingListAddTextLineItemAction extends MyShoppingListUpdateAction,
        com.commercetools.api.models.CustomizableDraft<MyShoppingListAddTextLineItemAction> {

    /**
     * discriminator value for MyShoppingListAddTextLineItemAction
     */
    String ADD_TEXT_LINE_ITEM = "addTextLineItem";

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

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
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined identifier of the TextLineItem. Must be unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

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
     *  <p>Date and time the TextLineItem is added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>. If not set, the current date and time (UTC) is used.</p>
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
     * factory method to create a shallow copy MyShoppingListAddTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListAddTextLineItemAction of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionImpl instance = new MyShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public MyShoppingListAddTextLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListAddTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListAddTextLineItemAction deepCopy(
            @Nullable final MyShoppingListAddTextLineItemAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListAddTextLineItemActionImpl instance = new MyShoppingListAddTextLineItemActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
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
