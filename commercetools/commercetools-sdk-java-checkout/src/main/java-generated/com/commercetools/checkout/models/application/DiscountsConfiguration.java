
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * DiscountsConfiguration
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountsConfiguration discountsConfiguration = DiscountsConfiguration.builder()
 *             .allowDiscounts(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountsConfigurationImpl.class)
public interface DiscountsConfiguration {

    /**
     *  <p>Indicates if the buyer is able to apply discounts to the cart. It is only applicable if the <code>mode = CompleteFlow</code>.</p>
     * @return allowDiscounts
     */
    @NotNull
    @JsonProperty("allowDiscounts")
    public Boolean getAllowDiscounts();

    /**
     *  <p>Indicates if the buyer is able to apply discounts to the cart. It is only applicable if the <code>mode = CompleteFlow</code>.</p>
     * @param allowDiscounts value to be set
     */

    public void setAllowDiscounts(final Boolean allowDiscounts);

    /**
     * factory method
     * @return instance of DiscountsConfiguration
     */
    public static DiscountsConfiguration of() {
        return new DiscountsConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy DiscountsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountsConfiguration of(final DiscountsConfiguration template) {
        DiscountsConfigurationImpl instance = new DiscountsConfigurationImpl();
        instance.setAllowDiscounts(template.getAllowDiscounts());
        return instance;
    }

    public DiscountsConfiguration copyDeep();

    /**
     * factory method to create a deep copy of DiscountsConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountsConfiguration deepCopy(@Nullable final DiscountsConfiguration template) {
        if (template == null) {
            return null;
        }
        DiscountsConfigurationImpl instance = new DiscountsConfigurationImpl();
        instance.setAllowDiscounts(template.getAllowDiscounts());
        return instance;
    }

    /**
     * builder factory method for DiscountsConfiguration
     * @return builder
     */
    public static DiscountsConfigurationBuilder builder() {
        return DiscountsConfigurationBuilder.of();
    }

    /**
     * create builder for DiscountsConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountsConfigurationBuilder builder(final DiscountsConfiguration template) {
        return DiscountsConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountsConfiguration(Function<DiscountsConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountsConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountsConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountsConfiguration>";
            }
        };
    }
}
