
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for Reference values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldReferenceType customFieldReferenceType = CustomFieldReferenceType.builder()
 *             .referenceTypeId(CustomFieldReferenceValue.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldReferenceTypeImpl.class)
public interface CustomFieldReferenceType extends FieldType {

    String REFERENCE = "Reference";

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @return referenceTypeId
     */
    @NotNull
    @JsonProperty("referenceTypeId")
    public CustomFieldReferenceValue getReferenceTypeId();

    public void setReferenceTypeId(final CustomFieldReferenceValue referenceTypeId);

    public static CustomFieldReferenceType of() {
        return new CustomFieldReferenceTypeImpl();
    }

    public static CustomFieldReferenceType of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    public static CustomFieldReferenceTypeBuilder builder() {
        return CustomFieldReferenceTypeBuilder.of();
    }

    public static CustomFieldReferenceTypeBuilder builder(final CustomFieldReferenceType template) {
        return CustomFieldReferenceTypeBuilder.of(template);
    }

    default <T> T withCustomFieldReferenceType(Function<CustomFieldReferenceType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldReferenceType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldReferenceType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldReferenceType>";
            }
        };
    }
}
