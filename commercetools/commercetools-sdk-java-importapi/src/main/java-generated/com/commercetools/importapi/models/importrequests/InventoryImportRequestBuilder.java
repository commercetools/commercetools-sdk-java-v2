
package com.commercetools.importapi.models.importrequests;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryImportRequestBuilder implements Builder<InventoryImportRequest> {

    private java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> resources;

    public InventoryImportRequestBuilder resources(
            final com.commercetools.importapi.models.inventories.InventoryImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public InventoryImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> getResources() {
        return this.resources;
    }

    public InventoryImportRequest build() {
        Objects.requireNonNull(resources, InventoryImportRequest.class + ": resources is missing");
        return new InventoryImportRequestImpl(resources);
    }

    /**
     * builds InventoryImportRequest without checking for non null required values
     */
    public InventoryImportRequest buildUnchecked() {
        return new InventoryImportRequestImpl(resources);
    }

    public static InventoryImportRequestBuilder of() {
        return new InventoryImportRequestBuilder();
    }

    public static InventoryImportRequestBuilder of(final InventoryImportRequest template) {
        InventoryImportRequestBuilder builder = new InventoryImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
