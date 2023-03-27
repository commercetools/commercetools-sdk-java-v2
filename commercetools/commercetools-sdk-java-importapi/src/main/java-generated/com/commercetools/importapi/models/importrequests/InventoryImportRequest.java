
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

    /**
     * discriminator value for InventoryImportRequest
     */
    String INVENTORY = "inventory";

    /**
     *  <p>The inventory import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<InventoryImport> getResources();

    /**
     *  <p>The inventory import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final InventoryImport... resources);

    /**
     *  <p>The inventory import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<InventoryImport> resources);

    /**
     * factory method
     * @return instance of InventoryImportRequest
     */
    public static InventoryImportRequest of() {
        return new InventoryImportRequestImpl();
    }

    /**
     * factory method to copy an instance of InventoryImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryImportRequest of(final InventoryImportRequest template) {
        InventoryImportRequestImpl instance = new InventoryImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    /**
     * builder factory method for InventoryImportRequest
     * @return builder
     */
    public static InventoryImportRequestBuilder builder() {
        return InventoryImportRequestBuilder.of();
    }

    /**
     * create builder for InventoryImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryImportRequestBuilder builder(final InventoryImportRequest template) {
        return InventoryImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryImportRequest(Function<InventoryImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryImportRequest>";
            }
        };
    }
}
