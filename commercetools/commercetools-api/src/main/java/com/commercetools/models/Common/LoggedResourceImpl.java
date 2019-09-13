package com.commercetools.models.common;

import com.commercetools.models.cart.Cart;
import com.commercetools.models.cart_discount.CartDiscount;
import com.commercetools.models.category.Category;
import com.commercetools.models.channel.Channel;
import com.commercetools.models.common.BaseResource;
import com.commercetools.models.common.CreatedBy;
import com.commercetools.models.common.LastModifiedBy;
import com.commercetools.models.customer.Customer;
import com.commercetools.models.customer_group.CustomerGroup;
import com.commercetools.models.discount_code.DiscountCode;
import com.commercetools.models.extension.Extension;
import com.commercetools.models.inventory.InventoryEntry;
import com.commercetools.models.me.MyCart;
import com.commercetools.models.me.MyCustomer;
import com.commercetools.models.order.Order;
import com.commercetools.models.order_edit.OrderEdit;
import com.commercetools.models.payment.Payment;
import com.commercetools.models.product.Product;
import com.commercetools.models.product_discount.ProductDiscount;
import com.commercetools.models.product_type.ProductType;
import com.commercetools.models.review.Review;
import com.commercetools.models.shopping_list.MyShoppingList;
import com.commercetools.models.shopping_list.ShoppingList;
import com.commercetools.models.state.State;
import com.commercetools.models.subscription.Subscription;
import com.commercetools.models.tax_category.TaxCategory;
import com.commercetools.models.type.Type;
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
public final class LoggedResourceImpl implements LoggedResource {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;

   @JsonCreator
   LoggedResourceImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
   }
   public LoggedResourceImpl() {
      
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
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
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
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

}