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
import com.commercetools.models.message.MessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MessageImpl.class)
public interface Message extends BaseResource {

   
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
   
   @NotNull
   @JsonProperty("type")
   public String getType();
   
   @Valid
   @JsonProperty("resourceUserProvidedIdentifiers")
   public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

   public void setSequenceNumber(final Long sequenceNumber);
   
   public void setResource(final Reference resource);
   
   public void setResourceVersion(final Long resourceVersion);
   
   public void setType(final String type);
   
   public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);
   
   public static MessageImpl of(){
      return new MessageImpl();
   }
   

   public static MessageImpl of(final Message template) {
      MessageImpl instance = new MessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      return instance;
   }

}