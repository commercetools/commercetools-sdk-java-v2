package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceIdentifierImpl implements ResourceIdentifier {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String id;
    
    private String key;

    @JsonCreator
    ResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnumViaJsonName("null").get();
    }
    public ResourceIdentifierImpl() {
       
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
