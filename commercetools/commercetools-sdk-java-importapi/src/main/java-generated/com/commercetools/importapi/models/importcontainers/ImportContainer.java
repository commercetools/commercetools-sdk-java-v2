
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
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The resource type the ImportContainer is able to handle. If not present, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>The version of the ImportContainer.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The time when the ImportContainer was created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>The last time when the ImportContainer was modified.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setKey(final String key);

    public void setResourceType(final ImportResourceType resourceType);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static ImportContainer of() {
        return new ImportContainerImpl();
    }

    public static ImportContainer of(final ImportContainer template) {
        ImportContainerImpl instance = new ImportContainerImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public static ImportContainerBuilder builder() {
        return ImportContainerBuilder.of();
    }

    public static ImportContainerBuilder builder(final ImportContainer template) {
        return ImportContainerBuilder.of(template);
    }

    default <T> T withImportContainer(Function<ImportContainer, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainer>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainer>";
            }
        };
    }
}
