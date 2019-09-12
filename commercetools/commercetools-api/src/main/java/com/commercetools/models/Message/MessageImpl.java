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
   
   private com.commercetools.models.Common.Reference resource;
   
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;

   @JsonCreator
   MessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.Common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type) {
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
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
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
   
   public void setResource(final com.commercetools.models.Common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }

}