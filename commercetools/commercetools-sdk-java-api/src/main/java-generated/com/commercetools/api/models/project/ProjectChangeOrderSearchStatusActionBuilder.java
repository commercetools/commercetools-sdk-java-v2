
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeOrderSearchStatusActionBuilder implements Builder<ProjectChangeOrderSearchStatusAction> {

    private com.commercetools.api.models.project.OrderSearchStatus status;

    public ProjectChangeOrderSearchStatusActionBuilder status(
            final com.commercetools.api.models.project.OrderSearchStatus status) {
        this.status = status;
        return this;
    }

    public com.commercetools.api.models.project.OrderSearchStatus getStatus() {
        return this.status;
    }

    public ProjectChangeOrderSearchStatusAction build() {
        Objects.requireNonNull(status, ProjectChangeOrderSearchStatusAction.class + ": status is missing");
        return new ProjectChangeOrderSearchStatusActionImpl(status);
    }

    /**
     * builds ProjectChangeOrderSearchStatusAction without checking for non null required values
     */
    public ProjectChangeOrderSearchStatusAction buildUnchecked() {
        return new ProjectChangeOrderSearchStatusActionImpl(status);
    }

    public static ProjectChangeOrderSearchStatusActionBuilder of() {
        return new ProjectChangeOrderSearchStatusActionBuilder();
    }

    public static ProjectChangeOrderSearchStatusActionBuilder of(final ProjectChangeOrderSearchStatusAction template) {
        ProjectChangeOrderSearchStatusActionBuilder builder = new ProjectChangeOrderSearchStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
