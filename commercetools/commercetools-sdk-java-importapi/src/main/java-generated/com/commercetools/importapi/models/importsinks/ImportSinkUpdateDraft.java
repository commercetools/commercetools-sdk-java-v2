
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
 <p>The representation sent to the server when updating an ImportSink.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImportSinkUpdateDraft importSinkUpdateDraft = ImportSinkUpdateDraft.builder()
           .version(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportSinkUpdateDraftImpl.class)
public interface ImportSinkUpdateDraft {

    /**
     *  <p>Current version of the ImportSink.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The resource type to be imported. If not given, the ImportSink is able to import all of the supported ImportResourceTypes.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ImportSinkUpdateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSinkUpdateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSinkUpdateDraft>";
            }
        };
    }
}
