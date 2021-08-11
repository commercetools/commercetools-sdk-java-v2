
package com.commercetools.importapi.models.importsummaries;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OperationStatesBuilder implements Builder<OperationStates> {

    private Long ValidationFailed;

    private Long Unresolved;

    private Long WaitForMasterVariant;

    private Long Imported;

    private Long Rejected;

    public OperationStatesBuilder ValidationFailed(final Long ValidationFailed) {
        this.ValidationFailed = ValidationFailed;
        return this;
    }

    public OperationStatesBuilder Unresolved(final Long Unresolved) {
        this.Unresolved = Unresolved;
        return this;
    }

    public OperationStatesBuilder WaitForMasterVariant(final Long WaitForMasterVariant) {
        this.WaitForMasterVariant = WaitForMasterVariant;
        return this;
    }

    public OperationStatesBuilder Imported(final Long Imported) {
        this.Imported = Imported;
        return this;
    }

    public OperationStatesBuilder Rejected(final Long Rejected) {
        this.Rejected = Rejected;
        return this;
    }

    public Long getValidationFailed() {
        return this.ValidationFailed;
    }

    public Long getUnresolved() {
        return this.Unresolved;
    }

    public Long getWaitForMasterVariant() {
        return this.WaitForMasterVariant;
    }

    public Long getImported() {
        return this.Imported;
    }

    public Long getRejected() {
        return this.Rejected;
    }

    public OperationStates build() {
        Objects.requireNonNull(ValidationFailed, OperationStates.class + ": ValidationFailed is missing");
        Objects.requireNonNull(Unresolved, OperationStates.class + ": Unresolved is missing");
        Objects.requireNonNull(WaitForMasterVariant, OperationStates.class + ": WaitForMasterVariant is missing");
        Objects.requireNonNull(Imported, OperationStates.class + ": Imported is missing");
        Objects.requireNonNull(Rejected, OperationStates.class + ": Rejected is missing");
        return new OperationStatesImpl(ValidationFailed, Unresolved, WaitForMasterVariant, Imported, Rejected);
    }

    /**
     * builds OperationStates without checking for non null required values
     */
    public OperationStates buildUnchecked() {
        return new OperationStatesImpl(ValidationFailed, Unresolved, WaitForMasterVariant, Imported, Rejected);
    }

    public static OperationStatesBuilder of() {
        return new OperationStatesBuilder();
    }

    public static OperationStatesBuilder of(final OperationStates template) {
        OperationStatesBuilder builder = new OperationStatesBuilder();
        builder.ValidationFailed = template.getValidationFailed();
        builder.Unresolved = template.getUnresolved();
        builder.WaitForMasterVariant = template.getWaitForMasterVariant();
        builder.Imported = template.getImported();
        builder.Rejected = template.getRejected();
        return builder;
    }

}
