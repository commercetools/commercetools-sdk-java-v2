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
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListUpdateActionBuilder {

    public com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListAddLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemNameActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetAnonymousIdActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder setSlugBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetSlugActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder setStoreBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetStoreActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
       return com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * factory method for an instance of ShoppingListUpdateActionBuilder
     * @return builder 
     */
    public static ShoppingListUpdateActionBuilder of() {
        return new ShoppingListUpdateActionBuilder();
    }

}
