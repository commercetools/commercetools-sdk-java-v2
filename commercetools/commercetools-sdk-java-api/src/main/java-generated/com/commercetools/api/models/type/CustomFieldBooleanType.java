
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for Boolean values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldBooleanType customFieldBooleanType = CustomFieldBooleanType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldBooleanTypeImpl.class)
public interface CustomFieldBooleanType extends FieldType {

    String BOOLEAN = "Boolean";

    public static CustomFieldBooleanType of() {
        return new CustomFieldBooleanTypeImpl();
    }

    public static CustomFieldBooleanType of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeImpl instance = new CustomFieldBooleanTypeImpl();
        return instance;
    }

    public static CustomFieldBooleanTypeBuilder builder() {
        return CustomFieldBooleanTypeBuilder.of();
    }

    public static CustomFieldBooleanTypeBuilder builder(final CustomFieldBooleanType template) {
        return CustomFieldBooleanTypeBuilder.of(template);
    }

    default <T> T withCustomFieldBooleanType(Function<CustomFieldBooleanType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldBooleanType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldBooleanType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldBooleanType>";
            }
        };
    }
}
