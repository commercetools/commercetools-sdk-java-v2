
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     *  <p>User-defined unique identifier for the ImportContainer.</p>
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
     *  <p>The retention policy of the ImportContainer.</p>
     * @return retentionPolicy
     */
    @Valid
    @JsonProperty("retentionPolicy")
    public RetentionPolicy getRetentionPolicy();

    /**
     *  <p>Date and time (UTC) the ImportContainer was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ImportContainer was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Date and time (UTC) the ImportContainer is automatically deleted. Only present if a <code>retentionPolicy</code> is set. ImportContainers without <code>expiresAt</code> are permanent until manually deleted.</p>
     * @return expiresAt
     */

    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>User-defined unique identifier for the ImportContainer.</p>
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
     *  <p>The retention policy of the ImportContainer.</p>
     * @param retentionPolicy value to be set
     */

    public void setRetentionPolicy(final RetentionPolicy retentionPolicy);

    /**
     *  <p>Date and time (UTC) the ImportContainer was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ImportContainer was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Date and time (UTC) the ImportContainer is automatically deleted. Only present if a <code>retentionPolicy</code> is set. ImportContainers without <code>expiresAt</code> are permanent until manually deleted.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     * factory method
     * @return instance of ImportContainer
     */
    public static ImportContainer of() {
        return new ImportContainerImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainer
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainer of(final ImportContainer template) {
        ImportContainerImpl instance = new ImportContainerImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setRetentionPolicy(template.getRetentionPolicy());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    public ImportContainer copyDeep();

    /**
     * factory method to create a deep copy of ImportContainer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainer deepCopy(@Nullable final ImportContainer template) {
        if (template == null) {
            return null;
        }
        ImportContainerImpl instance = new ImportContainerImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setRetentionPolicy(com.commercetools.importapi.models.importcontainers.RetentionPolicy
                .deepCopy(template.getRetentionPolicy()));
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
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
