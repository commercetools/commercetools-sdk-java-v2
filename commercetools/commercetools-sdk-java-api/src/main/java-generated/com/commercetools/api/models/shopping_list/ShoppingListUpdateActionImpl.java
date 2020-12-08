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
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomFieldAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemCustomTypeAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListUpdateActionImpl implements ShoppingListUpdateAction {

    private String action;

    @JsonCreator
    ShoppingListUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public ShoppingListUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListUpdateActionImpl that = (ShoppingListUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
