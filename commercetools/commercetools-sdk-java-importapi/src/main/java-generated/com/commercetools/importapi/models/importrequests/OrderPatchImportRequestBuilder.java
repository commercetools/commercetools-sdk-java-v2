
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderPatchImportRequestBuilder implements Builder<OrderPatchImportRequest> {

    private java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> patches;

    public OrderPatchImportRequestBuilder patches(
            final com.commercetools.importapi.models.order_patches.OrderPatchImport... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
        return this;
    }

    public OrderPatchImportRequestBuilder patches(
            final java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> patches) {
        this.patches = patches;
        return this;
    }

    public OrderPatchImportRequestBuilder plusPatches(
            final com.commercetools.importapi.models.order_patches.OrderPatchImport... patches) {
        if (this.patches == null) {
            this.patches = new ArrayList<>();
        }
        this.patches.addAll(Arrays.asList(patches));
        return this;
    }

    public OrderPatchImportRequestBuilder plusPatches(
            Function<com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder, com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder> builder) {
        if (this.patches == null) {
            this.patches = new ArrayList<>();
        }
        this.patches.add(
            builder.apply(com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder.of()).build());
        return this;
    }

    public OrderPatchImportRequestBuilder withPatches(
            Function<com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder, com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder> builder) {
        this.patches = new ArrayList<>();
        this.patches.add(
            builder.apply(com.commercetools.importapi.models.order_patches.OrderPatchImportBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> getPatches() {
        return this.patches;
    }

    public OrderPatchImportRequest build() {
        Objects.requireNonNull(patches, OrderPatchImportRequest.class + ": patches is missing");
        return new OrderPatchImportRequestImpl(patches);
    }

    /**
     * builds OrderPatchImportRequest without checking for non null required values
     */
    public OrderPatchImportRequest buildUnchecked() {
        return new OrderPatchImportRequestImpl(patches);
    }

    public static OrderPatchImportRequestBuilder of() {
        return new OrderPatchImportRequestBuilder();
    }

    public static OrderPatchImportRequestBuilder of(final OrderPatchImportRequest template) {
        OrderPatchImportRequestBuilder builder = new OrderPatchImportRequestBuilder();
        builder.patches = template.getPatches();
        return builder;
    }

}
