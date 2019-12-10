package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.CategoryCreatedMessagePayload;
import com.commercetools.api.generated.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.api.generated.models.message.CustomerCreatedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.generated.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.api.generated.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.api.generated.models.message.DeliveryAddedMessagePayload;
import com.commercetools.api.generated.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.api.generated.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.api.generated.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.api.generated.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.api.generated.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerGroupSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderDeletedMessagePayload;
import com.commercetools.api.generated.models.message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.api.generated.models.message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.api.generated.models.message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderEditAppliedMessagePayload;
import com.commercetools.api.generated.models.message.OrderImportedMessagePayload;
import com.commercetools.api.generated.models.message.OrderLineItemAddedMessagePayload;
import com.commercetools.api.generated.models.message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessagePayload;
import com.commercetools.api.generated.models.message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.api.generated.models.message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingAddressSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingInfoSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.api.generated.models.message.OrderStateChangedMessagePayload;
import com.commercetools.api.generated.models.message.OrderStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.api.generated.models.message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.api.generated.models.message.PaymentCreatedMessagePayload;
import com.commercetools.api.generated.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.api.generated.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.api.generated.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.api.generated.models.message.ProductAddedToCategoryMessagePayload;
import com.commercetools.api.generated.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.generated.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.generated.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.generated.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.generated.models.message.ProductRemovedFromCategoryMessagePayload;
import com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.generated.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.generated.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.generated.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.generated.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.generated.models.message.ReviewStateTransitionMessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessagePayloadImpl implements MessagePayload {

   private String type;

   @JsonCreator
   MessagePayloadImpl() {
      this.type = "null";
   }
   
   
   
   public String getType(){
      return this.type;
   }


}