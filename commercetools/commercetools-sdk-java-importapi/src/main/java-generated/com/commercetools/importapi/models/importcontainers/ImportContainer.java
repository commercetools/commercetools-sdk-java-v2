
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Serves as the entry point of resources. An Import Container is not resource type-specific.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainer importContainer = ImportContainer.builder()
 *             .key("{key}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerImpl.class)
public interface ImportContainer {

    /**
     *  <p>User-defined unique identifier for the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The resource type the ImportContainer is able to handle. If not present, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>The version of the ImportContainer.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The time when the ImportContainer was created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>The last time when the ImportContainer was modified.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>User-defined unique identifier for the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The resource type the ImportContainer is able to handle. If not present, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final ImportResourceType resourceType);

    /**
     *  <p>The version of the ImportContainer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>The time when the ImportContainer was created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>The last time when the ImportContainer was modified.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * factory method
     * @return instance of ImportContainer
     */
    public static ImportContainer of() {
        return new ImportContainerImpl();
    }

    /**
     * factory method to copy an instance of ImportContainer
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainer of(final ImportContainer template) {
        ImportContainerImpl instance = new ImportContainerImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * builder factory method for ImportContainer
     * @return builder
     */
    public static ImportContainerBuilder builder() {
        return ImportContainerBuilder.of();
    }

    /**
     * create builder for ImportContainer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerBuilder builder(final ImportContainer template) {
        return ImportContainerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainer(Function<ImportContainer, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainer>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainer>";
            }
        };
    }
}
