package com.commercetools.models.message;

import com.commercetools.models.message.CategoryCreatedMessagePayload;
import com.commercetools.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.models.message.CustomerCreatedMessagePayload;
import com.commercetools.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.models.message.DeliveryAddedMessagePayload;
import com.commercetools.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.models.message.OrderCreatedMessagePayload;
import com.commercetools.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.models.message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.models.message.OrderCustomerSetMessagePayload;
import com.commercetools.models.message.OrderDeletedMessagePayload;
import com.commercetools.models.message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.models.message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.models.message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.models.message.OrderEditAppliedMessagePayload;
import com.commercetools.models.message.OrderImportedMessagePayload;
import com.commercetools.models.message.OrderLineItemAddedMessagePayload;
import com.commercetools.models.message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.models.message.OrderReturnInfoAddedMessagePayload;
import com.commercetools.models.message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.models.message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.models.message.OrderShippingAddressSetMessagePayload;
import com.commercetools.models.message.OrderShippingInfoSetMessagePayload;
import com.commercetools.models.message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.models.message.OrderStateChangedMessagePayload;
import com.commercetools.models.message.OrderStateTransitionMessagePayload;
import com.commercetools.models.message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.models.message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.models.message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.models.message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.models.message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.models.message.PaymentCreatedMessagePayload;
import com.commercetools.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.models.message.ProductCreatedMessagePayload;
import com.commercetools.models.message.ProductDeletedMessagePayload;
import com.commercetools.models.message.ProductImageAddedMessagePayload;
import com.commercetools.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.models.message.ProductPublishedMessagePayload;
import com.commercetools.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.models.message.ReviewCreatedMessagePayload;
import com.commercetools.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.models.message.ReviewStateTransitionMessagePayload;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderBillingAddressSetMessagePayloadImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCreatedMessagePayloadImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomerEmailSetMessagePayloadImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomerSetMessagePayloadImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDeletedMessagePayloadImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderEditAppliedMessagePayloadImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderImportedMessagePayloadImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderLineItemAddedMessagePayloadImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderPaymentStateChangedMessagePayloadImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderReturnInfoAddedMessagePayloadImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShipmentStateChangedMessagePayloadImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingAddressSetMessagePayloadImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingInfoSetMessagePayloadImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingRateInputSetMessagePayloadImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderStateChangedMessagePayloadImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderStateTransitionMessagePayloadImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelItemsUpdatedMessagePayloadImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentCreatedMessagePayloadImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentInteractionAddedMessagePayloadImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentTransactionAddedMessagePayloadImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductCreatedMessagePayloadImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductDeletedMessagePayloadImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductImageAddedMessagePayloadImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPublishedMessagePayloadImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductSlugChangedMessagePayloadImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductStateTransitionMessagePayloadImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductUnpublishedMessagePayloadImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewCreatedMessagePayloadImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewRatingSetMessagePayloadImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CategoryCreatedMessagePayloadImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CategorySlugChangedMessagePayloadImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressAddedMessagePayloadImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressChangedMessagePayloadImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressRemovedMessagePayloadImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerCompanyNameSetMessagePayloadImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerCreatedMessagePayloadImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerEmailChangedMessagePayloadImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerEmailVerifiedMessagePayloadImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerGroupSetMessagePayloadImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryAddedMessagePayloadImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryAddressSetMessagePayloadImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryRemovedMessagePayloadImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.InventoryEntryDeletedMessagePayloadImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.LineItemStateTransitionMessagePayloadImpl.class, name = "LineItemStateTransition")
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