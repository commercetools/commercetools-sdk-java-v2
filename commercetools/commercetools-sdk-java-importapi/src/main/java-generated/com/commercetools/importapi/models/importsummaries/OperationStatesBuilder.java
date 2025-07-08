
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
 *             .canceled(1)
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

    private Long canceled;

    /**
     *  <p>The number of ImportOperations in the <code>processing</code> state.</p>
     * @param processing value to be set
     * @return Builder
     */

    public OperationStatesBuilder processing(final Long processing) {
        this.processing = processing;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>validationFailed</code> state.</p>
     * @param validationFailed value to be set
     * @return Builder
     */

    public OperationStatesBuilder validationFailed(final Long validationFailed) {
        this.validationFailed = validationFailed;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>unresolved</code> state.</p>
     * @param unresolved value to be set
     * @return Builder
     */

    public OperationStatesBuilder unresolved(final Long unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>waitForMasterVariant</code> state.</p>
     * @param waitForMasterVariant value to be set
     * @return Builder
     */

    public OperationStatesBuilder waitForMasterVariant(final Long waitForMasterVariant) {
        this.waitForMasterVariant = waitForMasterVariant;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>imported</code> state.</p>
     * @param imported value to be set
     * @return Builder
     */

    public OperationStatesBuilder imported(final Long imported) {
        this.imported = imported;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>rejected</code> state.</p>
     * @param rejected value to be set
     * @return Builder
     */

    public OperationStatesBuilder rejected(final Long rejected) {
        this.rejected = rejected;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>canceled</code> state.</p>
     * @param canceled value to be set
     * @return Builder
     */

    public OperationStatesBuilder canceled(final Long canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     *  <p>The number of ImportOperations in the <code>processing</code> state.</p>
     * @return processing
     */

    public Long getProcessing() {
        return this.processing;
    }

    /**
     *  <p>The number of ImportOperations in the <code>validationFailed</code> state.</p>
     * @return validationFailed
     */

    public Long getValidationFailed() {
        return this.validationFailed;
    }

    /**
     *  <p>The number of ImportOperations in the <code>unresolved</code> state.</p>
     * @return unresolved
     */

    public Long getUnresolved() {
        return this.unresolved;
    }

    /**
     *  <p>The number of ImportOperations in the <code>waitForMasterVariant</code> state.</p>
     * @return waitForMasterVariant
     */

    public Long getWaitForMasterVariant() {
        return this.waitForMasterVariant;
    }

    /**
     *  <p>The number of ImportOperations in the <code>imported</code> state.</p>
     * @return imported
     */

    public Long getImported() {
        return this.imported;
    }

    /**
     *  <p>The number of ImportOperations in the <code>rejected</code> state.</p>
     * @return rejected
     */

    public Long getRejected() {
        return this.rejected;
    }

    /**
     *  <p>The number of ImportOperations in the <code>canceled</code> state.</p>
     * @return canceled
     */

    public Long getCanceled() {
        return this.canceled;
    }

    /**
     * builds OperationStates with checking for non-null required values
     * @return OperationStates
     */
    public OperationStates build() {
        Objects.requireNonNull(processing, OperationStates.class + ": processing is missing");
        Objects.requireNonNull(validationFailed, OperationStates.class + ": validationFailed is missing");
        Objects.requireNonNull(unresolved, OperationStates.class + ": unresolved is missing");
        Objects.requireNonNull(waitForMasterVariant, OperationStates.class + ": waitForMasterVariant is missing");
        Objects.requireNonNull(imported, OperationStates.class + ": imported is missing");
        Objects.requireNonNull(rejected, OperationStates.class + ": rejected is missing");
        Objects.requireNonNull(canceled, OperationStates.class + ": canceled is missing");
        return new OperationStatesImpl(processing, validationFailed, unresolved, waitForMasterVariant, imported,
            rejected, canceled);
    }

    /**
     * builds OperationStates without checking for non-null required values
     * @return OperationStates
     */
    public OperationStates buildUnchecked() {
        return new OperationStatesImpl(processing, validationFailed, unresolved, waitForMasterVariant, imported,
            rejected, canceled);
    }

    /**
     * factory method for an instance of OperationStatesBuilder
     * @return builder
     */
    public static OperationStatesBuilder of() {
        return new OperationStatesBuilder();
    }

    /**
     * create builder for OperationStates instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OperationStatesBuilder of(final OperationStates template) {
        OperationStatesBuilder builder = new OperationStatesBuilder();
        builder.processing = template.getProcessing();
        builder.validationFailed = template.getValidationFailed();
        builder.unresolved = template.getUnresolved();
        builder.waitForMasterVariant = template.getWaitForMasterVariant();
        builder.imported = template.getImported();
        builder.rejected = template.getRejected();
        builder.canceled = template.getCanceled();
        return builder;
    }

}
