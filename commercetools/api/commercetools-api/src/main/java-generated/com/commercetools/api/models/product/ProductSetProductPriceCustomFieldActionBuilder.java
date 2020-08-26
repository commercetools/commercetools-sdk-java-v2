package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetProductPriceCustomFieldActionBuilder {

    
    private String priceId;
    
    @Nullable
    private Boolean staged;
    
    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public ProductSetProductPriceCustomFieldActionBuilder priceId( final String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    public ProductSetProductPriceCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    public ProductSetProductPriceCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public ProductSetProductPriceCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getPriceId(){
        return this.priceId;
    }
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public ProductSetProductPriceCustomFieldAction build() {
        return new ProductSetProductPriceCustomFieldActionImpl(priceId, staged, name, value);
    }

    public static ProductSetProductPriceCustomFieldActionBuilder of() {
        return new ProductSetProductPriceCustomFieldActionBuilder();
    }

    public static ProductSetProductPriceCustomFieldActionBuilder of(final ProductSetProductPriceCustomFieldAction template) {
        ProductSetProductPriceCustomFieldActionBuilder builder = new ProductSetProductPriceCustomFieldActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
