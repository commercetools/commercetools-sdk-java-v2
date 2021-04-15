package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetKeyAction;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionImpl.class, name = OrderEditAddStagedActionAction.ADD_STAGED_ACTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomFieldActionImpl.class, name = OrderEditSetBillingAddressCustomFieldAction.SET_BILLING_ADDRESS_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetBillingAddressCustomTypeActionImpl.class, name = OrderEditSetBillingAddressCustomTypeAction.SET_BILLING_ADDRESS_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCommentActionImpl.class, name = OrderEditSetCommentAction.SET_COMMENT),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl.class, name = OrderEditSetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionImpl.class, name = OrderEditSetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomFieldActionImpl.class, name = OrderEditSetDeliveryAddressCustomFieldAction.SET_DELIVERY_ADDRESS_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomTypeActionImpl.class, name = OrderEditSetDeliveryAddressCustomTypeAction.SET_DELIVERY_ADDRESS_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomFieldActionImpl.class, name = OrderEditSetItemShippingAddressCustomFieldAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomTypeActionImpl.class, name = OrderEditSetItemShippingAddressCustomTypeAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetKeyActionImpl.class, name = OrderEditSetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomFieldActionImpl.class, name = OrderEditSetShippingAddressCustomFieldAction.SET_SHIPPING_ADDRESS_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomTypeActionImpl.class, name = OrderEditSetShippingAddressCustomTypeAction.SET_SHIPPING_ADDRESS_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionImpl.class, name = OrderEditSetStagedActionsAction.SET_STAGED_ACTIONS)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = OrderEditUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderEditUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<OrderEditUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withOrderEditUpdateAction(Function<OrderEditUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
