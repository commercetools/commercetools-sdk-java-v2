package com.commercetools.importapi.models.common;


import com.commercetools.importapi.models.common.LocalizedStringImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
 *  <pre><code>{
 *    "de": "Hundefutter",
 *    "en": "dog food"
 *  }
 *  </code></pre>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedString localizedString = LocalizedString.builder()
 *             ./^[a-z]{2}(-[A-Z]{2})?$/("{/^[a-z]{2}(-[A-Z]{2})?$/}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString  {


    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */
    
    @JsonAnySetter
    public void setValue(String key, String value);

    /**
     * factory method
     * @return instance of LocalizedString
     */
    public static LocalizedString of(){
        return new LocalizedStringImpl();
    }
    

    /**
     * factory method to create a shallow copy LocalizedString
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedString of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizedString
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedString deepCopy(@Nullable final LocalizedString template) {
        if (template == null) {
            return null;
        }
        LocalizedStringImpl instance = new LocalizedStringImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for LocalizedString
     * @return builder
     */
    public static LocalizedStringBuilder builder() {
        return LocalizedStringBuilder.of();
    }
    
    /**
     * create builder for LocalizedString instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedStringBuilder builder(final LocalizedString template) {
        return LocalizedStringBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedString> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedString>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedString>";
            }
        };
    }
}
