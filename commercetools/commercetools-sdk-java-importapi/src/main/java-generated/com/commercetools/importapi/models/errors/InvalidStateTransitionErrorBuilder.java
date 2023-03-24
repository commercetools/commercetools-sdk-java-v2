
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidStateTransitionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidStateTransitionError invalidStateTransitionError = InvalidStateTransitionError.builder()
 *             .message("{message}")
 *             .currentState(ProcessingState.PROCESSING)
 *             .newState(ProcessingState.PROCESSING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidStateTransitionErrorBuilder implements Builder<InvalidStateTransitionError> {

    private String message;

    private com.commercetools.importapi.models.common.ProcessingState currentState;

    private com.commercetools.importapi.models.common.ProcessingState newState;

    /**
     *
     * @param message value to be set
     * @return Builder
     */

    public InvalidStateTransitionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Every Import Operation is assigned with one of the following states.</p>
     * @param currentState value to be set
     * @return Builder
     */

    public InvalidStateTransitionErrorBuilder currentState(
            final com.commercetools.importapi.models.common.ProcessingState currentState) {
        this.currentState = currentState;
        return this;
    }

    /**
     *  <p>Every Import Operation is assigned with one of the following states.</p>
     * @param newState value to be set
     * @return Builder
     */

    public InvalidStateTransitionErrorBuilder newState(
            final com.commercetools.importapi.models.common.ProcessingState newState) {
        this.newState = newState;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.importapi.models.common.ProcessingState getCurrentState() {
        return this.currentState;
    }

    public com.commercetools.importapi.models.common.ProcessingState getNewState() {
        return this.newState;
    }

    /**
     * builds InvalidStateTransitionError with checking for non-null required values
     * @return InvalidStateTransitionError
     */
    public InvalidStateTransitionError build() {
        Objects.requireNonNull(message, InvalidStateTransitionError.class + ": message is missing");
        Objects.requireNonNull(currentState, InvalidStateTransitionError.class + ": currentState is missing");
        Objects.requireNonNull(newState, InvalidStateTransitionError.class + ": newState is missing");
        return new InvalidStateTransitionErrorImpl(message, currentState, newState);
    }

    /**
     * builds InvalidStateTransitionError without checking for non-null required values
     * @return InvalidStateTransitionError
     */
    public InvalidStateTransitionError buildUnchecked() {
        return new InvalidStateTransitionErrorImpl(message, currentState, newState);
    }

    public static InvalidStateTransitionErrorBuilder of() {
        return new InvalidStateTransitionErrorBuilder();
    }

    public static InvalidStateTransitionErrorBuilder of(final InvalidStateTransitionError template) {
        InvalidStateTransitionErrorBuilder builder = new InvalidStateTransitionErrorBuilder();
        builder.message = template.getMessage();
        builder.currentState = template.getCurrentState();
        builder.newState = template.getNewState();
        return builder;
    }

}
