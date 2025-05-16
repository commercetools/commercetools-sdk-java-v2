
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
 *  <p>The <code>data</code> of the Import Validation Failed Event.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportValidationFailedEventData importValidationFailedEventData = ImportValidationFailedEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportValidationFailedEventDataImpl.class)
public interface ImportValidationFailedEventData {

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>validationFailed</code> state.</p>
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
     *  <p>The <code>id</code> of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>validationFailed</code> state.</p>
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
     * @return instance of ImportValidationFailedEventData
     */
    public static ImportValidationFailedEventData of() {
        return new ImportValidationFailedEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportValidationFailedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportValidationFailedEventData of(final ImportValidationFailedEventData template) {
        ImportValidationFailedEventDataImpl instance = new ImportValidationFailedEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    public ImportValidationFailedEventData copyDeep();

    /**
     * factory method to create a deep copy of ImportValidationFailedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportValidationFailedEventData deepCopy(@Nullable final ImportValidationFailedEventData template) {
        if (template == null) {
            return null;
        }
        ImportValidationFailedEventDataImpl instance = new ImportValidationFailedEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    /**
     * builder factory method for ImportValidationFailedEventData
     * @return builder
     */
    public static ImportValidationFailedEventDataBuilder builder() {
        return ImportValidationFailedEventDataBuilder.of();
    }

    /**
     * create builder for ImportValidationFailedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportValidationFailedEventDataBuilder builder(final ImportValidationFailedEventData template) {
        return ImportValidationFailedEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportValidationFailedEventData(Function<ImportValidationFailedEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportValidationFailedEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportValidationFailedEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportValidationFailedEventData>";
            }
        };
    }
}
