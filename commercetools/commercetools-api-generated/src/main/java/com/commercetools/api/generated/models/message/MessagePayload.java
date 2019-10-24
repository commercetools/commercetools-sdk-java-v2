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
import com.commercetools.api.generated.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.generated.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.generated.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.generated.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.generated.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.generated.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.generated.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.generated.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.generated.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.generated.models.message.ReviewStateTransitionMessagePayload;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderBillingAddressSetMessagePayloadImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCreatedMessagePayloadImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessagePayloadImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomerSetMessagePayloadImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDeletedMessagePayloadImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderEditAppliedMessagePayloadImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderImportedMessagePayloadImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderLineItemAddedMessagePayloadImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessagePayloadImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessagePayloadImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShipmentStateChangedMessagePayloadImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingAddressSetMessagePayloadImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingInfoSetMessagePayloadImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessagePayloadImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderStateChangedMessagePayloadImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderStateTransitionMessagePayloadImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessagePayloadImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentCreatedMessagePayloadImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentInteractionAddedMessagePayloadImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentTransactionAddedMessagePayloadImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductCreatedMessagePayloadImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductDeletedMessagePayloadImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductImageAddedMessagePayloadImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPublishedMessagePayloadImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductSlugChangedMessagePayloadImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductStateTransitionMessagePayloadImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductUnpublishedMessagePayloadImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewCreatedMessagePayloadImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewRatingSetMessagePayloadImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CategoryCreatedMessagePayloadImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CategorySlugChangedMessagePayloadImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressAddedMessagePayloadImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressChangedMessagePayloadImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressRemovedMessagePayloadImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerCompanyNameSetMessagePayloadImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerCreatedMessagePayloadImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerEmailChangedMessagePayloadImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerEmailVerifiedMessagePayloadImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerGroupSetMessagePayloadImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryAddedMessagePayloadImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryAddressSetMessagePayloadImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryRemovedMessagePayloadImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.InventoryEntryDeletedMessagePayloadImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.LineItemStateTransitionMessagePayloadImpl.class, name = "LineItemStateTransition")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MessagePayload  {


   


}