
package com.commercetools.importapi.models.importsummaries;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OperationStatesBuilder implements Builder<OperationStates> {

    private Long processing;

    private Long validationFailed;

    private Long unresolved;

    private Long waitForMasterVariant;

    private Long imported;

    private Long rejected;

    public OperationStatesBuilder processing(final Long processing) {
        this.processing = processing;
        return this;
    }

    public OperationStatesBuilder validationFailed(final Long validationFailed) {
        this.validationFailed = validationFailed;
        return this;
    }

    public OperationStatesBuilder unresolved(final Long unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    public OperationStatesBuilder waitForMasterVariant(final Long waitForMasterVariant) {
        this.waitForMasterVariant = waitForMasterVariant;
        return this;
    }

    public OperationStatesBuilder imported(final Long imported) {
        this.imported = imported;
        return this;
    }

    public OperationStatesBuilder rejected(final Long rejected) {
        this.rejected = rejected;
        return this;
    }

    public Long getProcessing() {
        return this.processing;
    }

    public Long getValidationFailed() {
        return this.validationFailed;
    }

    public Long getUnresolved() {
        return this.unresolved;
    }

    public Long getWaitForMasterVariant() {
        return this.waitForMasterVariant;
    }

    public Long getImported() {
        return this.imported;
    }

    public Long getRejected() {
        return this.rejected;
    }

    public OperationStates build() {
        Objects.requireNonNull(processing, OperationStates.class + ": processing is missing");
        Objects.requireNonNull(validationFailed, OperationStates.class + ": validationFailed is missing");
        Objects.requireNonNull(unresolved, OperationStates.class + ": unresolved is missing");
        Objects.requireNonNull(waitForMasterVariant, OperationStates.class + ": waitForMasterVariant is missing");
        Objects.requireNonNull(imported, OperationStates.class + ": imported is missing");
        Objects.requireNonNull(rejected, OperationStates.class + ": rejected is missing");
        return new OperationStatesImpl(processing, validationFailed, unresolved, waitForMasterVariant, imported,
            rejected);
    }

    /**
     * builds OperationStates without checking for non null required values
     */
    public OperationStates buildUnchecked() {
        return new OperationStatesImpl(processing, validationFailed, unresolved, waitForMasterVariant, imported,
            rejected);
    }

    public static OperationStatesBuilder of() {
        return new OperationStatesBuilder();
    }

    public static OperationStatesBuilder of(final OperationStates template) {
        OperationStatesBuilder builder = new OperationStatesBuilder();
        builder.processing = template.getProcessing();
        builder.validationFailed = template.getValidationFailed();
        builder.unresolved = template.getUnresolved();
        builder.waitForMasterVariant = template.getWaitForMasterVariant();
        builder.imported = template.getImported();
        builder.rejected = template.getRejected();
        return builder;
    }

}
