package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.customers.CustomerImport;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.importrequests.CustomerImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerImportRequestBuilder {

    
    private java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources;

    public CustomerImportRequestBuilder resources( final com.commercetools.importapi.models.customers.CustomerImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    public CustomerImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources) {
        this.resources = resources;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.customers.CustomerImport> getResources(){
        return this.resources;
    }

    public CustomerImportRequest build() {
        return new CustomerImportRequestImpl(resources);
    }

    public static CustomerImportRequestBuilder of() {
        return new CustomerImportRequestBuilder();
    }

    public static CustomerImportRequestBuilder of(final CustomerImportRequest template) {
        CustomerImportRequestBuilder builder = new CustomerImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
