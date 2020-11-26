package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetSource;
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
public final class CategorySetAssetSourcesActionImpl implements CategorySetAssetSourcesAction {

    private String action;
    
    private String assetId;
    
    private String assetKey;
    
    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    @JsonCreator
    CategorySetAssetSourcesActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.sources = sources;
        this.action = "setAssetSources";
    }
    public CategorySetAssetSourcesActionImpl() {
        this.action = "setAssetSources";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAssetId(){
        return this.assetId;
    }
    
    
    public String getAssetKey(){
        return this.assetKey;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources(){
        return this.sources;
    }

    public void setAssetId(final String assetId){
        this.assetId = assetId;
    }
    
    public void setAssetKey(final String assetKey){
        this.assetKey = assetKey;
    }
    
    public void setSources(final com.commercetools.api.models.common.AssetSource ...sources){
       this.sources = new ArrayList<>(Arrays.asList(sources));
    }
    
    public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources){
       this.sources = sources;
    }

}
