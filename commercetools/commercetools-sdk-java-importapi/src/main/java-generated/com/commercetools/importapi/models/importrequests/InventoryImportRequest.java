
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.inventories.InventoryImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An import request for multiple inventory import resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryImportRequestImpl.class)
public interface InventoryImportRequest extends ImportRequest {

    String INVENTORY = "inventory";

    /**
    *  <p>The inventory import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<InventoryImport> getResources();

    @JsonIgnore
    public void setResources(final InventoryImport... resources);

    public void setResources(final List<InventoryImport> resources);

    public static InventoryImportRequest of() {
        return new InventoryImportRequestImpl();
    }

    public static InventoryImportRequest of(final InventoryImportRequest template) {
        InventoryImportRequestImpl instance = new InventoryImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static InventoryImportRequestBuilder builder() {
        return InventoryImportRequestBuilder.of();
    }

    public static InventoryImportRequestBuilder builder(final InventoryImportRequest template) {
        return InventoryImportRequestBuilder.of(template);
    }

    default <T> T withInventoryImportRequest(Function<InventoryImportRequest, T> helper) {
        return helper.apply(this);
    }
}
