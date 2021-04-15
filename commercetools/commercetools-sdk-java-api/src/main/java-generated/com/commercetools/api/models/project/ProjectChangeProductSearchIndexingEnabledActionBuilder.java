package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeProductSearchIndexingEnabledActionBuilder {

    
    
    private Boolean enabled;

    
    public ProjectChangeProductSearchIndexingEnabledActionBuilder enabled( final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    
    
    public Boolean getEnabled(){
        return this.enabled;
    }

    public ProjectChangeProductSearchIndexingEnabledAction build() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled);
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of() {
        return new ProjectChangeProductSearchIndexingEnabledActionBuilder();
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of(final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionBuilder builder = new ProjectChangeProductSearchIndexingEnabledActionBuilder();
        builder.enabled = template.getEnabled();
        return builder;
    }

}
