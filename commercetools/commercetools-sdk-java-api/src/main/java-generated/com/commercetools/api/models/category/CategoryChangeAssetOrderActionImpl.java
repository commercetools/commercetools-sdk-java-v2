package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
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
public final class CategoryChangeAssetOrderActionImpl implements CategoryChangeAssetOrderAction {

    private String action;
    
    private java.util.List<String> assetOrder;

    @JsonCreator
    CategoryChangeAssetOrderActionImpl(@JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        this.action = "changeAssetOrder";
    }
    public CategoryChangeAssetOrderActionImpl() {
        this.action = "changeAssetOrder";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getAssetOrder(){
        return this.assetOrder;
    }

    public void setAssetOrder(final String ...assetOrder){
       this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
    }
    
    public void setAssetOrder(final java.util.List<String> assetOrder){
       this.assetOrder = assetOrder;
    }

}
