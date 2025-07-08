
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.common.UnresolvedReferences;
import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the import status of a resource.</p>
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
     *  <p>Current version of the ImportOperation.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p><code>key</code> of the ImportContainer.</p>
     * @return importContainerKey
     */
    @NotNull
    @JsonProperty("importContainerKey")
    public String getImportContainerKey();

    /**
     *  <p><code>key</code> of the resource being imported.</p>
     * @return resourceKey
     */
    @NotNull
    @JsonProperty("resourceKey")
    public String getResourceKey();

    /**
     *  <p>Unique identifier of the ImportOperation.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The import status of the resource. If <code>rejected</code> or <code>validationFailed</code>, the import was unsuccessful.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public ProcessingState getState();

    /**
     *  <p>The <code>version</code> of the imported resource when the import was successful.</p>
     * @return resourceVersion
     */

    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>Contains errors if the import was unsuccessful. See Errors.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>If the resource being imported contains references to resources which do not exist, these references are contained within this array.</p>
     * @return unresolvedReferences
     */
    @Valid
    @JsonProperty("unresolvedReferences")
    public List<UnresolvedReferences> getUnresolvedReferences();

    /**
     *  <p>Date and time (UTC) the ImportOperation was created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ImportOperation was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Date and time (UTC) the ImportOperation will be deleted.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Current version of the ImportOperation.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p><code>key</code> of the ImportContainer.</p>
     * @param importContainerKey value to be set
     */

    public void setImportContainerKey(final String importContainerKey);

    /**
     *  <p><code>key</code> of the resource being imported.</p>
     * @param resourceKey value to be set
     */

    public void setResourceKey(final String resourceKey);

    /**
     *  <p>Unique identifier of the ImportOperation.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The import status of the resource. If <code>rejected</code> or <code>validationFailed</code>, the import was unsuccessful.</p>
     * @param state value to be set
     */

    public void setState(final ProcessingState state);

    /**
     *  <p>The <code>version</code> of the imported resource when the import was successful.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>Contains errors if the import was unsuccessful. See Errors.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Contains errors if the import was unsuccessful. See Errors.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     *  <p>If the resource being imported contains references to resources which do not exist, these references are contained within this array.</p>
     * @param unresolvedReferences values to be set
     */

    @JsonIgnore
    public void setUnresolvedReferences(final UnresolvedReferences... unresolvedReferences);

    /**
     *  <p>If the resource being imported contains references to resources which do not exist, these references are contained within this array.</p>
     * @param unresolvedReferences values to be set
     */

    public void setUnresolvedReferences(final List<UnresolvedReferences> unresolvedReferences);

    /**
     *  <p>Date and time (UTC) the ImportOperation was created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ImportOperation was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Date and time (UTC) the ImportOperation will be deleted.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     * factory method
     * @return instance of ImportOperation
     */
    public static ImportOperation of() {
        return new ImportOperationImpl();
    }

    /**
     * factory method to create a shallow copy ImportOperation
     * @param template instance to be copied
     * @return copy instance
     */
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

    public ImportOperation copyDeep();

    /**
     * factory method to create a deep copy of ImportOperation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportOperation deepCopy(@Nullable final ImportOperation template) {
        if (template == null) {
            return null;
        }
        ImportOperationImpl instance = new ImportOperationImpl();
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        instance.setResourceKey(template.getResourceKey());
        instance.setId(template.getId());
        instance.setState(template.getState());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.errors.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setUnresolvedReferences(Optional.ofNullable(template.getUnresolvedReferences())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.UnresolvedReferences::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * builder factory method for ImportOperation
     * @return builder
     */
    public static ImportOperationBuilder builder() {
        return ImportOperationBuilder.of();
    }

    /**
     * create builder for ImportOperation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationBuilder builder(final ImportOperation template) {
        return ImportOperationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportOperation(Function<ImportOperation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperation>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperation>";
            }
        };
    }
}
