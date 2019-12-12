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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemImpl implements CustomLineItem {

   private com.commercetools.api.generated.models.tax_category.TaxRate taxRate;
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails;
   
   private com.commercetools.api.generated.models.common.TypedMoney money;
   
   private com.commercetools.api.generated.models.common.TypedMoney totalPrice;
   
   private com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   private String id;
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private String slug;
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   CustomLineItemImpl(@JsonProperty("taxRate") final com.commercetools.api.generated.models.tax_category.TaxRate taxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails, @JsonProperty("money") final com.commercetools.api.generated.models.common.TypedMoney money, @JsonProperty("totalPrice") final com.commercetools.api.generated.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("state") final java.util.List<com.commercetools.api.generated.models.order.ItemState> state, @JsonProperty("id") final String id, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory) {
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
   
   /**
   *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
   *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
   */
   public com.commercetools.api.generated.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   /**
   *  <p>The amount of a CustomLineItem in the cart.
   *  Must be a positive integer.</p>
   */
   public Integer getQuantity(){
      return this.quantity;
   }
   
   /**
   *  <p>Container for custom line item specific address(es).
   *  CustomLineItem fields that can be used in query predicates: <code>slug</code>, <code>name</code>, <code>quantity</code>,
   *  <code>money</code>, <code>state</code>, <code>discountedPricePerQuantity</code>.</p>
   */
   public com.commercetools.api.generated.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   /**
   *  <p>The cost to add to the cart.
   *  The amount can be negative.</p>
   */
   public com.commercetools.api.generated.models.common.TypedMoney getMoney(){
      return this.money;
   }
   
   /**
   *  <p>The total price of this custom line item.
   *  If custom line item is discounted, then the <code>totalPrice</code> would be the discounted custom line item price multiplied by <code>quantity</code>.
   *  Otherwise a total price is just a <code>money</code> multiplied by the <code>quantity</code>.
   *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
   */
   public com.commercetools.api.generated.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   /**
   *  <p>Set once the <code>taxRate</code> is set.</p>
   */
   public com.commercetools.api.generated.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>The name of this CustomLineItem.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }
   
   /**
   *  <p>The unique ID of this CustomLineItem.</p>
   */
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   /**
   *  <p>A unique String in the cart to identify this CustomLineItem.</p>
   */
   public String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.api.generated.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setMoney(final com.commercetools.api.generated.models.common.TypedMoney money){
      this.money = money;
   }
   
   public void setTotalPrice(final com.commercetools.api.generated.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.api.generated.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final java.util.List<com.commercetools.api.generated.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setSlug(final String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.api.generated.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}