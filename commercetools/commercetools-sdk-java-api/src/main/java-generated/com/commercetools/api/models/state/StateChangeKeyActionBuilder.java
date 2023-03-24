
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeKeyAction stateChangeKeyAction = StateChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateChangeKeyActionBuilder implements Builder<StateChangeKeyAction> {

    private String key;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     * @return Builder
     */

    public StateChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    /**
     * builds StateChangeKeyAction with checking for non-null required values
     * @return StateChangeKeyAction
     */
    public StateChangeKeyAction build() {
        Objects.requireNonNull(key, StateChangeKeyAction.class + ": key is missing");
        return new StateChangeKeyActionImpl(key);
    }

    /**
     * builds StateChangeKeyAction without checking for non-null required values
     * @return StateChangeKeyAction
     */
    public StateChangeKeyAction buildUnchecked() {
        return new StateChangeKeyActionImpl(key);
    }

    public static StateChangeKeyActionBuilder of() {
        return new StateChangeKeyActionBuilder();
    }

    public static StateChangeKeyActionBuilder of(final StateChangeKeyAction template) {
        StateChangeKeyActionBuilder builder = new StateChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
