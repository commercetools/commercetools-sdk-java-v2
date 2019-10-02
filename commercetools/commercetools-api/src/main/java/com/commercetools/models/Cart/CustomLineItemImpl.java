package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.ItemShippingDetails;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.order.ItemState;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.tax_category.TaxRate;
import com.commercetools.models.type.CustomFields;
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
public final class CustomLineItemImpl implements CustomLineItem {

   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   private Integer quantity;
   
   private com.commercetools.models.cart.ItemShippingDetails shippingDetails;
   
   private com.commercetools.models.common.TypedMoney money;
   
   private com.commercetools.models.common.TypedMoney totalPrice;
   
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   private String id;
   
   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private String slug;
   
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   CustomLineItemImpl(@JsonProperty("taxRate") final com.commercetools.models.tax_category.TaxRate taxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetails shippingDetails, @JsonProperty("money") final com.commercetools.models.common.TypedMoney money, @JsonProperty("totalPrice") final com.commercetools.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("state") final java.util.List<com.commercetools.models.order.ItemState> state, @JsonProperty("id") final String id, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxRate = taxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.money = money;
      this.totalPrice = totalPrice;
      this.taxedPrice = taxedPrice;
      this.custom = custom;
      this.name = name;
      this.state = state;
      this.id = id;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.slug = slug;
      this.taxCategory = taxCategory;
   }
   public CustomLineItemImpl() {
      
   }
   
   
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.common.TypedMoney getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setMoney(final com.commercetools.models.common.TypedMoney money){
      this.money = money;
   }
   
   public void setTotalPrice(final com.commercetools.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final java.util.List<com.commercetools.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setSlug(final String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}