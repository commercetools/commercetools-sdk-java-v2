package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRemovedFromCategoryMessagePayloadBuilder {

    
    
    private com.commercetools.api.models.category.CategoryReference category;
    
    
    
    private Boolean staged;

    
    public ProductRemovedFromCategoryMessagePayloadBuilder category( final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }
    
    
    public ProductRemovedFromCategoryMessagePayloadBuilder staged( final Boolean staged) {
        this.staged = staged;
        return this;
    }

    
    
    public com.commercetools.api.models.category.CategoryReference getCategory(){
        return this.category;
    }
    
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public ProductRemovedFromCategoryMessagePayload build() {
        return new ProductRemovedFromCategoryMessagePayloadImpl(category, staged);
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder of() {
        return new ProductRemovedFromCategoryMessagePayloadBuilder();
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder of(final ProductRemovedFromCategoryMessagePayload template) {
        ProductRemovedFromCategoryMessagePayloadBuilder builder = new ProductRemovedFromCategoryMessagePayloadBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
