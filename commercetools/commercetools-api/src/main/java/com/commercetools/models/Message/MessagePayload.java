package com.commercetools.models.Message;

import com.commercetools.models.Message.CategoryCreatedMessagePayload;
import com.commercetools.models.Message.CategorySlugChangedMessagePayload;
import com.commercetools.models.Message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.models.Message.CustomerAddressAddedMessagePayload;
import com.commercetools.models.Message.CustomerAddressChangedMessagePayload;
import com.commercetools.models.Message.CustomerAddressRemovedMessagePayload;
import com.commercetools.models.Message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.models.Message.CustomerCreatedMessagePayload;
import com.commercetools.models.Message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.models.Message.CustomerEmailChangedMessagePayload;
import com.commercetools.models.Message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.models.Message.CustomerGroupSetMessagePayload;
import com.commercetools.models.Message.DeliveryAddedMessagePayload;
import com.commercetools.models.Message.DeliveryAddressSetMessagePayload;
import com.commercetools.models.Message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.models.Message.DeliveryRemovedMessagePayload;
import com.commercetools.models.Message.InventoryEntryDeletedMessagePayload;
import com.commercetools.models.Message.LineItemStateTransitionMessagePayload;
import com.commercetools.models.Message.OrderBillingAddressSetMessagePayload;
import com.commercetools.models.Message.OrderCreatedMessagePayload;
import com.commercetools.models.Message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.models.Message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.models.Message.OrderCustomerSetMessagePayload;
import com.commercetools.models.Message.OrderDeletedMessagePayload;
import com.commercetools.models.Message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.models.Message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.models.Message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.models.Message.OrderEditAppliedMessagePayload;
import com.commercetools.models.Message.OrderImportedMessagePayload;
import com.commercetools.models.Message.OrderLineItemAddedMessagePayload;
import com.commercetools.models.Message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.models.Message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.models.Message.OrderReturnInfoAddedMessagePayload;
import com.commercetools.models.Message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.models.Message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.models.Message.OrderShippingAddressSetMessagePayload;
import com.commercetools.models.Message.OrderShippingInfoSetMessagePayload;
import com.commercetools.models.Message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.models.Message.OrderStateChangedMessagePayload;
import com.commercetools.models.Message.OrderStateTransitionMessagePayload;
import com.commercetools.models.Message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.models.Message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.models.Message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.models.Message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.models.Message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.models.Message.PaymentCreatedMessagePayload;
import com.commercetools.models.Message.PaymentInteractionAddedMessagePayload;
import com.commercetools.models.Message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.models.Message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.models.Message.PaymentTransactionAddedMessagePayload;
import com.commercetools.models.Message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.models.Message.ProductCreatedMessagePayload;
import com.commercetools.models.Message.ProductDeletedMessagePayload;
import com.commercetools.models.Message.ProductImageAddedMessagePayload;
import com.commercetools.models.Message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.models.Message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.models.Message.ProductPublishedMessagePayload;
import com.commercetools.models.Message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.models.Message.ProductSlugChangedMessagePayload;
import com.commercetools.models.Message.ProductStateTransitionMessagePayload;
import com.commercetools.models.Message.ProductUnpublishedMessagePayload;
import com.commercetools.models.Message.ProductVariantDeletedMessagePayload;
import com.commercetools.models.Message.ReviewCreatedMessagePayload;
import com.commercetools.models.Message.ReviewRatingSetMessagePayload;
import com.commercetools.models.Message.ReviewStateTransitionMessagePayload;
import java.lang.String;


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
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderBillingAddressSetMessagePayloadImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderCreatedMessagePayloadImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderCustomerEmailSetMessagePayloadImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderCustomerSetMessagePayloadImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderDeletedMessagePayloadImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderEditAppliedMessagePayloadImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderImportedMessagePayloadImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderLineItemAddedMessagePayloadImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderPaymentStateChangedMessagePayloadImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderReturnInfoAddedMessagePayloadImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderShipmentStateChangedMessagePayloadImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderShippingAddressSetMessagePayloadImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderShippingInfoSetMessagePayloadImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderShippingRateInputSetMessagePayloadImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderStateChangedMessagePayloadImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.OrderStateTransitionMessagePayloadImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ParcelItemsUpdatedMessagePayloadImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentCreatedMessagePayloadImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentInteractionAddedMessagePayloadImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentTransactionAddedMessagePayloadImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductCreatedMessagePayloadImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductDeletedMessagePayloadImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductImageAddedMessagePayloadImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductPublishedMessagePayloadImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductSlugChangedMessagePayloadImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductStateTransitionMessagePayloadImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductUnpublishedMessagePayloadImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ProductVariantDeletedMessagePayloadImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ReviewCreatedMessagePayloadImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ReviewRatingSetMessagePayloadImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.ReviewStateTransitionMessagePayloadImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CategoryCreatedMessagePayloadImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CategorySlugChangedMessagePayloadImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerAddressAddedMessagePayloadImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerAddressChangedMessagePayloadImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerAddressRemovedMessagePayloadImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerCompanyNameSetMessagePayloadImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerCreatedMessagePayloadImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerEmailChangedMessagePayloadImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerEmailVerifiedMessagePayloadImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.CustomerGroupSetMessagePayloadImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.DeliveryAddedMessagePayloadImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.DeliveryAddressSetMessagePayloadImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.DeliveryRemovedMessagePayloadImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.InventoryEntryDeletedMessagePayloadImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.Message.LineItemStateTransitionMessagePayloadImpl.class, name = "LineItemStateTransition")
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