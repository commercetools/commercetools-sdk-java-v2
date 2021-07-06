
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
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkImpl.class)
public interface ImportSink {

    /**
    *  <p>User-defined unique identifier for the ImportSink.
    *  Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The <a href="#importresourcetype">resource type</a> the ImportSink is able to handle.
    *  If not present, the ImportSink is able to import all of the supported <a href="#importresourcetype">ImportResourceTypes</a>.</p>
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
}
