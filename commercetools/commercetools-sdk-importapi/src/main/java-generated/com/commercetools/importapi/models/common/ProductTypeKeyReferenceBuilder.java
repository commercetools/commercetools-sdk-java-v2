package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeKeyReferenceBuilder {

    
    private String key;

    public ProductTypeKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }

    public ProductTypeKeyReference build() {
        return new ProductTypeKeyReferenceImpl(key);
    }

    public static ProductTypeKeyReferenceBuilder of() {
        return new ProductTypeKeyReferenceBuilder();
    }

    public static ProductTypeKeyReferenceBuilder of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceBuilder builder = new ProductTypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
