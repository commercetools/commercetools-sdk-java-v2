
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.RoundingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProjectChangeTaxRoundingModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeTaxRoundingModeAction projectChangeTaxRoundingModeAction = ProjectChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeTaxRoundingMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeTaxRoundingModeActionImpl.class)
public interface ProjectChangeTaxRoundingModeAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeTaxRoundingModeAction
     */
    String CHANGE_TAX_ROUNDING_MODE = "changeTaxRoundingMode";

    /**
     *  <p>Project-level default rounding mode for tax calculation. See CartsConfiguration.</p>
     * @return taxRoundingMode
     */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Project-level default rounding mode for tax calculation. See CartsConfiguration.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     * factory method
     * @return instance of ProjectChangeTaxRoundingModeAction
     */
    public static ProjectChangeTaxRoundingModeAction of() {
        return new ProjectChangeTaxRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeTaxRoundingModeAction of(final ProjectChangeTaxRoundingModeAction template) {
        ProjectChangeTaxRoundingModeActionImpl instance = new ProjectChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    public ProjectChangeTaxRoundingModeAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeTaxRoundingModeAction deepCopy(
            @Nullable final ProjectChangeTaxRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeTaxRoundingModeActionImpl instance = new ProjectChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeTaxRoundingModeAction
     * @return builder
     */
    public static ProjectChangeTaxRoundingModeActionBuilder builder() {
        return ProjectChangeTaxRoundingModeActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeTaxRoundingModeActionBuilder builder(final ProjectChangeTaxRoundingModeAction template) {
        return ProjectChangeTaxRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeTaxRoundingModeAction(Function<ProjectChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeTaxRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeTaxRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeTaxRoundingModeAction>";
            }
        };
    }
}
