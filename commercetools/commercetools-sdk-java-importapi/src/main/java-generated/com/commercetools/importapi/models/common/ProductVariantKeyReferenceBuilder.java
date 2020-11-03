package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantKeyReferenceBuilder {

    
    private String key;

    public ProductVariantKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }

    public ProductVariantKeyReference build() {
        return new ProductVariantKeyReferenceImpl(key);
    }

    public static ProductVariantKeyReferenceBuilder of() {
        return new ProductVariantKeyReferenceBuilder();
    }

    public static ProductVariantKeyReferenceBuilder of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceBuilder builder = new ProductVariantKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
