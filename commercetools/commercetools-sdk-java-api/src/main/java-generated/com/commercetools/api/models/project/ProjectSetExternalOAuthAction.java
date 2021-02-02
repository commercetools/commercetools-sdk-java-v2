
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectSetExternalOAuthActionImpl.class)
public interface ProjectSetExternalOAuthAction extends ProjectUpdateAction {

    String SET_EXTERNAL_O_AUTH = "setExternalOAuth";

    /**
    *  <p>If you do not provide the <code>externalOAuth</code> field or provide a value
    *  of <code>null</code>, the update action unsets the External OAuth provider.</p>
    */
    @Valid
    @JsonProperty("externalOAuth")
    public ExternalOAuth getExternalOAuth();

    public void setExternalOAuth(final ExternalOAuth externalOAuth);

    public static ProjectSetExternalOAuthAction of() {
        return new ProjectSetExternalOAuthActionImpl();
    }

    public static ProjectSetExternalOAuthAction of(final ProjectSetExternalOAuthAction template) {
        ProjectSetExternalOAuthActionImpl instance = new ProjectSetExternalOAuthActionImpl();
        instance.setExternalOAuth(template.getExternalOAuth());
        return instance;
    }

    public static ProjectSetExternalOAuthActionBuilder builder() {
        return ProjectSetExternalOAuthActionBuilder.of();
    }

    public static ProjectSetExternalOAuthActionBuilder builder(final ProjectSetExternalOAuthAction template) {
        return ProjectSetExternalOAuthActionBuilder.of(template);
    }

    default <T> T withProjectSetExternalOAuthAction(Function<ProjectSetExternalOAuthAction, T> helper) {
        return helper.apply(this);
    }
}
