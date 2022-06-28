
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Attribute type for Boolean values. Valid values for the Attribute are <code>true</code> and <code>false</code> (JSON Boolean).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeBooleanType attributeBooleanType = AttributeBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeBooleanTypeImpl.class)
public interface AttributeBooleanType extends AttributeType {

    String BOOLEAN = "boolean";

    public static AttributeBooleanType of() {
        return new AttributeBooleanTypeImpl();
    }

    public static AttributeBooleanType of(final AttributeBooleanType template) {
        AttributeBooleanTypeImpl instance = new AttributeBooleanTypeImpl();
        return instance;
    }

    public static AttributeBooleanTypeBuilder builder() {
        return AttributeBooleanTypeBuilder.of();
    }

    public static AttributeBooleanTypeBuilder builder(final AttributeBooleanType template) {
        return AttributeBooleanTypeBuilder.of(template);
    }

    default <T> T withAttributeBooleanType(Function<AttributeBooleanType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeBooleanType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeBooleanType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeBooleanType>";
            }
        };
    }
}
