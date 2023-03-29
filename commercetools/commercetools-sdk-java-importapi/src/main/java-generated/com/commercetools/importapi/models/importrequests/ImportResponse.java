
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.importoperations.ImportOperationStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A list of the ID's and validation statuses of newly created ImportOperations. Used as a response at each resource-specific import endpoint, for example, at Import Categories and Import ProductTypes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportResponse importResponse = ImportResponse.builder()
 *             .plusOperationStatus(operationStatusBuilder -> operationStatusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportResponseImpl.class)
public interface ImportResponse {

    /**
     *
     * @return operationStatus
     */
    @NotNull
    @Valid
    @JsonProperty("operationStatus")
    public List<ImportOperationStatus> getOperationStatus();

    /**
     * set operationStatus
     * @param operationStatus values to be set
     */

    @JsonIgnore
    public void setOperationStatus(final ImportOperationStatus... operationStatus);

    /**
     * set operationStatus
     * @param operationStatus values to be set
     */

    public void setOperationStatus(final List<ImportOperationStatus> operationStatus);

    /**
     * factory method
     * @return instance of ImportResponse
     */
    public static ImportResponse of() {
        return new ImportResponseImpl();
    }

    /**
     * factory method to create a shallow copy ImportResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportResponse of(final ImportResponse template) {
        ImportResponseImpl instance = new ImportResponseImpl();
        instance.setOperationStatus(template.getOperationStatus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportResponse deepCopy(@Nullable final ImportResponse template) {
        if (template == null) {
            return null;
        }
        ImportResponseImpl instance = new ImportResponseImpl();
        instance.setOperationStatus(Optional.ofNullable(template.getOperationStatus())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.importoperations.ImportOperationStatus::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ImportResponse
     * @return builder
     */
    public static ImportResponseBuilder builder() {
        return ImportResponseBuilder.of();
    }

    /**
     * create builder for ImportResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportResponseBuilder builder(final ImportResponse template) {
        return ImportResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportResponse(Function<ImportResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImportResponse>";
            }
        };
    }
}
