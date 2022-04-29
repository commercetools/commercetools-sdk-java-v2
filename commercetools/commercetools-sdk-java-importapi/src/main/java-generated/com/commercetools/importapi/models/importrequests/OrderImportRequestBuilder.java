
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderImportRequestBuilder implements Builder<OrderImportRequest> {

    private java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources;

    public OrderImportRequestBuilder resources(
            final com.commercetools.importapi.models.orders.OrderImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public OrderImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources) {
        this.resources = resources;
        return this;
    }

    public OrderImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.orders.OrderImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    public OrderImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()).build());
        return this;
    }

    public OrderImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.orders.OrderImportBuilder, com.commercetools.importapi.models.orders.OrderImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.orders.OrderImportBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.orders.OrderImport> getResources() {
        return this.resources;
    }

    public OrderImportRequest build() {
        Objects.requireNonNull(resources, OrderImportRequest.class + ": resources is missing");
        return new OrderImportRequestImpl(resources);
    }

    /**
     * builds OrderImportRequest without checking for non null required values
     */
    public OrderImportRequest buildUnchecked() {
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
