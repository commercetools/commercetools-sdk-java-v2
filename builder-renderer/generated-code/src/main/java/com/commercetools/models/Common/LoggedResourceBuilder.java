package com.commercetools.models.Common;

import com.commercetools.models.Cart.Cart;
import com.commercetools.models.CartDiscount.CartDiscount;
import com.commercetools.models.Category.Category;
import com.commercetools.models.Channel.Channel;
import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Common.CreatedBy;
import com.commercetools.models.Common.LastModifiedBy;
import com.commercetools.models.Customer.Customer;
import com.commercetools.models.CustomerGroup.CustomerGroup;
import com.commercetools.models.DiscountCode.DiscountCode;
import com.commercetools.models.Extension.Extension;
import com.commercetools.models.Inventory.InventoryEntry;
import com.commercetools.models.Order.Order;
import com.commercetools.models.OrderEdit.OrderEdit;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Product.Product;
import com.commercetools.models.ProductDiscount.ProductDiscount;
import com.commercetools.models.ProductType.ProductType;
import com.commercetools.models.Review.Review;
import com.commercetools.models.ShoppingList.ShoppingList;
import com.commercetools.models.State.State;
import com.commercetools.models.Subscription.Subscription;
import com.commercetools.models.TaxCategory.TaxCategory;
import com.commercetools.models.Type.Type;
import com.commercetools.models.Common.LoggedResource;
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
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
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
   
   public LoggedResourceBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public LoggedResourceBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
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
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
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