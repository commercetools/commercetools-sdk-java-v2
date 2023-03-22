
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeBusinessUnitStatusOnCreationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeBusinessUnitStatusOnCreationAction projectChangeBusinessUnitStatusOnCreationAction = ProjectChangeBusinessUnitStatusOnCreationAction.builder()
 *             .status(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeBusinessUnitStatusOnCreationActionBuilder
        implements Builder<ProjectChangeBusinessUnitStatusOnCreationAction> {

    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus status;

    /**
     *  <p>Status for Business Units created using the My Business Unit endpoint.</p>
     * @param status
     * @return Builder
     */

    public ProjectChangeBusinessUnitStatusOnCreationActionBuilder status(
            final com.commercetools.api.models.project.BusinessUnitConfigurationStatus status) {
        this.status = status;
        return this;
    }

    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getStatus() {
        return this.status;
    }

    public ProjectChangeBusinessUnitStatusOnCreationAction build() {
        Objects.requireNonNull(status, ProjectChangeBusinessUnitStatusOnCreationAction.class + ": status is missing");
        return new ProjectChangeBusinessUnitStatusOnCreationActionImpl(status);
    }

    /**
     * builds ProjectChangeBusinessUnitStatusOnCreationAction without checking for non null required values
     */
    public ProjectChangeBusinessUnitStatusOnCreationAction buildUnchecked() {
        return new ProjectChangeBusinessUnitStatusOnCreationActionImpl(status);
    }

    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder of() {
        return new ProjectChangeBusinessUnitStatusOnCreationActionBuilder();
    }

    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder of(
            final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder = new ProjectChangeBusinessUnitStatusOnCreationActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
