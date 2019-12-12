package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order_edit.StagedOrderAddCustomLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddDiscountCodeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddParcelToDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddPaymentAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddReturnInfoAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddShoppingListAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeOrderStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangePaymentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeShipmentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxCalculationModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxRoundingModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderImportCustomLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderImportLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveCustomLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDiscountCodeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemovePaymentAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetBillingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCountryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerEmailAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerGroupAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerIdAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryItemsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemPriceAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTotalPriceAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLocaleAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderNumberAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderTotalTaxAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelItemsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelMeasurementsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelTrackingDataAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnPaymentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnShipmentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingRateInputAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionCustomLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderUpdateItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderUpdateSyncInfoAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderUpdateActionImpl implements StagedOrderUpdateAction {

   private String action;

   @JsonCreator
   StagedOrderUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}