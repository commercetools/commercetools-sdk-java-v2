
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
 *  <p>The <code>data</code> of the Import Container Deleted Event.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDeletedEventData importContainerDeletedEventData = ImportContainerDeletedEventData.builder()
 *             .key("{key}")
 *             .version(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerDeletedEventDataImpl.class)
public interface ImportContainerDeletedEventData {

    /**
     *  <p>The <code>key</code> of the deleted Import Container.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <code>version</code> of the deleted Import Container.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>The <code>key</code> of the deleted Import Container.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <code>version</code> of the deleted Import Container.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     * factory method
     * @return instance of ImportContainerDeletedEventData
     */
    public static ImportContainerDeletedEventData of() {
        return new ImportContainerDeletedEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerDeletedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerDeletedEventData of(final ImportContainerDeletedEventData template) {
        ImportContainerDeletedEventDataImpl instance = new ImportContainerDeletedEventDataImpl();
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportContainerDeletedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerDeletedEventData deepCopy(@Nullable final ImportContainerDeletedEventData template) {
        if (template == null) {
            return null;
        }
        ImportContainerDeletedEventDataImpl instance = new ImportContainerDeletedEventDataImpl();
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for ImportContainerDeletedEventData
     * @return builder
     */
    public static ImportContainerDeletedEventDataBuilder builder() {
        return ImportContainerDeletedEventDataBuilder.of();
    }

    /**
     * create builder for ImportContainerDeletedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDeletedEventDataBuilder builder(final ImportContainerDeletedEventData template) {
        return ImportContainerDeletedEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerDeletedEventData(Function<ImportContainerDeletedEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerDeletedEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerDeletedEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerDeletedEventData>";
            }
        };
    }
}
