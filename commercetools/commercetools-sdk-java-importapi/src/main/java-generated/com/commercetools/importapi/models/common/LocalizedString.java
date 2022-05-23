
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
 <pre><code>{
   "de": "Hundefutter",
   "en": "dog food"
 }
 </code></pre>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   LocalizedString localizedString = LocalizedString.builder()
           ./^[a-z]{2}(-[A-Z]{2})?$/("{/^[a-z]{2}(-[A-Z]{2})?$/}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString {

    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static LocalizedString of() {
        return new LocalizedStringImpl();
    }

    public static LocalizedString of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        return instance;
    }

    public static LocalizedStringBuilder builder() {
        return LocalizedStringBuilder.of();
    }

    public static LocalizedStringBuilder builder(final LocalizedString template) {
        return LocalizedStringBuilder.of(template);
    }

    default <T> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedString> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedString>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedString>";
            }
        };
    }
}
