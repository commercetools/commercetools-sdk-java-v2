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
public final class ProductRemoveVariantActionImpl implements ProductRemoveVariantAction {

    private String action;
    
    private Long id;
    
    private String sku;
    
    private Boolean staged;

    @JsonCreator
    ProductRemoveVariantActionImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged) {
        this.id = id;
        this.sku = sku;
        this.staged = staged;
        this.action = "removeVariant";
    }
    public ProductRemoveVariantActionImpl() {
        this.action = "removeVariant";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getId(){
        return this.id;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setId(final Long id){
        this.id = id;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
