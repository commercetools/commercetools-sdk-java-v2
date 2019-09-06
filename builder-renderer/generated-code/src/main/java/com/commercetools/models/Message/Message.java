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
import com.commercetools.models.Message.MessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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