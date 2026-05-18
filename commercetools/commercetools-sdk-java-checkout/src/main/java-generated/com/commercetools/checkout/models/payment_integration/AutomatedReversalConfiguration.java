
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Configuration for automated reversal of payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AutomatedReversalConfiguration automatedReversalConfiguration = AutomatedReversalConfiguration.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AutomatedReversalConfigurationImpl.class)
public interface AutomatedReversalConfiguration {

    /**
     *  <p>Indicates whether the automated reversal configuration is active or not.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public String getStatus();

    /**
     *  <p>Cart-based predicate in JSONata format to determine when automated reversal should be applied.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Indicates whether the automated reversal configuration is active or not.</p>
     * @param status value to be set
     */

    public void setStatus(final String status);

    /**
     *  <p>Cart-based predicate in JSONata format to determine when automated reversal should be applied.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of AutomatedReversalConfiguration
     */
    public static AutomatedReversalConfiguration of() {
        return new AutomatedReversalConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy AutomatedReversalConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static AutomatedReversalConfiguration of(final AutomatedReversalConfiguration template) {
        AutomatedReversalConfigurationImpl instance = new AutomatedReversalConfigurationImpl();
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public AutomatedReversalConfiguration copyDeep();

    /**
     * factory method to create a deep copy of AutomatedReversalConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AutomatedReversalConfiguration deepCopy(@Nullable final AutomatedReversalConfiguration template) {
        if (template == null) {
            return null;
        }
        AutomatedReversalConfigurationImpl instance = new AutomatedReversalConfigurationImpl();
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for AutomatedReversalConfiguration
     * @return builder
     */
    public static AutomatedReversalConfigurationBuilder builder() {
        return AutomatedReversalConfigurationBuilder.of();
    }

    /**
     * create builder for AutomatedReversalConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AutomatedReversalConfigurationBuilder builder(final AutomatedReversalConfiguration template) {
        return AutomatedReversalConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAutomatedReversalConfiguration(Function<AutomatedReversalConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AutomatedReversalConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AutomatedReversalConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<AutomatedReversalConfiguration>";
            }
        };
    }
}
