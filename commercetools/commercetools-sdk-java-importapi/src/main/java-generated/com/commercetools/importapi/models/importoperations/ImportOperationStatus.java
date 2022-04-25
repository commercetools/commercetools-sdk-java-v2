
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportOperationStatusImpl.class)
public interface ImportOperationStatus {

    /**
    *  <p>The ID of the <a href="#importoperation">ImportOperation</a>.</p>
    */

    @JsonProperty("operationId")
    public String getOperationId();

    /**
    *  <p>The validation state of the <a href="#importoperation">ImportOperation</a>.</p>
    */
    @NotNull
    @JsonProperty("state")
    public ImportOperationState getState();

    /**
    *  <p>The validation errors for the <a href="#importoperation">ImportOperation</a>.
    *  See <a href="/error">Errors</a>.</p>
    */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    public void setOperationId(final String operationId);

    public void setState(final ImportOperationState state);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    public static ImportOperationStatus of() {
        return new ImportOperationStatusImpl();
    }

    public static ImportOperationStatus of(final ImportOperationStatus template) {
        ImportOperationStatusImpl instance = new ImportOperationStatusImpl();
        instance.setOperationId(template.getOperationId());
        instance.setState(template.getState());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static ImportOperationStatusBuilder builder() {
        return ImportOperationStatusBuilder.of();
    }

    public static ImportOperationStatusBuilder builder(final ImportOperationStatus template) {
        return ImportOperationStatusBuilder.of(template);
    }

    default <T> T withImportOperationStatus(Function<ImportOperationStatus, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationStatus>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationStatus>";
            }
        };
    }
}
