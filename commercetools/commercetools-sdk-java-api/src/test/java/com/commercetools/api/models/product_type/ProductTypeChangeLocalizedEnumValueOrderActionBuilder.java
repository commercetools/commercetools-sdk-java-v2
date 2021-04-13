package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLocalizedEnumValueOrderActionBuilder {

    
    
    private String attributeName;
    
    
    
    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    
    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values( final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue ...values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }
    
    
    public ProductTypeChangeLocalizedEnumValueOrderActionBuilder values( final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    
    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues(){
        return this.values;
    }

    public ProductTypeChangeLocalizedEnumValueOrderAction build() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl(attributeName, values);
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder of(final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder = new ProductTypeChangeLocalizedEnumValueOrderActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.values = template.getValues();
        return builder;
    }

}
