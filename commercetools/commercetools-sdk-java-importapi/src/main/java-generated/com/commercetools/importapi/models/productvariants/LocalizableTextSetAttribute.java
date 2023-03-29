
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents an attribute whose value is a localized text.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextSetAttribute localizableTextSetAttribute = LocalizableTextSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizableTextSetAttributeImpl.class)
public interface LocalizableTextSetAttribute extends Attribute {

    /**
     * discriminator value for LocalizableTextSetAttribute
     */
    String LTEXT_SET = "ltext-set";

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalizedString... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<LocalizedString> value);

    /**
     * factory method
     * @return instance of LocalizableTextSetAttribute
     */
    public static LocalizableTextSetAttribute of() {
        return new LocalizableTextSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy LocalizableTextSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizableTextSetAttribute of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeImpl instance = new LocalizableTextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizableTextSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizableTextSetAttribute deepCopy(@Nullable final LocalizableTextSetAttribute template) {
        if (template == null) {
            return null;
        }
        LocalizableTextSetAttributeImpl instance = new LocalizableTextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LocalizableTextSetAttribute
     * @return builder
     */
    public static LocalizableTextSetAttributeBuilder builder() {
        return LocalizableTextSetAttributeBuilder.of();
    }

    /**
     * create builder for LocalizableTextSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableTextSetAttributeBuilder builder(final LocalizableTextSetAttribute template) {
        return LocalizableTextSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizableTextSetAttribute(Function<LocalizableTextSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableTextSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableTextSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableTextSetAttribute>";
            }
        };
    }
}
