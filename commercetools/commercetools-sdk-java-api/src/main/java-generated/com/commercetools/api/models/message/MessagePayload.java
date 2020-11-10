package com.commercetools.api.models.message;

import com.commercetools.api.models.message.CategoryCreatedMessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerCreatedMessagePayload;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.DeliveryAddedMessagePayload;
import com.commercetools.api.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerSetMessagePayload;
import com.commercetools.api.models.message.OrderDeletedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.api.models.message.OrderEditAppliedMessagePayload;
import com.commercetools.api.models.message.OrderImportedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemAddedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayload;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.api.models.message.OrderStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderStoreSetMessagePayload;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.api.models.message.PaymentCreatedMessagePayload;
import com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload;
import com.commercetools.api.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.models.message.ReviewStateTransitionMessagePayload;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessagePayloadImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadImpl.class, name = "OrderCustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessagePayloadImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessagePayloadImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessagePayloadImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessagePayloadImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessagePayloadImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessagePayloadImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessagePayloadImpl.class, name = "OrderStoreSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessagePayloadImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadImpl.class, name = "ProductAddedToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessagePayloadImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessagePayloadImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessagePayloadImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessagePayloadImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadImpl.class, name = "ProductRemovedFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessagePayloadImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessagePayloadImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessagePayloadImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessagePayloadImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessagePayloadImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadImpl.class, name = "LineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessagePayloadImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessagePayloadImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessagePayloadImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadImpl.class, name = "InventoryEntryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadImpl.class, name = "InventoryEntryQuantitySet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessagePayloadImpl.class, name = "CustomerGroupSet")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = MessagePayloadImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface MessagePayload  {





    default <T> T withMessagePayload(Function<MessagePayload, T> helper) {
        return helper.apply(this);
    }
}
