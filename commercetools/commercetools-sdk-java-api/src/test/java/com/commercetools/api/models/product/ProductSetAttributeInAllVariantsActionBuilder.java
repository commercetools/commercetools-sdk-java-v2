package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAttributeInAllVariantsActionBuilder {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;
    
    
    @Nullable
    private Boolean staged;

    
    public ProductSetAttributeInAllVariantsActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public ProductSetAttributeInAllVariantsActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    
    public ProductSetAttributeInAllVariantsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }
    
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    public ProductSetAttributeInAllVariantsAction build() {
        return new ProductSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    public static ProductSetAttributeInAllVariantsActionBuilder of() {
        return new ProductSetAttributeInAllVariantsActionBuilder();
    }

    public static ProductSetAttributeInAllVariantsActionBuilder of(final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionBuilder builder = new ProductSetAttributeInAllVariantsActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
