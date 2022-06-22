
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>AttributeType that defines a set (without duplicate elements) with values of the given <code>elementType</code>. It does not support <code>isRequired</code>. Since this type itself is an AttributeType, it is possible to construct an AttributeSetType of an AttributeSetType of any AttributeType, and to continue with this iteration until terminating with any non-AttributeSetType. In case the AttributeSetType iteration terminates with an AttributeNestedType, the iteration can have 5 steps at maximum.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeSetType attributeSetType = AttributeSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeSetTypeImpl.class)
public interface AttributeSetType extends AttributeType {

    String SET = "set";

    /**
     *  <p>Attribute type of the elements in the set.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public AttributeType getElementType();

    public void setElementType(final AttributeType elementType);

    public static AttributeSetType of() {
        return new AttributeSetTypeImpl();
    }

    public static AttributeSetType of(final AttributeSetType template) {
        AttributeSetTypeImpl instance = new AttributeSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public static AttributeSetTypeBuilder builder() {
        return AttributeSetTypeBuilder.of();
    }

    public static AttributeSetTypeBuilder builder(final AttributeSetType template) {
        return AttributeSetTypeBuilder.of(template);
    }

    default <T> T withAttributeSetType(Function<AttributeSetType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeSetType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeSetType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeSetType>";
            }
        };
    }
}
