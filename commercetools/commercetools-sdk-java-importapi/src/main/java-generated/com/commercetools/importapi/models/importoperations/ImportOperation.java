
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Tracks the status of a single import resource as it is imported into the commercetools project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportOperationImpl.class)
public interface ImportOperation {

    /**
    *  <p>The import operation version.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The key of the import sink.</p>
    */
    @NotNull
    @JsonProperty("importSinkKey")
    public String getImportSinkKey();

    /**
    *  <p>The key of the import resource.</p>
    */
    @NotNull
    @JsonProperty("resourceKey")
    public String getResourceKey();

    /**
    *  <p>The identifier of the operaton that is to be commited</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The status of the import resource.</p>
    */
    @NotNull
    @JsonProperty("state")
    public ProcessingState getState();

    /**
    *  <p>When the resource is successfully imported, this represents the imported resource version</p>
    */

    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
    *  <p>The number of request retries for processing the import resource.</p>
    */
    @NotNull
    @JsonProperty("retryCount")
    public Integer getRetryCount();

    /**
    *  <p>If an import resource does not import correctly, the state is set to <code>Rejected</code> or <code>ValidationFailed</code>
    *  and this property contains the errors.</p>
    */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
    *  <p>When the import operation was created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>When the import operation was modified.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>When the import operation expires.</p>
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

    public void setRetryCount(final Integer retryCount);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

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
        instance.setRetryCount(template.getRetryCount());
        instance.setErrors(template.getErrors());
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
