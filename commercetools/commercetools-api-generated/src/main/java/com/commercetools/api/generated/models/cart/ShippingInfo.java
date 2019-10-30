package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.generated.models.cart.ShippingMethodState;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.order.Delivery;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.generated.models.shipping_method.ShippingRate;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import com.commercetools.api.generated.models.cart.ShippingInfoImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ShippingInfoImpl.class)
public interface ShippingInfo  {

   
   @NotNull
   @JsonProperty("shippingMethodName")
   public String getShippingMethodName();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public TypedMoney getPrice();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRate")
   public ShippingRate getShippingRate();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();
   
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodReference getShippingMethod();
   
   @Valid
   @JsonProperty("deliveries")
   public List<Delivery> getDeliveries();
   
   @Valid
   @JsonProperty("discountedPrice")
   public DiscountedLineItemPrice getDiscountedPrice();
   
   @NotNull
   @JsonProperty("shippingMethodState")
   public ShippingMethodState getShippingMethodState();

   public void setShippingMethodName(final String shippingMethodName);
   
   public void setPrice(final TypedMoney price);
   
   public void setShippingRate(final ShippingRate shippingRate);
   
   public void setTaxedPrice(final TaxedItemPrice taxedPrice);
   
   public void setTaxRate(final TaxRate taxRate);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setShippingMethod(final ShippingMethodReference shippingMethod);
   
   public void setDeliveries(final List<Delivery> deliveries);
   
   public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);
   
   public void setShippingMethodState(final ShippingMethodState shippingMethodState);
   
   public static ShippingInfoImpl of(){
      return new ShippingInfoImpl();
   }
   

   public static ShippingInfoImpl of(final ShippingInfo template) {
      ShippingInfoImpl instance = new ShippingInfoImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setShippingRate(template.getShippingRate());
      instance.setDiscountedPrice(template.getDiscountedPrice());
      instance.setShippingMethodState(template.getShippingMethodState());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setPrice(template.getPrice());
      instance.setShippingMethod(template.getShippingMethod());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setDeliveries(template.getDeliveries());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}