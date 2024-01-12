
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeProductSearchStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeProductSearchStatusAction projectChangeProductSearchStatusAction = ProjectChangeProductSearchStatusAction.builder()
 *             .status(ProductSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchStatusActionBuilder implements Builder<ProjectChangeProductSearchStatusAction> {

    private com.commercetools.api.models.project.ProductSearchStatus status;

    /**
     *  <p>Activates or deactivates the Product Search feature. Activation will trigger building a search index for the Products in the Project.</p>
     * @param status value to be set
     * @return Builder
     */

    public ProjectChangeProductSearchStatusActionBuilder status(
            final com.commercetools.api.models.project.ProductSearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Activates or deactivates the Product Search feature. Activation will trigger building a search index for the Products in the Project.</p>
     * @return status
     */

    public com.commercetools.api.models.project.ProductSearchStatus getStatus() {
        return this.status;
    }

    /**
     * builds ProjectChangeProductSearchStatusAction with checking for non-null required values
     * @return ProjectChangeProductSearchStatusAction
     */
    public ProjectChangeProductSearchStatusAction build() {
        Objects.requireNonNull(status, ProjectChangeProductSearchStatusAction.class + ": status is missing");
        return new ProjectChangeProductSearchStatusActionImpl(status);
    }

    /**
     * builds ProjectChangeProductSearchStatusAction without checking for non-null required values
     * @return ProjectChangeProductSearchStatusAction
     */
    public ProjectChangeProductSearchStatusAction buildUnchecked() {
        return new ProjectChangeProductSearchStatusActionImpl(status);
    }

    /**
     * factory method for an instance of ProjectChangeProductSearchStatusActionBuilder
     * @return builder
     */
    public static ProjectChangeProductSearchStatusActionBuilder of() {
        return new ProjectChangeProductSearchStatusActionBuilder();
    }

    /**
     * create builder for ProjectChangeProductSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeProductSearchStatusActionBuilder of(
            final ProjectChangeProductSearchStatusAction template) {
        ProjectChangeProductSearchStatusActionBuilder builder = new ProjectChangeProductSearchStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
