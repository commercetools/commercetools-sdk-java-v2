package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeProductSearchIndexingEnabledActionImpl.class)
public interface ProjectChangeProductSearchIndexingEnabledAction extends ProjectUpdateAction {

    String CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED = "changeProductSearchIndexingEnabled";

    
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    
    public void setEnabled(final Boolean enabled);
    

    public static ProjectChangeProductSearchIndexingEnabledAction of(){
        return new ProjectChangeProductSearchIndexingEnabledActionImpl();
    }
    

    public static ProjectChangeProductSearchIndexingEnabledAction of(final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionImpl instance = new ProjectChangeProductSearchIndexingEnabledActionImpl();
        instance.setEnabled(template.getEnabled());
        return instance;
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder(){
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }
    
    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder(final ProjectChangeProductSearchIndexingEnabledAction template){
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of(template);
    }
    

    default <T> T withProjectChangeProductSearchIndexingEnabledAction(Function<ProjectChangeProductSearchIndexingEnabledAction, T> helper) {
        return helper.apply(this);
    }
}
