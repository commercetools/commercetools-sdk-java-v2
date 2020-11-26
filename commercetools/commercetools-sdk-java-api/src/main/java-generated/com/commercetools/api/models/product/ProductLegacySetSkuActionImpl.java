package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductLegacySetSkuActionImpl implements ProductLegacySetSkuAction {

    private String action;
    
    private String sku;
    
    private Integer variantId;

    @JsonCreator
    ProductLegacySetSkuActionImpl(@JsonProperty("sku") final String sku, @JsonProperty("variantId") final Integer variantId) {
        this.sku = sku;
        this.variantId = variantId;
        this.action = "legacySetSku";
    }
    public ProductLegacySetSkuActionImpl() {
        this.action = "legacySetSku";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public Integer getVariantId(){
        return this.variantId;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }

}
