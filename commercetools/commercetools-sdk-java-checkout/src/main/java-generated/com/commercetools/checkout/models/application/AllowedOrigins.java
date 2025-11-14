
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
 * AllowedOrigins
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AllowedOrigins allowedOrigins = AllowedOrigins.builder()
 *             .allowAll(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AllowedOriginsImpl.class)
public interface AllowedOrigins {

    /**
     *  <p>Indicates whether all the origin URLs are allowed or not.</p>
     * @return allowAll
     */
    @NotNull
    @JsonProperty("allowAll")
    public Boolean getAllowAll();

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @return origins
     */

    @JsonProperty("origins")
    public List<String> getOrigins();

    /**
     *  <p>Indicates whether all the origin URLs are allowed or not.</p>
     * @param allowAll value to be set
     */

    public void setAllowAll(final Boolean allowAll);

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @param origins values to be set
     */

    @JsonIgnore
    public void setOrigins(final String... origins);

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @param origins values to be set
     */

    public void setOrigins(final List<String> origins);

    /**
     * factory method
     * @return instance of AllowedOrigins
     */
    public static AllowedOrigins of() {
        return new AllowedOriginsImpl();
    }

    /**
     * factory method to create a shallow copy AllowedOrigins
     * @param template instance to be copied
     * @return copy instance
     */
    public static AllowedOrigins of(final AllowedOrigins template) {
        AllowedOriginsImpl instance = new AllowedOriginsImpl();
        instance.setAllowAll(template.getAllowAll());
        instance.setOrigins(template.getOrigins());
        return instance;
    }

    public AllowedOrigins copyDeep();

    /**
     * factory method to create a deep copy of AllowedOrigins
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AllowedOrigins deepCopy(@Nullable final AllowedOrigins template) {
        if (template == null) {
            return null;
        }
        AllowedOriginsImpl instance = new AllowedOriginsImpl();
        instance.setAllowAll(template.getAllowAll());
        instance.setOrigins(Optional.ofNullable(template.getOrigins()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AllowedOrigins
     * @return builder
     */
    public static AllowedOriginsBuilder builder() {
        return AllowedOriginsBuilder.of();
    }

    /**
     * create builder for AllowedOrigins instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AllowedOriginsBuilder builder(final AllowedOrigins template) {
        return AllowedOriginsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAllowedOrigins(Function<AllowedOrigins, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AllowedOrigins> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AllowedOrigins>() {
            @Override
            public String toString() {
                return "TypeReference<AllowedOrigins>";
            }
        };
    }
}
