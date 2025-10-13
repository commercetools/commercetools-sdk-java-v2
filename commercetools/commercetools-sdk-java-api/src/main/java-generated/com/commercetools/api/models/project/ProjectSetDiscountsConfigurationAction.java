
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProjectSetDiscountsConfigurationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetDiscountsConfigurationAction projectSetDiscountsConfigurationAction = ProjectSetDiscountsConfigurationAction.builder()
 *             .discountsConfiguration(discountsConfigurationBuilder -> discountsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDiscountsConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetDiscountsConfigurationActionImpl.class)
public interface ProjectSetDiscountsConfigurationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetDiscountsConfigurationAction
     */
    String SET_DISCOUNTS_CONFIGURATION = "setDiscountsConfiguration";

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @return discountsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("discountsConfiguration")
    public DiscountsConfiguration getDiscountsConfiguration();

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @param discountsConfiguration value to be set
     */

    public void setDiscountsConfiguration(final DiscountsConfiguration discountsConfiguration);

    /**
     * factory method
     * @return instance of ProjectSetDiscountsConfigurationAction
     */
    public static ProjectSetDiscountsConfigurationAction of() {
        return new ProjectSetDiscountsConfigurationActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetDiscountsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetDiscountsConfigurationAction of(final ProjectSetDiscountsConfigurationAction template) {
        ProjectSetDiscountsConfigurationActionImpl instance = new ProjectSetDiscountsConfigurationActionImpl();
        instance.setDiscountsConfiguration(template.getDiscountsConfiguration());
        return instance;
    }

    public ProjectSetDiscountsConfigurationAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectSetDiscountsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetDiscountsConfigurationAction deepCopy(
            @Nullable final ProjectSetDiscountsConfigurationAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetDiscountsConfigurationActionImpl instance = new ProjectSetDiscountsConfigurationActionImpl();
        instance.setDiscountsConfiguration(
            com.commercetools.api.models.project.DiscountsConfiguration.deepCopy(template.getDiscountsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for ProjectSetDiscountsConfigurationAction
     * @return builder
     */
    public static ProjectSetDiscountsConfigurationActionBuilder builder() {
        return ProjectSetDiscountsConfigurationActionBuilder.of();
    }

    /**
     * create builder for ProjectSetDiscountsConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetDiscountsConfigurationActionBuilder builder(
            final ProjectSetDiscountsConfigurationAction template) {
        return ProjectSetDiscountsConfigurationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetDiscountsConfigurationAction(
            Function<ProjectSetDiscountsConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetDiscountsConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetDiscountsConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetDiscountsConfigurationAction>";
            }
        };
    }
}
