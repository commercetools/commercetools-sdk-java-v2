package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.cart.Cart;
import com.commercetools.api.generated.models.cart_discount.CartDiscount;
import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.common.BaseResource;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.custom_object.CustomObject;
import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.discount_code.DiscountCode;
import com.commercetools.api.generated.models.extension.Extension;
import com.commercetools.api.generated.models.inventory.InventoryEntry;
import com.commercetools.api.generated.models.me.MyCart;
import com.commercetools.api.generated.models.me.MyCustomer;
import com.commercetools.api.generated.models.me.MyOrder;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.order_edit.OrderEdit;
import com.commercetools.api.generated.models.payment.Payment;
import com.commercetools.api.generated.models.product.Product;
import com.commercetools.api.generated.models.product_discount.ProductDiscount;
import com.commercetools.api.generated.models.product_type.ProductType;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.shipping_method.ShippingMethod;
import com.commercetools.api.generated.models.shopping_list.MyShoppingList;
import com.commercetools.api.generated.models.shopping_list.ShoppingList;
import com.commercetools.api.generated.models.state.State;
import com.commercetools.api.generated.models.store.Store;
import com.commercetools.api.generated.models.subscription.Subscription;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.type.Type;
import com.commercetools.api.generated.models.zone.Zone;
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
public final class LoggedResourceImpl implements LoggedResource {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;

   @JsonCreator
   LoggedResourceImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

}