
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
*  <p>An import sink is the entry point for import resources from other systems.</p>
*  <p>It has an unique key and is specific to an import resource type.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkImpl.class)
public interface ImportSink {

    /**
    *  <p>The unique key of the import sink.</p>
    *  <p>Valid characters are: alphabetic characters (A-Z, a-z), numeric characters (0-9), underscores (_) and hyphens (-).</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The type of import resource sent to this import sink.
    *  You can only send one resource type per import sink.</p>
    */
    @NotNull
    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
    *  <p>The version of this resource.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>When the import sink was created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>When the import sink was modified.</p>
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
