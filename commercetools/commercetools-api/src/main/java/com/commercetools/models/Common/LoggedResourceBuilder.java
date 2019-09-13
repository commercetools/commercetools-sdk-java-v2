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
import com.commercetools.models.common.LoggedResource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LoggedResourceBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   public LoggedResourceBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public LoggedResourceBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public LoggedResourceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public LoggedResourceBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public LoggedResourceBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public LoggedResourceBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
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
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }

   public LoggedResource build() {
       return new LoggedResourceImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy);
   }
   
   public static LoggedResourceBuilder of() {
      return new LoggedResourceBuilder();
   }
   
   public static LoggedResourceBuilder of(final LoggedResource template) {
      LoggedResourceBuilder builder = new LoggedResourceBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      return builder;
   }
   
}