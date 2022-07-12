
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for LocalizedString values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizableTextType attributeLocalizableTextType = AttributeLocalizableTextType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {

    String LTEXT = "ltext";

    public static AttributeLocalizableTextType of() {
        return new AttributeLocalizableTextTypeImpl();
    }

    public static AttributeLocalizableTextType of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

    public static AttributeLocalizableTextTypeBuilder builder() {
        return AttributeLocalizableTextTypeBuilder.of();
    }

    public static AttributeLocalizableTextTypeBuilder builder(final AttributeLocalizableTextType template) {
        return AttributeLocalizableTextTypeBuilder.of(template);
    }

    default <T> T withAttributeLocalizableTextType(Function<AttributeLocalizableTextType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizableTextType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizableTextType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeLocalizableTextType>";
            }
        };
    }
}
