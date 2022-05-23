
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StateChangeKeyAction stateChangeKeyAction = StateChangeKeyAction.builder()
           .key("{key}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateChangeKeyActionBuilder implements Builder<StateChangeKeyAction> {

    private String key;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public StateChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StateChangeKeyAction build() {
        Objects.requireNonNull(key, StateChangeKeyAction.class + ": key is missing");
        return new StateChangeKeyActionImpl(key);
    }

    /**
     * builds StateChangeKeyAction without checking for non null required values
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
