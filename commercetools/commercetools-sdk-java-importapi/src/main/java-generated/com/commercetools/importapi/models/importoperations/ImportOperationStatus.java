
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportOperationStatus
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
     *  <p>The ID of the ImportOperation.</p>
     * @return operationId
     */

    @JsonProperty("operationId")
    public String getOperationId();

    /**
     *  <p>The validation state of the ImportOperation.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public ImportOperationState getState();

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>The ID of the ImportOperation.</p>
     * @param operationId value to be set
     */

    public void setOperationId(final String operationId);

    /**
     *  <p>The validation state of the ImportOperation.</p>
     * @param state value to be set
     */

    public void setState(final ImportOperationState state);

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
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
     * factory method to copy an instance of ImportOperationStatus
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
