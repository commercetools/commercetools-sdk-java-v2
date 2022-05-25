
package com.commercetools.importapi.models.importsummaries;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OperationStatesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OperationStates operationStates = OperationStates.builder()
 *             .processing(1)
 *             .validationFailed(1)
 *             .unresolved(1)
 *             .waitForMasterVariant(1)
 *             .imported(1)
 *             .rejected(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OperationStatesBuilder implements Builder<OperationStates> {

    private Long processing;

    private Long validationFailed;

    private Long unresolved;

    private Long waitForMasterVariant;

    private Long imported;

    private Long rejected;

    /**
     *  <p>The number of resources in the <code>processing</code> state.</p>
     */

    public OperationStatesBuilder processing(final Long processing) {
        this.processing = processing;
        return this;
    }

    /**
     *  <p>The number of resources in the <code>validationFailed</code> state.</p>
     */

    public OperationStatesBuilder validationFailed(final Long validationFailed) {
        this.validationFailed = validationFailed;
        return this;
    }

    /**
     *  <p>The number of resources in the <code>unresolved</code> state.</p>
     */

    public OperationStatesBuilder unresolved(final Long unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    /**
     *  <p>The number of resources in the <code>waitForMasterVariant</code> state.</p>
     */

    public OperationStatesBuilder waitForMasterVariant(final Long waitForMasterVariant) {
        this.waitForMasterVariant = waitForMasterVariant;
        return this;
    }

    /**
     *  <p>The number of resources in the <code>imported</code> state.</p>
     */

    public OperationStatesBuilder imported(final Long imported) {
        this.imported = imported;
        return this;
    }

    /**
     *  <p>The number of resources in the <code>rejected</code> state.</p>
     */

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
