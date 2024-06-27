
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCustomerSearchStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCustomerSearchStatusAction projectChangeCustomerSearchStatusAction = ProjectChangeCustomerSearchStatusAction.builder()
 *             .status(CustomerSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCustomerSearchStatusActionBuilder
        implements Builder<ProjectChangeCustomerSearchStatusAction> {

    private com.commercetools.api.models.project.CustomerSearchStatus status;

    /**
     *  <p>Activates or deactivates the Customer Search feature. Activation will trigger building a search index for the Customers in the Project.</p>
     * @param status value to be set
     * @return Builder
     */

    public ProjectChangeCustomerSearchStatusActionBuilder status(
            final com.commercetools.api.models.project.CustomerSearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Activates or deactivates the Customer Search feature. Activation will trigger building a search index for the Customers in the Project.</p>
     * @return status
     */

    public com.commercetools.api.models.project.CustomerSearchStatus getStatus() {
        return this.status;
    }

    /**
     * builds ProjectChangeCustomerSearchStatusAction with checking for non-null required values
     * @return ProjectChangeCustomerSearchStatusAction
     */
    public ProjectChangeCustomerSearchStatusAction build() {
        Objects.requireNonNull(status, ProjectChangeCustomerSearchStatusAction.class + ": status is missing");
        return new ProjectChangeCustomerSearchStatusActionImpl(status);
    }

    /**
     * builds ProjectChangeCustomerSearchStatusAction without checking for non-null required values
     * @return ProjectChangeCustomerSearchStatusAction
     */
    public ProjectChangeCustomerSearchStatusAction buildUnchecked() {
        return new ProjectChangeCustomerSearchStatusActionImpl(status);
    }

    /**
     * factory method for an instance of ProjectChangeCustomerSearchStatusActionBuilder
     * @return builder
     */
    public static ProjectChangeCustomerSearchStatusActionBuilder of() {
        return new ProjectChangeCustomerSearchStatusActionBuilder();
    }

    /**
     * create builder for ProjectChangeCustomerSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCustomerSearchStatusActionBuilder of(
            final ProjectChangeCustomerSearchStatusAction template) {
        ProjectChangeCustomerSearchStatusActionBuilder builder = new ProjectChangeCustomerSearchStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
