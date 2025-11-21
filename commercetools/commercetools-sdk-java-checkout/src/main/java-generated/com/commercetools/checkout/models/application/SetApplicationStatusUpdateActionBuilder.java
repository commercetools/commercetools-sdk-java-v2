
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationStatusUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationStatusUpdateAction setApplicationStatusUpdateAction = SetApplicationStatusUpdateAction.builder()
 *             .status(ApplicationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationStatusUpdateActionBuilder implements Builder<SetApplicationStatusUpdateAction> {

    private com.commercetools.checkout.models.application.ApplicationStatus status;

    /**
     *  <p>New status to assign to the Application.</p>
     * @param status value to be set
     * @return Builder
     */

    public SetApplicationStatusUpdateActionBuilder status(
            final com.commercetools.checkout.models.application.ApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>New status to assign to the Application.</p>
     * @return status
     */

    public com.commercetools.checkout.models.application.ApplicationStatus getStatus() {
        return this.status;
    }

    /**
     * builds SetApplicationStatusUpdateAction with checking for non-null required values
     * @return SetApplicationStatusUpdateAction
     */
    public SetApplicationStatusUpdateAction build() {
        Objects.requireNonNull(status, SetApplicationStatusUpdateAction.class + ": status is missing");
        return new SetApplicationStatusUpdateActionImpl(status);
    }

    /**
     * builds SetApplicationStatusUpdateAction without checking for non-null required values
     * @return SetApplicationStatusUpdateAction
     */
    public SetApplicationStatusUpdateAction buildUnchecked() {
        return new SetApplicationStatusUpdateActionImpl(status);
    }

    /**
     * factory method for an instance of SetApplicationStatusUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationStatusUpdateActionBuilder of() {
        return new SetApplicationStatusUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationStatusUpdateActionBuilder of(final SetApplicationStatusUpdateAction template) {
        SetApplicationStatusUpdateActionBuilder builder = new SetApplicationStatusUpdateActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
