package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadImpl;

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
@JsonDeserialize(as = ProductRemovedFromCategoryMessagePayloadImpl.class)
public interface ProductRemovedFromCategoryMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);
    
    public void setStaged(final Boolean staged);

    public static ProductRemovedFromCategoryMessagePayload of(){
        return new ProductRemovedFromCategoryMessagePayloadImpl();
    }
    

    public static ProductRemovedFromCategoryMessagePayload of(final ProductRemovedFromCategoryMessagePayload template) {
        ProductRemovedFromCategoryMessagePayloadImpl instance = new ProductRemovedFromCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder builder(){
        return ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }
    
    public static ProductRemovedFromCategoryMessagePayloadBuilder builder(final ProductRemovedFromCategoryMessagePayload template){
        return ProductRemovedFromCategoryMessagePayloadBuilder.of(template);
    }
    

    default <T> T withProductRemovedFromCategoryMessagePayload(Function<ProductRemovedFromCategoryMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
