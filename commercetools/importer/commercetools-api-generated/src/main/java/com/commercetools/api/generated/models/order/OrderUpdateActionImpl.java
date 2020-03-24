package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderAddDeliveryAction;
import com.commercetools.api.generated.models.order.OrderAddItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderAddParcelToDeliveryAction;
import com.commercetools.api.generated.models.order.OrderAddPaymentAction;
import com.commercetools.api.generated.models.order.OrderAddReturnInfoAction;
import com.commercetools.api.generated.models.order.OrderChangeOrderStateAction;
import com.commercetools.api.generated.models.order.OrderChangePaymentStateAction;
import com.commercetools.api.generated.models.order.OrderChangeShipmentStateAction;
import com.commercetools.api.generated.models.order.OrderImportCustomLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderImportLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderRemoveDeliveryAction;
import com.commercetools.api.generated.models.order.OrderRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.generated.models.order.OrderRemovePaymentAction;
import com.commercetools.api.generated.models.order.OrderSetBillingAddressAction;
import com.commercetools.api.generated.models.order.OrderSetCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order.OrderSetCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetCustomerEmailAction;
import com.commercetools.api.generated.models.order.OrderSetCustomerIdAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order.OrderSetLocaleAction;
import com.commercetools.api.generated.models.order.OrderSetOrderNumberAction;
import com.commercetools.api.generated.models.order.OrderSetParcelItemsAction;
import com.commercetools.api.generated.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.api.generated.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.api.generated.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.api.generated.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.api.generated.models.order.OrderSetShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderTransitionStateAction;
import com.commercetools.api.generated.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderUpdateSyncInfoAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderUpdateActionImpl implements OrderUpdateAction {

   private String action;

   @JsonCreator
   OrderUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}