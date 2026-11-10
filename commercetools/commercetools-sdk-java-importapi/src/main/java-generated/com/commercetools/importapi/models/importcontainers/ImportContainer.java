
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Contains the resources to be imported. Unless <code>resourceType</code> is specified, the ImportContainer can import all of the supported <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">ImportResourceTypes</a>.</p>
 *  <p>If the container was created <strong>without</strong> a <code>retentionPolicy</code>, it <strong>expires 72 hours</strong> after <code>createdAt</code>. If a <code>TimeToLiveRetentionPolicy</code> was set, expiry follows the configured <code>timeToLive</code> (between the minimum and maximum allowed values). The <code>expiresAt</code> field holds the calculated deletion time.</p>
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
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">resource type</a> the ImportContainer supports. If not present, the ImportContainer can import all of the supported <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">ImportResourceTypes</a>.</p>
     * @return resourceType
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Retention policy for this ImportContainer. If not set, the ImportContainer will expire <strong>72 hours</strong> after creation.</p>
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
     *  <p>Date and time (UTC) when the ImportContainer is automatically deleted. If no <code>retentionPolicy</code> was set at creation, this is <strong>72 hours</strong> after <code>createdAt</code>. If a <code>TimeToLiveRetentionPolicy</code> was set, it is derived from <code>timeToLive</code>.</p>
     * @return expiresAt
     */

    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">resource type</a> the ImportContainer supports. If not present, the ImportContainer can import all of the supported <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">ImportResourceTypes</a>.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final ImportResourceType resourceType);

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Retention policy for this ImportContainer. If not set, the ImportContainer will expire <strong>72 hours</strong> after creation.</p>
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
     *  <p>Date and time (UTC) when the ImportContainer is automatically deleted. If no <code>retentionPolicy</code> was set at creation, this is <strong>72 hours</strong> after <code>createdAt</code>. If a <code>TimeToLiveRetentionPolicy</code> was set, it is derived from <code>timeToLive</code>.</p>
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
    public static tools.jackson.core.type.TypeReference<ImportContainer> typeReference() {
        return new tools.jackson.core.type.TypeReference<ImportContainer>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainer>";
            }
        };
    }
}
