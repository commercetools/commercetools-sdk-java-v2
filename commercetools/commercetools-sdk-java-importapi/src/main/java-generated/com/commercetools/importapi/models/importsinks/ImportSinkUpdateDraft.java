
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
*  <p>The representation sent to the server when updating an <a href="#importsink">ImportSink</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkUpdateDraftImpl.class)
public interface ImportSinkUpdateDraft {

    /**
    *  <p>Current version of the ImportSink.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The <a href="#importresourcetype">resource type</a> to be imported.
    *  If not given, the ImportSink is able to import all of the supported <a href="#importresourcetype">ImportResourceTypes</a>.</p>
    */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    public void setVersion(final Long version);

    public void setResourceType(final ImportResourceType resourceType);

    public static ImportSinkUpdateDraft of() {
        return new ImportSinkUpdateDraftImpl();
    }

    public static ImportSinkUpdateDraft of(final ImportSinkUpdateDraft template) {
        ImportSinkUpdateDraftImpl instance = new ImportSinkUpdateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    public static ImportSinkUpdateDraftBuilder builder() {
        return ImportSinkUpdateDraftBuilder.of();
    }

    public static ImportSinkUpdateDraftBuilder builder(final ImportSinkUpdateDraft template) {
        return ImportSinkUpdateDraftBuilder.of(template);
    }

    default <T> T withImportSinkUpdateDraft(Function<ImportSinkUpdateDraft, T> helper) {
        return helper.apply(this);
    }
}
