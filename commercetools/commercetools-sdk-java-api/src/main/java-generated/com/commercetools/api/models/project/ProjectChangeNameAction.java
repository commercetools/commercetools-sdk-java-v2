
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeNameActionImpl.class)
public interface ProjectChangeNameAction extends ProjectUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>New value to set. Must not be empty.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ProjectChangeNameAction of() {
        return new ProjectChangeNameActionImpl();
    }

    public static ProjectChangeNameAction of(final ProjectChangeNameAction template) {
        ProjectChangeNameActionImpl instance = new ProjectChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProjectChangeNameActionBuilder builder() {
        return ProjectChangeNameActionBuilder.of();
    }

    public static ProjectChangeNameActionBuilder builder(final ProjectChangeNameAction template) {
        return ProjectChangeNameActionBuilder.of(template);
    }

    default <T> T withProjectChangeNameAction(Function<ProjectChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeNameAction>";
            }
        };
    }
}
