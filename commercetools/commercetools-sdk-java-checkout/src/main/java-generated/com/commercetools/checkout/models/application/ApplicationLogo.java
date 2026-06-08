
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationLogo applicationLogo = ApplicationLogo.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationLogoImpl.class)
public interface ApplicationLogo {

    /**
     *  <p>URL of the logo.</p>
     * @return url
     */

    @JsonProperty("url")
    public String getUrl();

    /**
     *  <p>URL of the logo.</p>
     * @param url value to be set
     */

    public void setUrl(final String url);

    /**
     * factory method
     * @return instance of ApplicationLogo
     */
    public static ApplicationLogo of() {
        return new ApplicationLogoImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationLogo
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationLogo of(final ApplicationLogo template) {
        ApplicationLogoImpl instance = new ApplicationLogoImpl();
        instance.setUrl(template.getUrl());
        return instance;
    }

    public ApplicationLogo copyDeep();

    /**
     * factory method to create a deep copy of ApplicationLogo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationLogo deepCopy(@Nullable final ApplicationLogo template) {
        if (template == null) {
            return null;
        }
        ApplicationLogoImpl instance = new ApplicationLogoImpl();
        instance.setUrl(template.getUrl());
        return instance;
    }

    /**
     * builder factory method for ApplicationLogo
     * @return builder
     */
    public static ApplicationLogoBuilder builder() {
        return ApplicationLogoBuilder.of();
    }

    /**
     * create builder for ApplicationLogo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationLogoBuilder builder(final ApplicationLogo template) {
        return ApplicationLogoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationLogo(Function<ApplicationLogo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ApplicationLogo> typeReference() {
        return new tools.jackson.core.type.TypeReference<ApplicationLogo>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationLogo>";
            }
        };
    }
}
