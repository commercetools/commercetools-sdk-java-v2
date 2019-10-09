package com.commercetools.models.message;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Reference;
import com.commercetools.models.message.CategoryCreatedMessage;
import com.commercetools.models.message.CategorySlugChangedMessage;
import com.commercetools.models.message.CustomLineItemStateTransitionMessage;
import com.commercetools.models.message.CustomerAddressAddedMessage;
import com.commercetools.models.message.CustomerAddressChangedMessage;
import com.commercetools.models.message.CustomerAddressRemovedMessage;
import com.commercetools.models.message.CustomerCompanyNameSetMessage;
import com.commercetools.models.message.CustomerCreatedMessage;
import com.commercetools.models.message.CustomerDateOfBirthSetMessage;
import com.commercetools.models.message.CustomerEmailChangedMessage;
import com.commercetools.models.message.CustomerEmailVerifiedMessage;
import com.commercetools.models.message.CustomerGroupSetMessage;
import com.commercetools.models.message.DeliveryAddedMessage;
import com.commercetools.models.message.DeliveryAddressSetMessage;
import com.commercetools.models.message.DeliveryItemsUpdatedMessage;
import com.commercetools.models.message.DeliveryRemovedMessage;
import com.commercetools.models.message.InventoryEntryDeletedMessage;
import com.commercetools.models.message.LineItemStateTransitionMessage;
import com.commercetools.models.message.OrderBillingAddressSetMessage;
import com.commercetools.models.message.OrderCreatedMessage;
import com.commercetools.models.message.OrderCustomLineItemDiscountSetMessage;
import com.commercetools.models.message.OrderCustomerEmailSetMessage;
import com.commercetools.models.message.OrderCustomerSetMessage;
import com.commercetools.models.message.OrderDeletedMessage;
import com.commercetools.models.message.OrderDiscountCodeAddedMessage;
import com.commercetools.models.message.OrderDiscountCodeRemovedMessage;
import com.commercetools.models.message.OrderDiscountCodeStateSetMessage;
import com.commercetools.models.message.OrderEditAppliedMessage;
import com.commercetools.models.message.OrderImportedMessage;
import com.commercetools.models.message.OrderLineItemAddedMessage;
import com.commercetools.models.message.OrderLineItemDiscountSetMessage;
import com.commercetools.models.message.OrderPaymentStateChangedMessage;
import com.commercetools.models.message.OrderReturnInfoAddedMessage;
import com.commercetools.models.message.OrderReturnShipmentStateChangedMessage;
import com.commercetools.models.message.OrderShipmentStateChangedMessage;
import com.commercetools.models.message.OrderShippingAddressSetMessage;
import com.commercetools.models.message.OrderShippingInfoSetMessage;
import com.commercetools.models.message.OrderShippingRateInputSetMessage;
import com.commercetools.models.message.OrderStateChangedMessage;
import com.commercetools.models.message.OrderStateTransitionMessage;
import com.commercetools.models.message.ParcelAddedToDeliveryMessage;
import com.commercetools.models.message.ParcelItemsUpdatedMessage;
import com.commercetools.models.message.ParcelMeasurementsUpdatedMessage;
import com.commercetools.models.message.ParcelRemovedFromDeliveryMessage;
import com.commercetools.models.message.ParcelTrackingDataUpdatedMessage;
import com.commercetools.models.message.PaymentCreatedMessage;
import com.commercetools.models.message.PaymentInteractionAddedMessage;
import com.commercetools.models.message.PaymentStatusInterfaceCodeSetMessage;
import com.commercetools.models.message.PaymentStatusStateTransitionMessage;
import com.commercetools.models.message.PaymentTransactionAddedMessage;
import com.commercetools.models.message.PaymentTransactionStateChangedMessage;
import com.commercetools.models.message.ProductCreatedMessage;
import com.commercetools.models.message.ProductDeletedMessage;
import com.commercetools.models.message.ProductImageAddedMessage;
import com.commercetools.models.message.ProductPriceDiscountsSetMessage;
import com.commercetools.models.message.ProductPriceExternalDiscountSetMessage;
import com.commercetools.models.message.ProductPublishedMessage;
import com.commercetools.models.message.ProductRevertedStagedChangesMessage;
import com.commercetools.models.message.ProductSlugChangedMessage;
import com.commercetools.models.message.ProductStateTransitionMessage;
import com.commercetools.models.message.ProductUnpublishedMessage;
import com.commercetools.models.message.ProductVariantDeletedMessage;
import com.commercetools.models.message.ReviewCreatedMessage;
import com.commercetools.models.message.ReviewRatingSetMessage;
import com.commercetools.models.message.ReviewStateTransitionMessage;
import com.commercetools.models.message.UserProvidedIdentifiers;


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
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderBillingAddressSetMessageImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCreatedMessageImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomerEmailSetMessageImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderCustomerSetMessageImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDeletedMessageImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeAddedMessageImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderEditAppliedMessageImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderImportedMessageImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderLineItemAddedMessageImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderLineItemDiscountSetMessageImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderPaymentStateChangedMessageImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderReturnInfoAddedMessageImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShipmentStateChangedMessageImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingAddressSetMessageImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingInfoSetMessageImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderShippingRateInputSetMessageImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderStateChangedMessageImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.OrderStateTransitionMessageImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelAddedToDeliveryMessageImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelItemsUpdatedMessageImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentCreatedMessageImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentInteractionAddedMessageImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentStatusStateTransitionMessageImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentTransactionAddedMessageImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.PaymentTransactionStateChangedMessageImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductCreatedMessageImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductDeletedMessageImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductImageAddedMessageImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPriceDiscountsSetMessageImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductPublishedMessageImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductRevertedStagedChangesMessageImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductSlugChangedMessageImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductStateTransitionMessageImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductUnpublishedMessageImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ProductVariantDeletedMessageImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewCreatedMessageImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewRatingSetMessageImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.ReviewStateTransitionMessageImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CategoryCreatedMessageImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CategorySlugChangedMessageImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomLineItemStateTransitionMessageImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressAddedMessageImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressChangedMessageImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerAddressRemovedMessageImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerCompanyNameSetMessageImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerCreatedMessageImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerDateOfBirthSetMessageImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerEmailChangedMessageImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerEmailVerifiedMessageImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.CustomerGroupSetMessageImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryAddedMessageImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryAddressSetMessageImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryItemsUpdatedMessageImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.DeliveryRemovedMessageImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.InventoryEntryDeletedMessageImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.models.message.LineItemStateTransitionMessageImpl.class, name = "LineItemStateTransition")
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
public interface Message extends LoggedResource {

   
   @NotNull
   @JsonProperty("sequenceNumber")
   public Long getSequenceNumber();
   
   @NotNull
   @Valid
   @JsonProperty("resource")
   public Reference getResource();
   
   @NotNull
   @JsonProperty("resourceVersion")
   public Long getResourceVersion();
   
   @Valid
   @JsonProperty("resourceUserProvidedIdentifiers")
   public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

   public void setSequenceNumber(final Long sequenceNumber);
   
   public void setResource(final Reference resource);
   
   public void setResourceVersion(final Long resourceVersion);
   
   public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);
   


}