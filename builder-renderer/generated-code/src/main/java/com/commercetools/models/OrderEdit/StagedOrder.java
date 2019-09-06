package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.Order;
import com.commercetools.models.OrderEdit.StagedOrderImpl;

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
@JsonDeserialize(as = StagedOrderImpl.class)
public interface StagedOrder extends Order {


   
   public static StagedOrderImpl of(){
      return new StagedOrderImpl();
   }
   

   public static StagedOrderImpl of(final StagedOrder template) {
      StagedOrderImpl instance = new StagedOrderImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setShipmentState(template.getShipmentState());
      instance.setCountry(template.getCountry());
      instance.setOrderNumber(template.getOrderNumber());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setOrigin(template.getOrigin());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setLocale(template.getLocale());
      instance.setCart(template.getCart());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setOrderState(template.getOrderState());
      instance.setReturnInfo(template.getReturnInfo());
      instance.setLineItems(template.getLineItems());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setCustomerId(template.getCustomerId());
      instance.setState(template.getState());
      instance.setPaymentState(template.getPaymentState());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setDiscountCodes(template.getDiscountCodes());
      instance.setCompletedAt(template.getCompletedAt());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      instance.setStore(template.getStore());
      instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
      instance.setSyncInfo(template.getSyncInfo());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setTaxMode(template.getTaxMode());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setPaymentInfo(template.getPaymentInfo());
      return instance;
   }

}