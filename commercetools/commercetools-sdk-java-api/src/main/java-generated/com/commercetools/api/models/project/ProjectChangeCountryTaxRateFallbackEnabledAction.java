
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProjectChangeCountryTaxRateFallbackEnabledAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCountryTaxRateFallbackEnabledAction projectChangeCountryTaxRateFallbackEnabledAction = ProjectChangeCountryTaxRateFallbackEnabledAction.builder()
 *             .countryTaxRateFallbackEnabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class)
public interface ProjectChangeCountryTaxRateFallbackEnabledAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeCountryTaxRateFallbackEnabledAction
     */
    String CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED = "changeCountryTaxRateFallbackEnabled";

    /**
     *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See CartsConfiguration.</p>
     * @return countryTaxRateFallbackEnabled
     */
    @NotNull
    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    /**
     *  <p>When <code>true</code>, country <em>- no state</em> Tax Rate is used as fallback. See CartsConfiguration.</p>
     * @param countryTaxRateFallbackEnabled value to be set
     */

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    /**
     * factory method
     * @return instance of ProjectChangeCountryTaxRateFallbackEnabledAction
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledAction of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeCountryTaxRateFallbackEnabledAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledAction of(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl instance = new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeCountryTaxRateFallbackEnabledAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeCountryTaxRateFallbackEnabledAction deepCopy(
            @Nullable final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl instance = new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeCountryTaxRateFallbackEnabledAction
     * @return builder
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder() {
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeCountryTaxRateFallbackEnabledAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeCountryTaxRateFallbackEnabledAction(
            Function<ProjectChangeCountryTaxRateFallbackEnabledAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCountryTaxRateFallbackEnabledAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCountryTaxRateFallbackEnabledAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCountryTaxRateFallbackEnabledAction>";
            }
        };
    }
}
