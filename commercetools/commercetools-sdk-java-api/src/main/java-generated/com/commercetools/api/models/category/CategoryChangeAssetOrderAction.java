package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryChangeAssetOrderActionImpl;

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
@JsonDeserialize(as = CategoryChangeAssetOrderActionImpl.class)
public interface CategoryChangeAssetOrderAction extends CategoryUpdateAction {

    
    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    public void setAssetOrder(final List<String> assetOrder);

    public static CategoryChangeAssetOrderActionImpl of(){
        return new CategoryChangeAssetOrderActionImpl();
    }
    

    public static CategoryChangeAssetOrderActionImpl of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionImpl instance = new CategoryChangeAssetOrderActionImpl();
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    default <T> T withCategoryChangeAssetOrderAction(Function<CategoryChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }
}
