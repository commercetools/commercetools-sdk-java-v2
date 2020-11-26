package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
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
public final class ShoppingListAddLineItemActionImpl implements ShoppingListAddLineItemAction {

    private String action;
    
    private String sku;
    
    private String productId;
    
    private Long variantId;
    
    private Long quantity;
    
    private java.time.ZonedDateTime addedAt;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    ShoppingListAddLineItemActionImpl(@JsonProperty("sku") final String sku, @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId, @JsonProperty("quantity") final Long quantity, @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.sku = sku;
        this.productId = productId;
        this.variantId = variantId;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.custom = custom;
        this.action = "addLineItem";
    }
    public ShoppingListAddLineItemActionImpl() {
        this.action = "addLineItem";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getProductId(){
        return this.productId;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setProductId(final String productId){
        this.productId = productId;
    }
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    public void setAddedAt(final java.time.ZonedDateTime addedAt){
        this.addedAt = addedAt;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }

}
