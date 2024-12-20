
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeBusinessUnitSearchStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeBusinessUnitSearchStatusAction projectChangeBusinessUnitSearchStatusAction = ProjectChangeBusinessUnitSearchStatusAction.builder()
 *             .status(BusinessUnitSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeBusinessUnitSearchStatusActionBuilder
        implements Builder<ProjectChangeBusinessUnitSearchStatusAction> {

    private com.commercetools.api.models.project.BusinessUnitSearchStatus status;

    /**
     *  <p>Activates or deactivates the Search Business Units feature. Activation will trigger building a search index for the Business Units in the Project.</p>
     * @param status value to be set
     * @return Builder
     */

    public ProjectChangeBusinessUnitSearchStatusActionBuilder status(
            final com.commercetools.api.models.project.BusinessUnitSearchStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Activates or deactivates the Search Business Units feature. Activation will trigger building a search index for the Business Units in the Project.</p>
     * @return status
     */

    public com.commercetools.api.models.project.BusinessUnitSearchStatus getStatus() {
        return this.status;
    }

    /**
     * builds ProjectChangeBusinessUnitSearchStatusAction with checking for non-null required values
     * @return ProjectChangeBusinessUnitSearchStatusAction
     */
    public ProjectChangeBusinessUnitSearchStatusAction build() {
        Objects.requireNonNull(status, ProjectChangeBusinessUnitSearchStatusAction.class + ": status is missing");
        return new ProjectChangeBusinessUnitSearchStatusActionImpl(status);
    }

    /**
     * builds ProjectChangeBusinessUnitSearchStatusAction without checking for non-null required values
     * @return ProjectChangeBusinessUnitSearchStatusAction
     */
    public ProjectChangeBusinessUnitSearchStatusAction buildUnchecked() {
        return new ProjectChangeBusinessUnitSearchStatusActionImpl(status);
    }

    /**
     * factory method for an instance of ProjectChangeBusinessUnitSearchStatusActionBuilder
     * @return builder
     */
    public static ProjectChangeBusinessUnitSearchStatusActionBuilder of() {
        return new ProjectChangeBusinessUnitSearchStatusActionBuilder();
    }

    /**
     * create builder for ProjectChangeBusinessUnitSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeBusinessUnitSearchStatusActionBuilder of(
            final ProjectChangeBusinessUnitSearchStatusAction template) {
        ProjectChangeBusinessUnitSearchStatusActionBuilder builder = new ProjectChangeBusinessUnitSearchStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
