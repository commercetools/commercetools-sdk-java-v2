
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
*  <p>The representation sent to the server when creating or updating an import sink.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSinkDraftImpl.class)
public interface ImportSinkDraft {

    /**
    *  <p>The version of this resource.</p>
    */

    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The unique key of the import sink.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The type of import resource sent to this import sink.</p>
    */
    @NotNull
    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setResourceType(final ImportResourceType resourceType);

    public static ImportSinkDraft of() {
        return new ImportSinkDraftImpl();
    }

    public static ImportSinkDraft of(final ImportSinkDraft template) {
        ImportSinkDraftImpl instance = new ImportSinkDraftImpl();
        instance.setVersion(template.getVersion());
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
}
