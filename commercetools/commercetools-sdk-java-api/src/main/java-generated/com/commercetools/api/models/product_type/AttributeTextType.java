
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for plain text values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTextType attributeTextType = AttributeTextType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeTextTypeImpl.class)
public interface AttributeTextType extends AttributeType {

    String TEXT = "text";

    public static AttributeTextType of() {
        return new AttributeTextTypeImpl();
    }

    public static AttributeTextType of(final AttributeTextType template) {
        AttributeTextTypeImpl instance = new AttributeTextTypeImpl();
        return instance;
    }

    public static AttributeTextTypeBuilder builder() {
        return AttributeTextTypeBuilder.of();
    }

    public static AttributeTextTypeBuilder builder(final AttributeTextType template) {
        return AttributeTextTypeBuilder.of(template);
    }

    default <T> T withAttributeTextType(Function<AttributeTextType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeTextType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeTextType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeTextType>";
            }
        };
    }
}
