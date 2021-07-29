
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shows the import status of a specific resource.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportOperationImpl.class)
public interface ImportOperation {

    /**
    *  <p>The version of the ImportOperation.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The key of the <a href="/import-sink#importsink">ImportSink</a>.</p>
    */
    @NotNull
    @JsonProperty("importSinkKey")
    public String getImportSinkKey();

    /**
    *  <p>The key of the resource.</p>
    */
    @NotNull
    @JsonProperty("resourceKey")
    public String getResourceKey();

    /**
    *  <p>The ID of the ImportOperation.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The import status of the resource. Set to <code>Rejected</code> or <code>ValidationFailed</code> if the import of the resource was not successful.</p>
    */
    @NotNull
    @JsonProperty("state")
    public ProcessingState getState();

    /**
    *  <p>The version of the impmorted resource when the import was successful.</p>
    */

    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
    *  <p>Contains an error if the import of the resource was not successful. See <a href="/error">Errors</a>.</p>
    */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */
    @Valid
    @JsonProperty("unresolvedReferences")
    public List<KeyReference> getUnresolvedReferences();

    /**
    *  <p>The time when the ImportOperation was created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>The last time When the ImportOperation was modified.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>The expiration time of the ImportOperation.</p>
    */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    public void setVersion(final Long version);

    public void setImportSinkKey(final String importSinkKey);

    public void setResourceKey(final String resourceKey);

    public void setId(final String id);

    public void setState(final ProcessingState state);

    public void setResourceVersion(final Long resourceVersion);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    @JsonIgnore
    public void setUnresolvedReferences(final KeyReference... unresolvedReferences);

    public void setUnresolvedReferences(final List<KeyReference> unresolvedReferences);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setExpiresAt(final ZonedDateTime expiresAt);

    public static ImportOperation of() {
        return new ImportOperationImpl();
    }

    public static ImportOperation of(final ImportOperation template) {
        ImportOperationImpl instance = new ImportOperationImpl();
        instance.setVersion(template.getVersion());
        instance.setImportSinkKey(template.getImportSinkKey());
        instance.setResourceKey(template.getResourceKey());
        instance.setId(template.getId());
        instance.setState(template.getState());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setErrors(template.getErrors());
        instance.setUnresolvedReferences(template.getUnresolvedReferences());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    public static ImportOperationBuilder builder() {
        return ImportOperationBuilder.of();
    }

    public static ImportOperationBuilder builder(final ImportOperation template) {
        return ImportOperationBuilder.of(template);
    }

    default <T> T withImportOperation(Function<ImportOperation, T> helper) {
        return helper.apply(this);
    }
}
