
package com.commercetools.api.models.event;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>data</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ImportContainerCreatedEvent" rel="nofollow">Import Container Created Event</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerCreatedEventData importContainerCreatedEventData = ImportContainerCreatedEventData.builder()
 *             .key("{key}")
 *             .version(1)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerCreatedEventDataImpl.class)
public interface ImportContainerCreatedEventData {

    /**
     *  <p>The <code>key</code> of the created Import Container.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <code>version</code> of the created Import Container.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>Date and time (UTC) the Import Container was created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Import Container was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>The <code>key</code> of the created Import Container.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <code>version</code> of the created Import Container.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>Date and time (UTC) the Import Container was created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Import Container was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * factory method
     * @return instance of ImportContainerCreatedEventData
     */
    public static ImportContainerCreatedEventData of() {
        return new ImportContainerCreatedEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerCreatedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerCreatedEventData of(final ImportContainerCreatedEventData template) {
        ImportContainerCreatedEventDataImpl instance = new ImportContainerCreatedEventDataImpl();
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public ImportContainerCreatedEventData copyDeep();

    /**
     * factory method to create a deep copy of ImportContainerCreatedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerCreatedEventData deepCopy(@Nullable final ImportContainerCreatedEventData template) {
        if (template == null) {
            return null;
        }
        ImportContainerCreatedEventDataImpl instance = new ImportContainerCreatedEventDataImpl();
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * builder factory method for ImportContainerCreatedEventData
     * @return builder
     */
    public static ImportContainerCreatedEventDataBuilder builder() {
        return ImportContainerCreatedEventDataBuilder.of();
    }

    /**
     * create builder for ImportContainerCreatedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerCreatedEventDataBuilder builder(final ImportContainerCreatedEventData template) {
        return ImportContainerCreatedEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerCreatedEventData(Function<ImportContainerCreatedEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerCreatedEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerCreatedEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerCreatedEventData>";
            }
        };
    }
}
