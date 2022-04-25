
package com.commercetools.importapi.models.importsinks;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The representation sent to the server when creating an <a href="#importsink">ImportSink</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkDraftImpl.class)
public interface ImportSinkDraft {

    /**
    *  <p>User-defined unique identifier of the ImportSink.
    *  Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The <a href="#importresourcetype">resource type</a> to be imported.
    *  If not given, the ImportSink is able to import all of the supported <a href="#importresourcetype">ImportResourceTypes</a>.</p>
    */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    public void setKey(final String key);

    public void setResourceType(final ImportResourceType resourceType);

    public static ImportSinkDraft of() {
        return new ImportSinkDraftImpl();
    }

    public static ImportSinkDraft of(final ImportSinkDraft template) {
        ImportSinkDraftImpl instance = new ImportSinkDraftImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    public static ImportSinkDraftBuilder builder() {
        return ImportSinkDraftBuilder.of();
    }

    public static ImportSinkDraftBuilder builder(final ImportSinkDraft template) {
        return ImportSinkDraftBuilder.of(template);
    }

    default <T> T withImportSinkDraft(Function<ImportSinkDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportSinkDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSinkDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSinkDraft>";
            }
        };
    }
}
