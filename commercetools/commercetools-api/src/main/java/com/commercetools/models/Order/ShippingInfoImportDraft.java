package com.commercetools.models.Order;

import com.commercetools.models.Cart.ShippingMethodState;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.Order.DiscountedLineItemPriceDraft;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxRate;
import java.lang.String;
import com.commercetools.models.Order.ShippingInfoImportDraftImpl;

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
@JsonDeserialize(as = ShippingInfoImportDraftImpl.class)
public interface ShippingInfoImportDraft  {

   
   @NotNull
   @JsonProperty("shippingMethodName")
   public String getShippingMethodName();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRate")
   public ShippingRateDraft getShippingRate();
   
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   
   @Valid
   @JsonProperty("deliveries")
   public List<Delivery> getDeliveries();
   
   @Valid
   @JsonProperty("discountedPrice")
   public DiscountedLineItemPriceDraft getDiscountedPrice();
   
   
   @JsonProperty("shippingMethodState")
   public ShippingMethodState getShippingMethodState();

   public void setShippingMethodName(final String shippingMethodName);
   
   public void setPrice(final Money price);
   
   public void setShippingRate(final ShippingRateDraft shippingRate);
   
   public void setTaxRate(final TaxRate taxRate);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
   
   public void setDeliveries(final List<Delivery> deliveries);
   
   public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);
   
   public void setShippingMethodState(final ShippingMethodState shippingMethodState);
   
   public static ShippingInfoImportDraftImpl of(){
      return new ShippingInfoImportDraftImpl();
   }
   

   public static ShippingInfoImportDraftImpl of(final ShippingInfoImportDraft template) {
      ShippingInfoImportDraftImpl instance = new ShippingInfoImportDraftImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setShippingRate(template.getShippingRate());
      instance.setDiscountedPrice(template.getDiscountedPrice());
      instance.setShippingMethodState(template.getShippingMethodState());
      instance.setPrice(template.getPrice());
      instance.setShippingMethod(template.getShippingMethod());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setDeliveries(template.getDeliveries());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}