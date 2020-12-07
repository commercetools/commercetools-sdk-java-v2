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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryRemoveAssetActionImpl implements CategoryRemoveAssetAction {

    private String action;
    
    private String assetId;
    
    private String assetKey;

    @JsonCreator
    CategoryRemoveAssetActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = "removeAsset";
    }
    public CategoryRemoveAssetActionImpl() {
        this.action = "removeAsset";
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

    public void setAssetId(final String assetId){
        this.assetId = assetId;
    }
    
    public void setAssetKey(final String assetKey){
        this.assetKey = assetKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategoryRemoveAssetActionImpl that = (CategoryRemoveAssetActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(assetId)
            .append(assetKey)
            .toHashCode();
    }

}
