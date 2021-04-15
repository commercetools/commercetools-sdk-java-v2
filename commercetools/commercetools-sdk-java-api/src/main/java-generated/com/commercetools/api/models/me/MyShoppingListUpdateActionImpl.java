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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListUpdateActionImpl implements MyShoppingListUpdateAction {

    
    private String action;

    @JsonCreator
    MyShoppingListUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public MyShoppingListUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyShoppingListUpdateActionImpl that = (MyShoppingListUpdateActionImpl) o;
    
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
