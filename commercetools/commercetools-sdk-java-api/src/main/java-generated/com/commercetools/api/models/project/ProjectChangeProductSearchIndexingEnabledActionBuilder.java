
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeProductSearchIndexingEnabledActionBuilder {

    private Boolean enabled;

    public ProjectChangeProductSearchIndexingEnabledActionBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ProjectChangeProductSearchIndexingEnabledAction build() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled);
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of() {
        return new ProjectChangeProductSearchIndexingEnabledActionBuilder();
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionBuilder builder = new ProjectChangeProductSearchIndexingEnabledActionBuilder();
        builder.enabled = template.getEnabled();
        return builder;
    }

}
