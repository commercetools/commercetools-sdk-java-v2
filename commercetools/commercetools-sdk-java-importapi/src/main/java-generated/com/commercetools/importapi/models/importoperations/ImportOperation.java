
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.common.UnresolvedReferences;
import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Import Operation describes the import status of a specific resource.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperation importOperation = ImportOperation.builder()
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .resourceKey("{resourceKey}")
 *             .id("{id}")
 *             .state(ProcessingState.PROCESSING)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportOperationImpl.class)
public interface ImportOperation {

    /**
     *  <p>The version of the ImportOperation.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The key of the importContainer.</p>
     * @return importContainerKey
     */
    @NotNull
    @JsonProperty("importContainerKey")
    public String getImportContainerKey();

    /**
     *  <p>The key of the resource.</p>
     * @return resourceKey
     */
    @NotNull
    @JsonProperty("resourceKey")
    public String getResourceKey();

    /**
     *  <p>The ID of the ImportOperation.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The import status of the resource. Set to <code>rejected</code> or <code>validationFailed</code> if the import of the resource was not successful.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public ProcessingState getState();

    /**
     *  <p>The version of the imported resource when the import was successful.</p>
     * @return resourceVersion
     */

    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>In case of unresolved status this array will show the unresolved references</p>
     * @return unresolvedReferences
     */
    @Valid
    @JsonProperty("unresolvedReferences")
    public List<UnresolvedReferences> getUnresolvedReferences();

    /**
     *  <p>The time when the ImportOperation was created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>The last time When the ImportOperation was modified.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>The expiration time of the ImportOperation.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    public void setVersion(final Long version);

    public void setImportContainerKey(final String importContainerKey);

    public void setResourceKey(final String resourceKey);

    public void setId(final String id);

    public void setState(final ProcessingState state);

    public void setResourceVersion(final Long resourceVersion);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    @JsonIgnore
    public void setUnresolvedReferences(final UnresolvedReferences... unresolvedReferences);

    public void setUnresolvedReferences(final List<UnresolvedReferences> unresolvedReferences);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setExpiresAt(final ZonedDateTime expiresAt);

    public static ImportOperation of() {
        return new ImportOperationImpl();
    }

    public static ImportOperation of(final ImportOperation template) {
        ImportOperationImpl instance = new ImportOperationImpl();
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
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

    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperation>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperation>";
            }
        };
    }
}
