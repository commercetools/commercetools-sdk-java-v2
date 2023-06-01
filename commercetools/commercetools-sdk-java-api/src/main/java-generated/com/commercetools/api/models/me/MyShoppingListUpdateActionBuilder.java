package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListAddLineItemAction;
import com.commercetools.api.models.me.MyShoppingListAddTextLineItemAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityAction;
import com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderAction;
import com.commercetools.api.models.me.MyShoppingListChangeNameAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import com.commercetools.api.models.me.MyShoppingListRemoveLineItemAction;
import com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemAction;
import com.commercetools.api.models.me.MyShoppingListSetCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.me.MyShoppingListSetDescriptionAction;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionAction;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyShoppingListUpdateActionBuilder {

    public com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder addLineItemBuilder() {
       return com.commercetools.api.models.me.MyShoppingListAddLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder addTextLineItemBuilder() {
       return com.commercetools.api.models.me.MyShoppingListAddTextLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeLineItemsOrderActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder changeTextLineItemNameBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder changeTextLineItemQuantityBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder changeTextLineItemsOrderBuilder() {
       return com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder removeLineItemBuilder() {
       return com.commercetools.api.models.me.MyShoppingListRemoveLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder removeTextLineItemBuilder() {
       return com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder setTextLineItemCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder setTextLineItemCustomTypeBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder setTextLineItemDescriptionBuilder() {
       return com.commercetools.api.models.me.MyShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * factory method for an instance of MyShoppingListUpdateActionBuilder
     * @return builder 
     */
    public static MyShoppingListUpdateActionBuilder of() {
        return new MyShoppingListUpdateActionBuilder();
    }

}
