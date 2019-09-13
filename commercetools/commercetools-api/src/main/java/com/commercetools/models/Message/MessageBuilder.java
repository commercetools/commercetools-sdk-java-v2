package com.commercetools.models.message;

import com.commercetools.models.common.BaseResource;
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
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.message.Message;
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
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
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
   
   public MessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public MessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
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
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
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