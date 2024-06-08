
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ProjectSetExternalOAuthAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetExternalOAuthAction projectSetExternalOAuthAction = ProjectSetExternalOAuthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetExternalOAuthActionImpl.class)
public interface ProjectSetExternalOAuthAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetExternalOAuthAction
     */
    String SET_EXTERNAL_O_AUTH = "setExternalOAuth";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalOAuth
     */
    @Valid
    @JsonProperty("externalOAuth")
    public ExternalOAuth getExternalOAuth();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalOAuth value to be set
     */

    public void setExternalOAuth(final ExternalOAuth externalOAuth);

    /**
     * factory method
     * @return instance of ProjectSetExternalOAuthAction
     */
    public static ProjectSetExternalOAuthAction of() {
        return new ProjectSetExternalOAuthActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetExternalOAuthAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetExternalOAuthAction of(final ProjectSetExternalOAuthAction template) {
        ProjectSetExternalOAuthActionImpl instance = new ProjectSetExternalOAuthActionImpl();
        instance.setExternalOAuth(template.getExternalOAuth());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectSetExternalOAuthAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetExternalOAuthAction deepCopy(@Nullable final ProjectSetExternalOAuthAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetExternalOAuthActionImpl instance = new ProjectSetExternalOAuthActionImpl();
        instance.setExternalOAuth(
            com.commercetools.api.models.project.ExternalOAuth.deepCopy(template.getExternalOAuth()));
        return instance;
    }

    /**
     * builder factory method for ProjectSetExternalOAuthAction
     * @return builder
     */
    public static ProjectSetExternalOAuthActionBuilder builder() {
        return ProjectSetExternalOAuthActionBuilder.of();
    }

    /**
     * create builder for ProjectSetExternalOAuthAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetExternalOAuthActionBuilder builder(final ProjectSetExternalOAuthAction template) {
        return ProjectSetExternalOAuthActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetExternalOAuthAction(Function<ProjectSetExternalOAuthAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetExternalOAuthAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetExternalOAuthAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetExternalOAuthAction>";
            }
        };
    }
}
