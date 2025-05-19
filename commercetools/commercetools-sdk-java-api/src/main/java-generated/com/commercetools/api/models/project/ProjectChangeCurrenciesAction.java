
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
 * ProjectChangeCurrenciesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCurrenciesAction projectChangeCurrenciesAction = ProjectChangeCurrenciesAction.builder()
 *             .plusCurrencies(currenciesBuilder -> currenciesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCurrencies")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCurrenciesActionImpl.class)
public interface ProjectChangeCurrenciesAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeCurrenciesAction
     */
    String CHANGE_CURRENCIES = "changeCurrencies";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return currencies
     */
    @NotNull
    @JsonProperty("currencies")
    public List<String> getCurrencies();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param currencies values to be set
     */

    @JsonIgnore
    public void setCurrencies(final String... currencies);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param currencies values to be set
     */

    public void setCurrencies(final List<String> currencies);

    /**
     * factory method
     * @return instance of ProjectChangeCurrenciesAction
     */
    public static ProjectChangeCurrenciesAction of() {
        return new ProjectChangeCurrenciesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeCurrenciesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeCurrenciesAction of(final ProjectChangeCurrenciesAction template) {
        ProjectChangeCurrenciesActionImpl instance = new ProjectChangeCurrenciesActionImpl();
        instance.setCurrencies(template.getCurrencies());
        return instance;
    }

    public ProjectChangeCurrenciesAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeCurrenciesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeCurrenciesAction deepCopy(@Nullable final ProjectChangeCurrenciesAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeCurrenciesActionImpl instance = new ProjectChangeCurrenciesActionImpl();
        instance.setCurrencies(Optional.ofNullable(template.getCurrencies()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeCurrenciesAction
     * @return builder
     */
    public static ProjectChangeCurrenciesActionBuilder builder() {
        return ProjectChangeCurrenciesActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeCurrenciesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCurrenciesActionBuilder builder(final ProjectChangeCurrenciesAction template) {
        return ProjectChangeCurrenciesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeCurrenciesAction(Function<ProjectChangeCurrenciesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCurrenciesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCurrenciesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCurrenciesAction>";
            }
        };
    }
}
