
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeInitialActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeInitialAction stateChangeInitialAction = StateChangeInitialAction.builder()
 *             .initial(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateChangeInitialActionBuilder implements Builder<StateChangeInitialAction> {

    private Boolean initial;

    /**
     *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
     * @param initial
     * @return Builder
     */

    public StateChangeInitialActionBuilder initial(final Boolean initial) {
        this.initial = initial;
        return this;
    }

    public Boolean getInitial() {
        return this.initial;
    }

    public StateChangeInitialAction build() {
        Objects.requireNonNull(initial, StateChangeInitialAction.class + ": initial is missing");
        return new StateChangeInitialActionImpl(initial);
    }

    /**
     * builds StateChangeInitialAction without checking for non null required values
     */
    public StateChangeInitialAction buildUnchecked() {
        return new StateChangeInitialActionImpl(initial);
    }

    public static StateChangeInitialActionBuilder of() {
        return new StateChangeInitialActionBuilder();
    }

    public static StateChangeInitialActionBuilder of(final StateChangeInitialAction template) {
        StateChangeInitialActionBuilder builder = new StateChangeInitialActionBuilder();
        builder.initial = template.getInitial();
        return builder;
    }

}
