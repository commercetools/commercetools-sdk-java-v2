package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesActionImpl;

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
@JsonDeserialize(as = ProjectChangeCurrenciesActionImpl.class)
public interface ProjectChangeCurrenciesAction extends ProjectUpdateAction {

    /**
    *  <p>A three-digit currency code as per currency code.</p>
    */
    @NotNull
    @JsonProperty("currencies")
    public List<String> getCurrencies();

    public void setCurrencies(final List<String> currencies);

    public static ProjectChangeCurrenciesActionImpl of(){
        return new ProjectChangeCurrenciesActionImpl();
    }
    

    public static ProjectChangeCurrenciesActionImpl of(final ProjectChangeCurrenciesAction template) {
        ProjectChangeCurrenciesActionImpl instance = new ProjectChangeCurrenciesActionImpl();
        instance.setCurrencies(template.getCurrencies());
        return instance;
    }

    default <T extends Accessor<ProjectChangeCurrenciesAction>> T withProjectChangeCurrenciesAction(Function<ProjectChangeCurrenciesAction, T> helper) {
        return helper.apply(this);
    }
}
