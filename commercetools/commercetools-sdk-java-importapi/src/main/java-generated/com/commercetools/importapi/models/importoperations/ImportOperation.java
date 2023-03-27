
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

    /**
     *  <p>The version of the ImportOperation.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>The key of the importContainer.</p>
     * @param importContainerKey value to be set
     */

    public void setImportContainerKey(final String importContainerKey);

    /**
     *  <p>The key of the resource.</p>
     * @param resourceKey value to be set
     */

    public void setResourceKey(final String resourceKey);

    /**
     *  <p>The ID of the ImportOperation.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The import status of the resource. Set to <code>rejected</code> or <code>validationFailed</code> if the import of the resource was not successful.</p>
     * @param state value to be set
     */

    public void setState(final ProcessingState state);

    /**
     *  <p>The version of the imported resource when the import was successful.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     *  <p>In case of unresolved status this array will show the unresolved references</p>
     * @param unresolvedReferences values to be set
     */

    @JsonIgnore
    public void setUnresolvedReferences(final UnresolvedReferences... unresolvedReferences);

    /**
     *  <p>In case of unresolved status this array will show the unresolved references</p>
     * @param unresolvedReferences values to be set
     */

    public void setUnresolvedReferences(final List<UnresolvedReferences> unresolvedReferences);

    /**
     *  <p>The time when the ImportOperation was created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>The last time When the ImportOperation was modified.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>The expiration time of the ImportOperation.</p>
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
     * factory method to copy an instance of ImportOperation
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
