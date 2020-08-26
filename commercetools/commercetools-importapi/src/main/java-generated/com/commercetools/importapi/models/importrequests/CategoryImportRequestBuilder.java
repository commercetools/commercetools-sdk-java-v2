package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.categories.CategoryImport;
import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.importrequests.CategoryImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryImportRequestBuilder {

    
    private java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources;

    public CategoryImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources) {
        this.resources = resources;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.categories.CategoryImport> getResources(){
        return this.resources;
    }

    public CategoryImportRequest build() {
        return new CategoryImportRequestImpl(resources);
    }

    public static CategoryImportRequestBuilder of() {
        return new CategoryImportRequestBuilder();
    }

    public static CategoryImportRequestBuilder of(final CategoryImportRequest template) {
        CategoryImportRequestBuilder builder = new CategoryImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
