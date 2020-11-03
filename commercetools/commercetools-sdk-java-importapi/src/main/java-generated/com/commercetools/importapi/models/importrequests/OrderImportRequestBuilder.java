package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.orders.OrderImport;
import com.commercetools.importapi.models.importrequests.OrderImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportRequestBuilder {

    
    private java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources;

    public OrderImportRequestBuilder resources( final com.commercetools.importapi.models.orders.OrderImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    public OrderImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources) {
        this.resources = resources;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.orders.OrderImport> getResources(){
        return this.resources;
    }

    public OrderImportRequest build() {
        return new OrderImportRequestImpl(resources);
    }

    public static OrderImportRequestBuilder of() {
        return new OrderImportRequestBuilder();
    }

    public static OrderImportRequestBuilder of(final OrderImportRequest template) {
        OrderImportRequestBuilder builder = new OrderImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
