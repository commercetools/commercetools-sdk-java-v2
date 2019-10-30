package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.CategoryCreatedMessage;
import com.commercetools.api.generated.models.message.CategorySlugChangedMessage;
import com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessage;
import com.commercetools.api.generated.models.message.CustomerAddressAddedMessage;
import com.commercetools.api.generated.models.message.CustomerAddressChangedMessage;
import com.commercetools.api.generated.models.message.CustomerAddressRemovedMessage;
import com.commercetools.api.generated.models.message.CustomerCompanyNameSetMessage;
import com.commercetools.api.generated.models.message.CustomerCreatedMessage;
import com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessage;
import com.commercetools.api.generated.models.message.CustomerEmailChangedMessage;
import com.commercetools.api.generated.models.message.CustomerEmailVerifiedMessage;
import com.commercetools.api.generated.models.message.CustomerGroupSetMessage;
import com.commercetools.api.generated.models.message.DeliveryAddedMessage;
import com.commercetools.api.generated.models.message.DeliveryAddressSetMessage;
import com.commercetools.api.generated.models.message.DeliveryItemsUpdatedMessage;
import com.commercetools.api.generated.models.message.DeliveryRemovedMessage;
import com.commercetools.api.generated.models.message.InventoryEntryDeletedMessage;
import com.commercetools.api.generated.models.message.LineItemStateTransitionMessage;
import com.commercetools.api.generated.models.message.OrderBillingAddressSetMessage;
import com.commercetools.api.generated.models.message.OrderCreatedMessage;
import com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessage;
import com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessage;
import com.commercetools.api.generated.models.message.OrderCustomerSetMessage;
import com.commercetools.api.generated.models.message.OrderDeletedMessage;
import com.commercetools.api.generated.models.message.OrderDiscountCodeAddedMessage;
import com.commercetools.api.generated.models.message.OrderDiscountCodeRemovedMessage;
import com.commercetools.api.generated.models.message.OrderDiscountCodeStateSetMessage;
import com.commercetools.api.generated.models.message.OrderEditAppliedMessage;
import com.commercetools.api.generated.models.message.OrderImportedMessage;
import com.commercetools.api.generated.models.message.OrderLineItemAddedMessage;
import com.commercetools.api.generated.models.message.OrderLineItemDiscountSetMessage;
import com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessage;
import com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessage;
import com.commercetools.api.generated.models.message.OrderReturnShipmentStateChangedMessage;
import com.commercetools.api.generated.models.message.OrderShipmentStateChangedMessage;
import com.commercetools.api.generated.models.message.OrderShippingAddressSetMessage;
import com.commercetools.api.generated.models.message.OrderShippingInfoSetMessage;
import com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessage;
import com.commercetools.api.generated.models.message.OrderStateChangedMessage;
import com.commercetools.api.generated.models.message.OrderStateTransitionMessage;
import com.commercetools.api.generated.models.message.ParcelAddedToDeliveryMessage;
import com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessage;
import com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessage;
import com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessage;
import com.commercetools.api.generated.models.message.ParcelTrackingDataUpdatedMessage;
import com.commercetools.api.generated.models.message.PaymentCreatedMessage;
import com.commercetools.api.generated.models.message.PaymentInteractionAddedMessage;
import com.commercetools.api.generated.models.message.PaymentStatusInterfaceCodeSetMessage;
import com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessage;
import com.commercetools.api.generated.models.message.PaymentTransactionAddedMessage;
import com.commercetools.api.generated.models.message.PaymentTransactionStateChangedMessage;
import com.commercetools.api.generated.models.message.ProductCreatedMessage;
import com.commercetools.api.generated.models.message.ProductDeletedMessage;
import com.commercetools.api.generated.models.message.ProductImageAddedMessage;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessage;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessage;
import com.commercetools.api.generated.models.message.ProductPublishedMessage;
import com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessage;
import com.commercetools.api.generated.models.message.ProductSlugChangedMessage;
import com.commercetools.api.generated.models.message.ProductStateTransitionMessage;
import com.commercetools.api.generated.models.message.ProductUnpublishedMessage;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessage;
import com.commercetools.api.generated.models.message.ReviewCreatedMessage;
import com.commercetools.api.generated.models.message.ReviewRatingSetMessage;
import com.commercetools.api.generated.models.message.ReviewStateTransitionMessage;
import com.commercetools.api.generated.models.message.UserProvidedIdentifiers;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderBillingAddressSetMessageImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCreatedMessageImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessageImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderCustomerSetMessageImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDeletedMessageImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeAddedMessageImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderEditAppliedMessageImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderImportedMessageImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderLineItemAddedMessageImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderLineItemDiscountSetMessageImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderPaymentStateChangedMessageImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessageImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShipmentStateChangedMessageImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingAddressSetMessageImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingInfoSetMessageImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessageImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderStateChangedMessageImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.OrderStateTransitionMessageImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelAddedToDeliveryMessageImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessageImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentCreatedMessageImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentInteractionAddedMessageImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessageImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentTransactionAddedMessageImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.PaymentTransactionStateChangedMessageImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductCreatedMessageImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductDeletedMessageImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductImageAddedMessageImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessageImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductPublishedMessageImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessageImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductSlugChangedMessageImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductStateTransitionMessageImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductUnpublishedMessageImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ProductVariantDeletedMessageImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewCreatedMessageImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewRatingSetMessageImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.ReviewStateTransitionMessageImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CategoryCreatedMessageImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CategorySlugChangedMessageImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessageImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressAddedMessageImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressChangedMessageImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerAddressRemovedMessageImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerCompanyNameSetMessageImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerCreatedMessageImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessageImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerEmailChangedMessageImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerEmailVerifiedMessageImpl.class, name = "CustomerEmailVerified"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.CustomerGroupSetMessageImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryAddedMessageImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryAddressSetMessageImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryItemsUpdatedMessageImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.DeliveryRemovedMessageImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.InventoryEntryDeletedMessageImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.message.LineItemStateTransitionMessageImpl.class, name = "LineItemStateTransition")
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