
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectUpdateBuilder implements Builder<ProjectUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> actions;

    public ProjectUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ProjectUpdateBuilder actions(final com.commercetools.api.models.project.ProjectUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ProjectUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public ProjectUpdateBuilder plusActions(final com.commercetools.api.models.project.ProjectUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ProjectUpdateBuilder plusActions(
            Function<com.commercetools.api.models.project.ProjectUpdateActionBuilder, Builder<? extends com.commercetools.api.models.project.ProjectUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.project.ProjectUpdateActionBuilder.of()).build());
        return this;
    }

    public ProjectUpdateBuilder withActions(
            Function<com.commercetools.api.models.project.ProjectUpdateActionBuilder, Builder<? extends com.commercetools.api.models.project.ProjectUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.project.ProjectUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.project.ProjectUpdateAction> getActions() {
        return this.actions;
    }

    public ProjectUpdate build() {
        Objects.requireNonNull(version, ProjectUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ProjectUpdate.class + ": actions is missing");
        return new ProjectUpdateImpl(version, actions);
    }

    /**
     * builds ProjectUpdate without checking for non null required values
     */
    public ProjectUpdate buildUnchecked() {
        return new ProjectUpdateImpl(version, actions);
    }

    public static ProjectUpdateBuilder of() {
        return new ProjectUpdateBuilder();
    }

    public static ProjectUpdateBuilder of(final ProjectUpdate template) {
        ProjectUpdateBuilder builder = new ProjectUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
