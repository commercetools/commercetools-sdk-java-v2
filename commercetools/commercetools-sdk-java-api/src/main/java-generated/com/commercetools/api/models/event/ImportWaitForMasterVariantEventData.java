
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>data</code> of the Import Wait For Master Variant Event.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportWaitForMasterVariantEventData importWaitForMasterVariantEventData = ImportWaitForMasterVariantEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportWaitForMasterVariantEventDataImpl.class)
public interface ImportWaitForMasterVariantEventData {

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @return importContainerKey
     */
    @NotNull
    @JsonProperty("importContainerKey")
    public String getImportContainerKey();

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @param importContainerKey value to be set
     */

    public void setImportContainerKey(final String importContainerKey);

    /**
     * factory method
     * @return instance of ImportWaitForMasterVariantEventData
     */
    public static ImportWaitForMasterVariantEventData of() {
        return new ImportWaitForMasterVariantEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportWaitForMasterVariantEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportWaitForMasterVariantEventData of(final ImportWaitForMasterVariantEventData template) {
        ImportWaitForMasterVariantEventDataImpl instance = new ImportWaitForMasterVariantEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    public ImportWaitForMasterVariantEventData copyDeep();

    /**
     * factory method to create a deep copy of ImportWaitForMasterVariantEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportWaitForMasterVariantEventData deepCopy(
            @Nullable final ImportWaitForMasterVariantEventData template) {
        if (template == null) {
            return null;
        }
        ImportWaitForMasterVariantEventDataImpl instance = new ImportWaitForMasterVariantEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    /**
     * builder factory method for ImportWaitForMasterVariantEventData
     * @return builder
     */
    public static ImportWaitForMasterVariantEventDataBuilder builder() {
        return ImportWaitForMasterVariantEventDataBuilder.of();
    }

    /**
     * create builder for ImportWaitForMasterVariantEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventDataBuilder builder(
            final ImportWaitForMasterVariantEventData template) {
        return ImportWaitForMasterVariantEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportWaitForMasterVariantEventData(Function<ImportWaitForMasterVariantEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportWaitForMasterVariantEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportWaitForMasterVariantEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportWaitForMasterVariantEventData>";
            }
        };
    }
}
