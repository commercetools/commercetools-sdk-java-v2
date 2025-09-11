
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeOrderSearchStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeOrderSearchStatusAction projectChangeOrderSearchStatusAction = ProjectChangeOrderSearchStatusAction.builder()
 *             .status(OrderSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeOrderSearchStatusActionBuilder implements Builder<ProjectChangeOrderSearchStatusAction> {

    private com.commercetools.api.models.project.OrderSearchStatus status;

    /**
     *  <p>Activates or deactivates the <span>Order Search</span> feature. Activation will trigger building a search index for the Orders in the Project.</p>
     * @param status value to be set
     * @return Builder
     */

    public ProjectChangeOrderSearchStatusActionBuilder status(
            final com.commercetools.api.models.project.OrderSearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Activates or deactivates the <span>Order Search</span> feature. Activation will trigger building a search index for the Orders in the Project.</p>
     * @return status
     */

    public com.commercetools.api.models.project.OrderSearchStatus getStatus() {
        return this.status;
    }

    /**
     * builds ProjectChangeOrderSearchStatusAction with checking for non-null required values
     * @return ProjectChangeOrderSearchStatusAction
     */
    public ProjectChangeOrderSearchStatusAction build() {
        Objects.requireNonNull(status, ProjectChangeOrderSearchStatusAction.class + ": status is missing");
        return new ProjectChangeOrderSearchStatusActionImpl(status);
    }

    /**
     * builds ProjectChangeOrderSearchStatusAction without checking for non-null required values
     * @return ProjectChangeOrderSearchStatusAction
     */
    public ProjectChangeOrderSearchStatusAction buildUnchecked() {
        return new ProjectChangeOrderSearchStatusActionImpl(status);
    }

    /**
     * factory method for an instance of ProjectChangeOrderSearchStatusActionBuilder
     * @return builder
     */
    public static ProjectChangeOrderSearchStatusActionBuilder of() {
        return new ProjectChangeOrderSearchStatusActionBuilder();
    }

    /**
     * create builder for ProjectChangeOrderSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeOrderSearchStatusActionBuilder of(final ProjectChangeOrderSearchStatusAction template) {
        ProjectChangeOrderSearchStatusActionBuilder builder = new ProjectChangeOrderSearchStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
