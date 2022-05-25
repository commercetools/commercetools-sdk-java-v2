
package com.commercetools.importapi.models.importsinks;

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
 *  <p>Serves as the entry point of resources.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportSink importSink = ImportSink.builder()
 *             .key("{key}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportSinkImpl.class)
public interface ImportSink {

    /**
     *  <p>User-defined unique identifier for the ImportSink. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The resource type the ImportSink is able to handle. If not present, the ImportSink is able to import all of the supported ImportResourceTypes.</p>
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>The version of the ImportSink.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The time when the ImportSink was created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>The last time when the ImportSink was modified.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setKey(final String key);

    public void setResourceType(final ImportResourceType resourceType);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static ImportSink of() {
        return new ImportSinkImpl();
    }

    public static ImportSink of(final ImportSink template) {
        ImportSinkImpl instance = new ImportSinkImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public static ImportSinkBuilder builder() {
        return ImportSinkBuilder.of();
    }

    public static ImportSinkBuilder builder(final ImportSink template) {
        return ImportSinkBuilder.of(template);
    }

    default <T> T withImportSink(Function<ImportSink, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportSink> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSink>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSink>";
            }
        };
    }
}
