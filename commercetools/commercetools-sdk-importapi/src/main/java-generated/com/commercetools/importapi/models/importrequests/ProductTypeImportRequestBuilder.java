package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.producttypes.ProductTypeImport;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeImportRequestBuilder {


    private java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources;

    public ProductTypeImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources) {
        this.resources = resources;
        return this;
    }


    public java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> getResources(){
        return this.resources;
    }

    public ProductTypeImportRequest build() {
        return new ProductTypeImportRequestImpl(resources);
    }

    public static ProductTypeImportRequestBuilder of() {
        return new ProductTypeImportRequestBuilder();
    }

    public static ProductTypeImportRequestBuilder of(final ProductTypeImportRequest template) {
        ProductTypeImportRequestBuilder builder = new ProductTypeImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
