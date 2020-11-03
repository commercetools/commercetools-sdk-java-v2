package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetDraft;
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
public final class CategoryAddAssetActionImpl implements CategoryAddAssetAction {

    private String action;
    
    private com.commercetools.api.models.common.AssetDraft asset;
    
    private Integer position;

    @JsonCreator
    CategoryAddAssetActionImpl(@JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset, @JsonProperty("position") final Integer position) {
        this.asset = asset;
        this.position = position;
        this.action = "addAsset";
    }
    public CategoryAddAssetActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.AssetDraft getAsset(){
        return this.asset;
    }
    
    /**
    *  <p>When specified, the value might be <code>0</code> and should be lower than the total of the assets list.</p>
    */
    public Integer getPosition(){
        return this.position;
    }

    public void setAsset(final com.commercetools.api.models.common.AssetDraft asset){
        this.asset = asset;
    }
    
    public void setPosition(final Integer position){
        this.position = position;
    }

}
