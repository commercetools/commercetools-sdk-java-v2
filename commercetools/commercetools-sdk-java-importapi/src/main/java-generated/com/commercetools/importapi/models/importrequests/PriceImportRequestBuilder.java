package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceImportRequestBuilder {

    
    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources;

    public PriceImportRequestBuilder resources( final com.commercetools.importapi.models.prices.PriceImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    public PriceImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources) {
        this.resources = resources;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getResources(){
        return this.resources;
    }

    public PriceImportRequest build() {
        return new PriceImportRequestImpl(resources);
    }

    public static PriceImportRequestBuilder of() {
        return new PriceImportRequestBuilder();
    }

    public static PriceImportRequestBuilder of(final PriceImportRequest template) {
        PriceImportRequestBuilder builder = new PriceImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
