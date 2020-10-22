package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeLanguagesActionImpl.class)
public interface ProjectChangeLanguagesAction extends ProjectUpdateAction {

    /**
    *  <p>.</p>
    */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    public void setLanguages(final List<String> languages);

    public static ProjectChangeLanguagesActionImpl of(){
        return new ProjectChangeLanguagesActionImpl();
    }
    

    public static ProjectChangeLanguagesActionImpl of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionImpl instance = new ProjectChangeLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    default <T extends Accessor<ProjectChangeLanguagesAction>> T withProjectChangeLanguagesAction(Function<ProjectChangeLanguagesAction, T> helper) {
        return helper.apply(this);
    }
}
