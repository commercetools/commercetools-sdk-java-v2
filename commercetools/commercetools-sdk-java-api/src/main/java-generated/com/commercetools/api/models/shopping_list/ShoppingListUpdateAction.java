package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction;
import com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction;
import com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetStoreAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ShoppingListUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListUpdateAction shoppingListUpdateAction = ShoppingListUpdateAction.addLineItemBuilder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionImpl.class, name = ShoppingListAddLineItemAction.ADD_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionImpl.class, name = ShoppingListAddTextLineItemAction.ADD_TEXT_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionImpl.class, name = ShoppingListChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionImpl.class, name = ShoppingListChangeLineItemsOrderAction.CHANGE_LINE_ITEMS_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionImpl.class, name = ShoppingListChangeNameAction.CHANGE_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionImpl.class, name = ShoppingListChangeTextLineItemNameAction.CHANGE_TEXT_LINE_ITEM_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl.class, name = ShoppingListChangeTextLineItemQuantityAction.CHANGE_TEXT_LINE_ITEM_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl.class, name = ShoppingListChangeTextLineItemsOrderAction.CHANGE_TEXT_LINE_ITEMS_ORDER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionImpl.class, name = ShoppingListRemoveLineItemAction.REMOVE_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionImpl.class, name = ShoppingListRemoveTextLineItemAction.REMOVE_TEXT_LINE_ITEM),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionImpl.class, name = ShoppingListSetAnonymousIdAction.SET_ANONYMOUS_ID),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionImpl.class, name = ShoppingListSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionImpl.class, name = ShoppingListSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionImpl.class, name = ShoppingListSetCustomerAction.SET_CUSTOMER),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class, name = ShoppingListSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionImpl.class, name = ShoppingListSetDescriptionAction.SET_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionImpl.class, name = ShoppingListSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionImpl.class, name = ShoppingListSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionImpl.class, name = ShoppingListSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionImpl.class, name = ShoppingListSetSlugAction.SET_SLUG),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionImpl.class, name = ShoppingListSetStoreAction.SET_STORE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionImpl.class, name = ShoppingListSetTextLineItemCustomFieldAction.SET_TEXT_LINE_ITEM_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionImpl.class, name = ShoppingListSetTextLineItemCustomTypeAction.SET_TEXT_LINE_ITEM_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionImpl.class, name = ShoppingListSetTextLineItemDescriptionAction.SET_TEXT_LINE_ITEM_DESCRIPTION)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ShoppingListUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = ShoppingListUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ShoppingListUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ShoppingListUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of ShoppingListUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListUpdateAction deepCopy(@Nullable final ShoppingListUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetCustomerAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetSlugAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetStoreAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetStoreAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetStoreAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction) {
            return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction.deepCopy((com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction)template);
        }
        ShoppingListUpdateActionImpl instance = new ShoppingListUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder.of();
    }
    /**
     * builder for addTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder.of();
    }
    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder.of();
    }
    /**
     * builder for changeLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder.of();
    }
    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder.of();
    }
    /**
     * builder for changeTextLineItemName subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder.of();
    }
    /**
     * builder for changeTextLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }
    /**
     * builder for changeTextLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }
    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder.of();
    }
    /**
     * builder for removeTextLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder.of();
    }
    /**
     * builder for setAnonymousId subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomer subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder.of();
    }
    /**
     * builder for setDeleteDaysAfterLastModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder.of();
    }
    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }
    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }
    /**
     * builder for setSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder setSlugBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder.of();
    }
    /**
     * builder for setStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder setStoreBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder.of();
    }
    /**
     * builder for setTextLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }
    /**
     * builder for setTextLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }
    /**
     * builder for setTextLineItemDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListUpdateAction(Function<ShoppingListUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListUpdateAction>";
            }
        };
    }
}
