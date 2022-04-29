
package com.commercetools.importapi.models.importoperations;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportOperationStatusBuilder implements Builder<ImportOperationStatus> {

    @Nullable
    private String operationId;

    private com.commercetools.importapi.models.importoperations.ImportOperationState state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    public ImportOperationStatusBuilder operationId(@Nullable final String operationId) {
        this.operationId = operationId;
        return this;
    }

    public ImportOperationStatusBuilder state(
            final com.commercetools.importapi.models.importoperations.ImportOperationState state) {
        this.state = state;
        return this;
    }

    public ImportOperationStatusBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public ImportOperationStatusBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    public ImportOperationStatusBuilder plusErrors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    public ImportOperationStatusBuilder plusErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    public ImportOperationStatusBuilder withErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getOperationId() {
        return this.operationId;
    }

    public com.commercetools.importapi.models.importoperations.ImportOperationState getState() {
        return this.state;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    public ImportOperationStatus build() {
        Objects.requireNonNull(state, ImportOperationStatus.class + ": state is missing");
        return new ImportOperationStatusImpl(operationId, state, errors);
    }

    /**
     * builds ImportOperationStatus without checking for non null required values
     */
    public ImportOperationStatus buildUnchecked() {
        return new ImportOperationStatusImpl(operationId, state, errors);
    }

    public static ImportOperationStatusBuilder of() {
        return new ImportOperationStatusBuilder();
    }

    public static ImportOperationStatusBuilder of(final ImportOperationStatus template) {
        ImportOperationStatusBuilder builder = new ImportOperationStatusBuilder();
        builder.operationId = template.getOperationId();
        builder.state = template.getState();
        builder.errors = template.getErrors();
        return builder;
    }

}
