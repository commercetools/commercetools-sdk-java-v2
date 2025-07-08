
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The status of a new ImportOperation.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationStatus importOperationStatus = ImportOperationStatus.builder()
 *             .state(ImportOperationState.PROCESSING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportOperationStatusImpl.class)
public interface ImportOperationStatus {

    /**
     *  <p><code>id</code> of the ImportOperation.</p>
     * @return operationId
     */

    @JsonProperty("operationId")
    public String getOperationId();

    /**
     *  <p>Validation state of the ImportOperation.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public ImportOperationState getState();

    /**
     *  <p>Errors for the ImportOperation.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p><code>id</code> of the ImportOperation.</p>
     * @param operationId value to be set
     */

    public void setOperationId(final String operationId);

    /**
     *  <p>Validation state of the ImportOperation.</p>
     * @param state value to be set
     */

    public void setState(final ImportOperationState state);

    /**
     *  <p>Errors for the ImportOperation.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Errors for the ImportOperation.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of ImportOperationStatus
     */
    public static ImportOperationStatus of() {
        return new ImportOperationStatusImpl();
    }

    /**
     * factory method to create a shallow copy ImportOperationStatus
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportOperationStatus of(final ImportOperationStatus template) {
        ImportOperationStatusImpl instance = new ImportOperationStatusImpl();
        instance.setOperationId(template.getOperationId());
        instance.setState(template.getState());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public ImportOperationStatus copyDeep();

    /**
     * factory method to create a deep copy of ImportOperationStatus
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportOperationStatus deepCopy(@Nullable final ImportOperationStatus template) {
        if (template == null) {
            return null;
        }
        ImportOperationStatusImpl instance = new ImportOperationStatusImpl();
        instance.setOperationId(template.getOperationId());
        instance.setState(template.getState());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.errors.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ImportOperationStatus
     * @return builder
     */
    public static ImportOperationStatusBuilder builder() {
        return ImportOperationStatusBuilder.of();
    }

    /**
     * create builder for ImportOperationStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationStatusBuilder builder(final ImportOperationStatus template) {
        return ImportOperationStatusBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportOperationStatus(Function<ImportOperationStatus, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationStatus>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationStatus>";
            }
        };
    }
}
