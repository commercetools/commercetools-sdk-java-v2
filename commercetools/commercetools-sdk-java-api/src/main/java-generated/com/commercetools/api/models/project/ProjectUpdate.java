package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectUpdateImpl;

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
@JsonDeserialize(as = ProjectUpdateImpl.class)
public interface ProjectUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProjectUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final ProjectUpdateAction ...actions);
    public void setActions(final List<ProjectUpdateAction> actions);

    public static ProjectUpdateImpl of(){
        return new ProjectUpdateImpl();
    }
    

    public static ProjectUpdateImpl of(final ProjectUpdate template) {
        ProjectUpdateImpl instance = new ProjectUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withProjectUpdate(Function<ProjectUpdate, T> helper) {
        return helper.apply(this);
    }
}
