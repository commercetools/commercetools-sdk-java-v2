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
import com.commercetools.models.Me.MyCart;
import com.commercetools.models.Me.MyCustomer;
import com.commercetools.models.Order.Order;
import com.commercetools.models.OrderEdit.OrderEdit;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Product.Product;
import com.commercetools.models.ProductDiscount.ProductDiscount;
import com.commercetools.models.ProductType.ProductType;
import com.commercetools.models.Review.Review;
import com.commercetools.models.ShoppingList.MyShoppingList;
import com.commercetools.models.ShoppingList.ShoppingList;
import com.commercetools.models.State.State;
import com.commercetools.models.Subscription.Subscription;
import com.commercetools.models.TaxCategory.TaxCategory;
import com.commercetools.models.Type.Type;
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
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;

   @JsonCreator
   LoggedResourceImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
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
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
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
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

}