
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
 * ProjectChangePriceRoundingModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangePriceRoundingModeAction projectChangePriceRoundingModeAction = ProjectChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePriceRoundingMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangePriceRoundingModeActionImpl.class)
public interface ProjectChangePriceRoundingModeAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangePriceRoundingModeAction
     */
    String CHANGE_PRICE_ROUNDING_MODE = "changePriceRoundingMode";

    /**
     *  <p>Project-level default rounding mode for calculating the total prices on LineItems and CustomLineItems. See CartsConfiguration.</p>
     * @return priceRoundingMode
     */
    @NotNull
    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>Project-level default rounding mode for calculating the total prices on LineItems and CustomLineItems. See CartsConfiguration.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     * factory method
     * @return instance of ProjectChangePriceRoundingModeAction
     */
    public static ProjectChangePriceRoundingModeAction of() {
        return new ProjectChangePriceRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangePriceRoundingModeAction of(final ProjectChangePriceRoundingModeAction template) {
        ProjectChangePriceRoundingModeActionImpl instance = new ProjectChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    public ProjectChangePriceRoundingModeAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangePriceRoundingModeAction deepCopy(
            @Nullable final ProjectChangePriceRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangePriceRoundingModeActionImpl instance = new ProjectChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    /**
     * builder factory method for ProjectChangePriceRoundingModeAction
     * @return builder
     */
    public static ProjectChangePriceRoundingModeActionBuilder builder() {
        return ProjectChangePriceRoundingModeActionBuilder.of();
    }

    /**
     * create builder for ProjectChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangePriceRoundingModeActionBuilder builder(
            final ProjectChangePriceRoundingModeAction template) {
        return ProjectChangePriceRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangePriceRoundingModeAction(Function<ProjectChangePriceRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangePriceRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangePriceRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangePriceRoundingModeAction>";
            }
        };
    }
}
