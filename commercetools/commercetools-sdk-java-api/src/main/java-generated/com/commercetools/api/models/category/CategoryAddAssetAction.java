package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.category.CategoryAddAssetActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryAddAssetActionImpl.class)
public interface CategoryAddAssetAction extends CategoryUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();
    /**
    *  <p>When specified, the value might be <code>0</code> and should be lower than the total of the assets list.</p>
    */
    
    @JsonProperty("position")
    public Integer getPosition();

    public void setAsset(final AssetDraft asset);
    
    public void setPosition(final Integer position);

    public static CategoryAddAssetActionImpl of(){
        return new CategoryAddAssetActionImpl();
    }
    

    public static CategoryAddAssetActionImpl of(final CategoryAddAssetAction template) {
        CategoryAddAssetActionImpl instance = new CategoryAddAssetActionImpl();
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    default <T extends Accessor<CategoryAddAssetAction>> T withCategoryAddAssetAction(Function<CategoryAddAssetAction, T> helper) {
        return helper.apply(this);
    }
}
