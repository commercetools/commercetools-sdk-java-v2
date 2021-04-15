package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryRemoveAssetActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryRemoveAssetActionImpl.class)
public interface CategoryRemoveAssetAction extends CategoryUpdateAction {

    String REMOVE_ASSET = "removeAsset";

    
    
    @JsonProperty("assetId")
    public String getAssetId();
    
    
    @JsonProperty("assetKey")
    public String getAssetKey();

    
    public void setAssetId(final String assetId);
    
    
    
    public void setAssetKey(final String assetKey);
    

    public static CategoryRemoveAssetAction of(){
        return new CategoryRemoveAssetActionImpl();
    }
    

    public static CategoryRemoveAssetAction of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionImpl instance = new CategoryRemoveAssetActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static CategoryRemoveAssetActionBuilder builder(){
        return CategoryRemoveAssetActionBuilder.of();
    }
    
    public static CategoryRemoveAssetActionBuilder builder(final CategoryRemoveAssetAction template){
        return CategoryRemoveAssetActionBuilder.of(template);
    }
    

    default <T> T withCategoryRemoveAssetAction(Function<CategoryRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }
}
