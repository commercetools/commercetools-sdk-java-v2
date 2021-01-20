
package com.commercetools.api.models.project;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeNameActionBuilder {

    private String name;

    public ProjectChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProjectChangeNameAction build() {
        return new ProjectChangeNameActionImpl(name);
    }

    public static ProjectChangeNameActionBuilder of() {
        return new ProjectChangeNameActionBuilder();
    }

    public static ProjectChangeNameActionBuilder of(final ProjectChangeNameAction template) {
        ProjectChangeNameActionBuilder builder = new ProjectChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
