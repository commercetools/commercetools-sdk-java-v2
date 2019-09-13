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
import javax.annotation.Generated;
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
public final class MessageImpl implements Message {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.Long sequenceNumber;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;

   @JsonCreator
   MessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = type;
   }
   public MessageImpl() {
      
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
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }

}