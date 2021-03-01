
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeProductSearchIndexingEnabledActionImpl.class)
public interface ProjectChangeProductSearchIndexingEnabledAction extends ProjectUpdateAction {

    String CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED = "changeProductSearchIndexingEnabled";

    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    public void setEnabled(final Boolean enabled);

    public static ProjectChangeProductSearchIndexingEnabledAction of() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl();
    }

    public static ProjectChangeProductSearchIndexingEnabledAction of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionImpl instance = new ProjectChangeProductSearchIndexingEnabledActionImpl();
        instance.setEnabled(template.getEnabled());
        return instance;
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder() {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of(template);
    }

    default <T> T withProjectChangeProductSearchIndexingEnabledAction(
            Function<ProjectChangeProductSearchIndexingEnabledAction, T> helper) {
        return helper.apply(this);
    }
}
