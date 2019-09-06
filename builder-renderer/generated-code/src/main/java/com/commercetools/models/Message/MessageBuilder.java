package com.commercetools.models.Message;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.CategoryCreatedMessage;
import com.commercetools.models.Message.CategorySlugChangedMessage;
import com.commercetools.models.Message.CustomLineItemStateTransitionMessage;
import com.commercetools.models.Message.CustomerAddressAddedMessage;
import com.commercetools.models.Message.CustomerAddressChangedMessage;
import com.commercetools.models.Message.CustomerAddressRemovedMessage;
import com.commercetools.models.Message.CustomerCompanyNameSetMessage;
import com.commercetools.models.Message.CustomerCreatedMessage;
import com.commercetools.models.Message.CustomerDateOfBirthSetMessage;
import com.commercetools.models.Message.CustomerEmailChangedMessage;
import com.commercetools.models.Message.CustomerEmailVerifiedMessage;
import com.commercetools.models.Message.CustomerGroupSetMessage;
import com.commercetools.models.Message.DeliveryAddedMessage;
import com.commercetools.models.Message.DeliveryAddressSetMessage;
import com.commercetools.models.Message.DeliveryItemsUpdatedMessage;
import com.commercetools.models.Message.DeliveryRemovedMessage;
import com.commercetools.models.Message.InventoryEntryDeletedMessage;
import com.commercetools.models.Message.LineItemStateTransitionMessage;
import com.commercetools.models.Message.OrderBillingAddressSetMessage;
import com.commercetools.models.Message.OrderCreatedMessage;
import com.commercetools.models.Message.OrderCustomLineItemDiscountSetMessage;
import com.commercetools.models.Message.OrderCustomerEmailSetMessage;
import com.commercetools.models.Message.OrderCustomerSetMessage;
import com.commercetools.models.Message.OrderDeletedMessage;
import com.commercetools.models.Message.OrderDiscountCodeAddedMessage;
import com.commercetools.models.Message.OrderDiscountCodeRemovedMessage;
import com.commercetools.models.Message.OrderDiscountCodeStateSetMessage;
import com.commercetools.models.Message.OrderEditAppliedMessage;
import com.commercetools.models.Message.OrderImportedMessage;
import com.commercetools.models.Message.OrderLineItemAddedMessage;
import com.commercetools.models.Message.OrderLineItemDiscountSetMessage;
import com.commercetools.models.Message.OrderPaymentStateChangedMessage;
import com.commercetools.models.Message.OrderReturnInfoAddedMessage;
import com.commercetools.models.Message.OrderReturnShipmentStateChangedMessage;
import com.commercetools.models.Message.OrderShipmentStateChangedMessage;
import com.commercetools.models.Message.OrderShippingAddressSetMessage;
import com.commercetools.models.Message.OrderShippingInfoSetMessage;
import com.commercetools.models.Message.OrderShippingRateInputSetMessage;
import com.commercetools.models.Message.OrderStateChangedMessage;
import com.commercetools.models.Message.OrderStateTransitionMessage;
import com.commercetools.models.Message.ParcelAddedToDeliveryMessage;
import com.commercetools.models.Message.ParcelItemsUpdatedMessage;
import com.commercetools.models.Message.ParcelMeasurementsUpdatedMessage;
import com.commercetools.models.Message.ParcelRemovedFromDeliveryMessage;
import com.commercetools.models.Message.ParcelTrackingDataUpdatedMessage;
import com.commercetools.models.Message.PaymentCreatedMessage;
import com.commercetools.models.Message.PaymentInteractionAddedMessage;
import com.commercetools.models.Message.PaymentStatusInterfaceCodeSetMessage;
import com.commercetools.models.Message.PaymentStatusStateTransitionMessage;
import com.commercetools.models.Message.PaymentTransactionAddedMessage;
import com.commercetools.models.Message.PaymentTransactionStateChangedMessage;
import com.commercetools.models.Message.ProductCreatedMessage;
import com.commercetools.models.Message.ProductDeletedMessage;
import com.commercetools.models.Message.ProductImageAddedMessage;
import com.commercetools.models.Message.ProductPriceDiscountsSetMessage;
import com.commercetools.models.Message.ProductPriceExternalDiscountSetMessage;
import com.commercetools.models.Message.ProductPublishedMessage;
import com.commercetools.models.Message.ProductRevertedStagedChangesMessage;
import com.commercetools.models.Message.ProductSlugChangedMessage;
import com.commercetools.models.Message.ProductStateTransitionMessage;
import com.commercetools.models.Message.ProductUnpublishedMessage;
import com.commercetools.models.Message.ProductVariantDeletedMessage;
import com.commercetools.models.Message.ReviewCreatedMessage;
import com.commercetools.models.Message.ReviewRatingSetMessage;
import com.commercetools.models.Message.ReviewStateTransitionMessage;
import com.commercetools.models.Message.UserProvidedIdentifiers;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Message.Message;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   public MessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public MessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public MessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public MessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public MessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public MessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public MessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }

   public Message build() {
       return new MessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type);
   }
   
   public static MessageBuilder of() {
      return new MessageBuilder();
   }
   
   public static MessageBuilder of(final Message template) {
      MessageBuilder builder = new MessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      return builder;
   }
   
}