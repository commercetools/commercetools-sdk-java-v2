
package com.commercetools.importapi.models.importoperations;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportOperationStatusBuilder
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
public class ImportOperationStatusBuilder implements Builder<ImportOperationStatus> {

    @Nullable
    private String operationId;

    private com.commercetools.importapi.models.importoperations.ImportOperationState state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    /**
     *  <p>The ID of the ImportOperation.</p>
     * @param operationId value to be set
     * @return Builder
     */

    public ImportOperationStatusBuilder operationId(@Nullable final String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     *  <p>The validation state of the ImportOperation.</p>
     * @param state value to be set
     * @return Builder
     */

    public ImportOperationStatusBuilder state(
            final com.commercetools.importapi.models.importoperations.ImportOperationState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ImportOperationStatusBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ImportOperationStatusBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ImportOperationStatusBuilder plusErrors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ImportOperationStatusBuilder plusErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ImportOperationStatusBuilder withErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The ID of the ImportOperation.</p>
     * @return operationId
     */

    @Nullable
    public String getOperationId() {
        return this.operationId;
    }

    /**
     *  <p>The validation state of the ImportOperation.</p>
     * @return state
     */

    public com.commercetools.importapi.models.importoperations.ImportOperationState getState() {
        return this.state;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds ImportOperationStatus with checking for non-null required values
     * @return ImportOperationStatus
     */
    public ImportOperationStatus build() {
        Objects.requireNonNull(state, ImportOperationStatus.class + ": state is missing");
        return new ImportOperationStatusImpl(operationId, state, errors);
    }

    /**
     * builds ImportOperationStatus without checking for non-null required values
     * @return ImportOperationStatus
     */
    public ImportOperationStatus buildUnchecked() {
        return new ImportOperationStatusImpl(operationId, state, errors);
    }

    /**
     * factory method for an instance of ImportOperationStatusBuilder
     * @return builder
     */
    public static ImportOperationStatusBuilder of() {
        return new ImportOperationStatusBuilder();
    }

    /**
     * create builder for ImportOperationStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationStatusBuilder of(final ImportOperationStatus template) {
        ImportOperationStatusBuilder builder = new ImportOperationStatusBuilder();
        builder.operationId = template.getOperationId();
        builder.state = template.getState();
        builder.errors = template.getErrors();
        return builder;
    }

}
