
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerImportRequestBuilder implements Builder<CustomerImportRequest> {

    private java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources;

    public CustomerImportRequestBuilder resources(
            final com.commercetools.importapi.models.customers.CustomerImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public CustomerImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.customers.CustomerImportBuilder, com.commercetools.importapi.models.customers.CustomerImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerImportBuilder.of()).build());
        return this;
    }

    public CustomerImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.customers.CustomerImportBuilder, com.commercetools.importapi.models.customers.CustomerImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerImportBuilder.of()).build());
        return this;
    }

    public CustomerImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.customers.CustomerImport> getResources() {
        return this.resources;
    }

    public CustomerImportRequest build() {
        Objects.requireNonNull(resources, CustomerImportRequest.class + ": resources is missing");
        return new CustomerImportRequestImpl(resources);
    }

    /**
     * builds CustomerImportRequest without checking for non null required values
     */
    public CustomerImportRequest buildUnchecked() {
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
