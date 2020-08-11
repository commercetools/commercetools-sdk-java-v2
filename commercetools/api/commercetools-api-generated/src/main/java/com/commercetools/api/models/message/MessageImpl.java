package com.commercetools.api.models.message;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
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
import com.commercetools.api.models.message.InventoryEntryDeletedMessage;
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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
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

   private String id;

   private Long version;

   private com.commercetools.api.models.common.CreatedBy createdBy;

   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

   private Long sequenceNumber;

   private com.commercetools.api.models.common.Reference resource;

   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

   private Long resourceVersion;

   private String type;

   @JsonCreator
   MessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final Long resourceVersion) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = "null";
   }
   public MessageImpl() {

   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public String getId(){
      return this.id;
   }


   public Long getVersion(){
      return this.version;
   }


   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }


   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }


   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }


   public Long getResourceVersion(){
      return this.resourceVersion;
   }


   public String getType(){
      return this.type;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }

   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }

   public void setId(final String id){
      this.id = id;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }

   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

   public void setSequenceNumber(final Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }

   public void setResource(final com.commercetools.api.models.common.Reference resource){
      this.resource = resource;
   }

   public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }

   public void setResourceVersion(final Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }

}
