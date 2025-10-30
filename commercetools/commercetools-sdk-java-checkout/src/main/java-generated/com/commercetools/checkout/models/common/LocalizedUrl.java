
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A localized URL that provides different URL values for different locales.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedUrl localizedUrl = LocalizedUrl.builder()
 *             ./^https?:\/\/[^\s/$.?#].[^\s]*$/("{/^https?:\/\/[^\s/$.?#].[^\s]*$/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedUrlImpl.class)
public interface LocalizedUrl {

    /**
     *  <p>URL for the specific <span>locale</span>.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    /**
     *  <p>URL for the specific <span>locale</span>.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, String value);

    /**
     * factory method
     * @return instance of LocalizedUrl
     */
    public static LocalizedUrl of() {
        return new LocalizedUrlImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedUrl
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedUrl of(final LocalizedUrl template) {
        LocalizedUrlImpl instance = new LocalizedUrlImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public LocalizedUrl copyDeep();

    /**
     * factory method to create a deep copy of LocalizedUrl
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedUrl deepCopy(@Nullable final LocalizedUrl template) {
        if (template == null) {
            return null;
        }
        LocalizedUrlImpl instance = new LocalizedUrlImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for LocalizedUrl
     * @return builder
     */
    public static LocalizedUrlBuilder builder() {
        return LocalizedUrlBuilder.of();
    }

    /**
     * create builder for LocalizedUrl instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedUrlBuilder builder(final LocalizedUrl template) {
        return LocalizedUrlBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedUrl(Function<LocalizedUrl, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedUrl> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedUrl>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedUrl>";
            }
        };
    }
}
