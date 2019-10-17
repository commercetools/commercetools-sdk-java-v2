package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.ItemShippingDetails;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.cart.CustomLineItemImpl;

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
@JsonDeserialize(as = CustomLineItemImpl.class)
public interface CustomLineItem  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("money")
   public TypedMoney getMoney();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();
   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public TypedMoney getTotalPrice();
   
   @NotNull
   @JsonProperty("slug")
   public String getSlug();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   
   @NotNull
   @Valid
   @JsonProperty("discountedPricePerQuantity")
   public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetails getShippingDetails();

   public void setId(final String id);
   
   public void setName(final LocalizedString name);
   
   public void setMoney(final TypedMoney money);
   
   public void setTaxedPrice(final TaxedItemPrice taxedPrice);
   
   public void setTotalPrice(final TypedMoney totalPrice);
   
   public void setSlug(final String slug);
   
   public void setQuantity(final Integer quantity);
   
   public void setState(final List<ItemState> state);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setTaxRate(final TaxRate taxRate);
   
   public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);
   
   public void setCustom(final CustomFields custom);
   
   public void setShippingDetails(final ItemShippingDetails shippingDetails);
   
   public static CustomLineItemImpl of(){
      return new CustomLineItemImpl();
   }
   

   public static CustomLineItemImpl of(final CustomLineItem template) {
      CustomLineItemImpl instance = new CustomLineItemImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setQuantity(template.getQuantity());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setMoney(template.getMoney());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setId(template.getId());
      instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
      instance.setSlug(template.getSlug());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}