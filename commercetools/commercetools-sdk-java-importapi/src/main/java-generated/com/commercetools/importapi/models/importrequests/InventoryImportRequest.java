
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
 *  <p>The request body to import Inventories. Contains data for InventoryEntries to be created or updated in a commercetools Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryImportRequest inventoryImportRequest = InventoryImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryImportRequestImpl.class)
public interface InventoryImportRequest extends ImportRequest {

    String INVENTORY = "inventory";

    /**
     *  <p>The inventory import resources of this request.</p>
     * @return resources
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

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryImportRequest>";
            }
        };
    }
}
