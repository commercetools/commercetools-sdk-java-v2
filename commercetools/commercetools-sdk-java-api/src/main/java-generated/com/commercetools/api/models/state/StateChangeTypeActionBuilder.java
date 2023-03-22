
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeTypeAction stateChangeTypeAction = StateChangeTypeAction.builder()
 *             .type(StateTypeEnum.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateChangeTypeActionBuilder implements Builder<StateChangeTypeAction> {

    private com.commercetools.api.models.state.StateTypeEnum type;

    /**
     *  <p>Resource or object types the State shall be assigned to. Must not be empty.</p>
     * @param type
     * @return Builder
     */

    public StateChangeTypeActionBuilder type(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    public StateChangeTypeAction build() {
        Objects.requireNonNull(type, StateChangeTypeAction.class + ": type is missing");
        return new StateChangeTypeActionImpl(type);
    }

    /**
     * builds StateChangeTypeAction without checking for non null required values
     */
    public StateChangeTypeAction buildUnchecked() {
        return new StateChangeTypeActionImpl(type);
    }

    public static StateChangeTypeActionBuilder of() {
        return new StateChangeTypeActionBuilder();
    }

    public static StateChangeTypeActionBuilder of(final StateChangeTypeAction template) {
        StateChangeTypeActionBuilder builder = new StateChangeTypeActionBuilder();
        builder.type = template.getType();
        return builder;
    }

}
