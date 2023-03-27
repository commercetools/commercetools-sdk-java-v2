
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateAction updateAction = UpdateAction.builder()
 *             .action("{action}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateActionBuilder implements Builder<UpdateAction> {

    private String action;

    /**
     * set the value to the action
     * @param action value to be set
     * @return Builder
     */

    public UpdateActionBuilder action(final String action) {
        this.action = action;
        return this;
    }

    /**
     * value of action}
     * @return action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * builds UpdateAction with checking for non-null required values
     * @return UpdateAction
     */
    public UpdateAction build() {
        Objects.requireNonNull(action, UpdateAction.class + ": action is missing");
        return new UpdateActionImpl(action);
    }

    /**
     * builds UpdateAction without checking for non-null required values
     * @return UpdateAction
     */
    public UpdateAction buildUnchecked() {
        return new UpdateActionImpl(action);
    }

    /**
     * factory method for an instance of UpdateActionBuilder
     * @return builder
     */
    public static UpdateActionBuilder of() {
        return new UpdateActionBuilder();
    }

    /**
     * create builder for UpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateActionBuilder of(final UpdateAction template) {
        UpdateActionBuilder builder = new UpdateActionBuilder();
        builder.action = template.getAction();
        return builder;
    }

}
