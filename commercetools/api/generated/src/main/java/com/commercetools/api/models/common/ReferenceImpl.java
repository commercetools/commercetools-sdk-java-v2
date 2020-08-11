package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObjectReference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewReference;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.type.TypeReference;
import com.commercetools.api.models.zone.ZoneReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceImpl implements Reference {

   private com.commercetools.api.models.common.ReferenceTypeId typeId;
   
   private String id;

   @JsonCreator
   ReferenceImpl(@JsonProperty("id") final String id) {
      this.id = id;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("null").get();
   }
   public ReferenceImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }

   public void setId(final String id){
      this.id = id;
   }

}
