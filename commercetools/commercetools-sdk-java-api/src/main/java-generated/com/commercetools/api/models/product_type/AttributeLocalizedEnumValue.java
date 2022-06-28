
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for localized enum values. Useful for predefined language-specific values selectable in drop-down menus if only one value can be selected. Use AttributeSetType of AttributeLocalizedEnumValue instead if multiple values can be selected.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumValue attributeLocalizedEnumValue = AttributeLocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizedEnumValueImpl.class)
public interface AttributeLocalizedEnumValue {

    /**
     *  <p>Key of the value used as a programmatic identifier, for example in facets &amp; filters.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Descriptive, localized label of the value.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);

    public void setLabel(final LocalizedString label);

    public static AttributeLocalizedEnumValue of() {
        return new AttributeLocalizedEnumValueImpl();
    }

    public static AttributeLocalizedEnumValue of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueImpl instance = new AttributeLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static AttributeLocalizedEnumValueBuilder builder() {
        return AttributeLocalizedEnumValueBuilder.of();
    }

    public static AttributeLocalizedEnumValueBuilder builder(final AttributeLocalizedEnumValue template) {
        return AttributeLocalizedEnumValueBuilder.of(template);
    }

    default <T> T withAttributeLocalizedEnumValue(Function<AttributeLocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeLocalizedEnumValue>";
            }
        };
    }
}
