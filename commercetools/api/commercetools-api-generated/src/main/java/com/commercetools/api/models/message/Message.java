package com.commercetools.api.models.message;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.CategoryCreatedMessage;
import com.commercetools.api.models.message.CategorySlugChangedMessage;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessage;
import com.commercetools.api.models.message.CustomerAddressAddedMessage;
import com.commercetools.api.models.message.CustomerAddressChangedMessage;
import com.commercetools.api.models.message.CustomerAddressRemovedMessage;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessage;
import com.commercetools.api.models.message.CustomerCreatedMessage;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessage;
import com.commercetools.api.models.message.CustomerEmailChangedMessage;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessage;
import com.commercetools.api.models.message.CustomerGroupSetMessage;
import com.commercetools.api.models.message.DeliveryAddedMessage;
import com.commercetools.api.models.message.DeliveryAddressSetMessage;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessage;
import com.commercetools.api.models.message.DeliveryRemovedMessage;
import com.commercetools.api.models.message.InventoryEntryCreatedMessage;
import com.commercetools.api.models.message.InventoryEntryDeletedMessage;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessage;
import com.commercetools.api.models.message.LineItemStateTransitionMessage;
import com.commercetools.api.models.message.OrderBillingAddressSetMessage;
import com.commercetools.api.models.message.OrderCreatedMessage;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessage;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessage;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessage;
import com.commercetools.api.models.message.OrderCustomerSetMessage;
import com.commercetools.api.models.message.OrderDeletedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessage;
import com.commercetools.api.models.message.OrderEditAppliedMessage;
import com.commercetools.api.models.message.OrderImportedMessage;
import com.commercetools.api.models.message.OrderLineItemAddedMessage;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessage;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessage;
import com.commercetools.api.models.message.OrderReturnInfoAddedMessage;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessage;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessage;
import com.commercetools.api.models.message.OrderShippingAddressSetMessage;
import com.commercetools.api.models.message.OrderShippingInfoSetMessage;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessage;
import com.commercetools.api.models.message.OrderStateChangedMessage;
import com.commercetools.api.models.message.OrderStateTransitionMessage;
import com.commercetools.api.models.message.OrderStoreSetMessage;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessage;
import com.commercetools.api.models.message.ParcelItemsUpdatedMessage;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessage;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessage;
import com.commercetools.api.models.message.PaymentCreatedMessage;
import com.commercetools.api.models.message.PaymentInteractionAddedMessage;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessage;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessage;
import com.commercetools.api.models.message.PaymentTransactionAddedMessage;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessage;
import com.commercetools.api.models.message.ProductAddedToCategoryMessage;
import com.commercetools.api.models.message.ProductCreatedMessage;
import com.commercetools.api.models.message.ProductDeletedMessage;
import com.commercetools.api.models.message.ProductImageAddedMessage;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessage;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessage;
import com.commercetools.api.models.message.ProductPublishedMessage;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessage;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessage;
import com.commercetools.api.models.message.ProductSlugChangedMessage;
import com.commercetools.api.models.message.ProductStateTransitionMessage;
import com.commercetools.api.models.message.ProductUnpublishedMessage;
import com.commercetools.api.models.message.ProductVariantDeletedMessage;
import com.commercetools.api.models.message.ReviewCreatedMessage;
import com.commercetools.api.models.message.ReviewRatingSetMessage;
import com.commercetools.api.models.message.ReviewStateTransitionMessage;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import java.time.ZonedDateTime;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessageImpl.class, name = "OrderBillingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessageImpl.class, name = "OrderCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = "OrderCustomLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl.class, name = "OrderCustomerEmailSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessageImpl.class, name = "OrderCustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessageImpl.class, name = "OrderCustomerSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessageImpl.class, name = "OrderDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessageImpl.class, name = "OrderDiscountCodeAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = "OrderDiscountCodeRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = "OrderDiscountCodeStateSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessageImpl.class, name = "OrderEditApplied"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessageImpl.class, name = "OrderImported"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessageImpl.class, name = "OrderLineItemAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessageImpl.class, name = "OrderLineItemDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessageImpl.class, name = "OrderPaymentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoAddedMessageImpl.class, name = "ReturnInfoAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = "OrderReturnShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessageImpl.class, name = "OrderShipmentStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl.class, name = "OrderShippingAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessageImpl.class, name = "OrderShippingInfoSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessageImpl.class, name = "OrderShippingRateInputSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessageImpl.class, name = "OrderStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessageImpl.class, name = "OrderStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessageImpl.class, name = "OrderStoreSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessageImpl.class, name = "ParcelAddedToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessageImpl.class, name = "ParcelItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = "ParcelMeasurementsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = "ParcelRemovedFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = "ParcelTrackingDataUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessageImpl.class, name = "PaymentCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl.class, name = "PaymentInteractionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = "PaymentStatusInterfaceCodeSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessageImpl.class, name = "PaymentStatusStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl.class, name = "PaymentTransactionAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl.class, name = "PaymentTransactionStateChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl.class, name = "ProductAddedToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessageImpl.class, name = "ProductCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessageImpl.class, name = "ProductDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessageImpl.class, name = "ProductImageAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessageImpl.class, name = "ProductPriceDiscountsSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = "ProductPriceExternalDiscountSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessageImpl.class, name = "ProductPublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessageImpl.class, name = "ProductRemovedFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessageImpl.class, name = "ProductRevertedStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessageImpl.class, name = "ProductSlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessageImpl.class, name = "ProductStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessageImpl.class, name = "ProductUnpublished"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessageImpl.class, name = "ProductVariantDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessageImpl.class, name = "ReviewCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessageImpl.class, name = "ReviewRatingSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessageImpl.class, name = "ReviewStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessageImpl.class, name = "CustomerCompanyNameSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessageImpl.class, name = "InventoryEntryQuantitySet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessageImpl.class, name = "CustomLineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessageImpl.class, name = "CustomerGroupSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessageImpl.class, name = "InventoryEntryDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessageImpl.class, name = "CustomerEmailChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessageImpl.class, name = "DeliveryItemsUpdated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessageImpl.class, name = "LineItemStateTransition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessageImpl.class, name = "CategorySlugChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessageImpl.class, name = "DeliveryRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessageImpl.class, name = "DeliveryAddressSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessageImpl.class, name = "CustomerCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessageImpl.class, name = "DeliveryAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessageImpl.class, name = "CustomerAddressChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessageImpl.class, name = "CategoryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessageImpl.class, name = "CustomerDateOfBirthSet"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessageImpl.class, name = "CustomerAddressAdded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessageImpl.class, name = "InventoryEntryCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessageImpl.class, name = "CustomerAddressRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessageImpl.class, name = "CustomerEmailVerified")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = MessageImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Message extends BaseResource {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
    
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

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    public void setSequenceNumber(final Long sequenceNumber);
    
    public void setResource(final Reference resource);
    
    public void setResourceVersion(final Long resourceVersion);
    
    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);



}
