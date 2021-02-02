
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    String NESTED = "nested";

    /**
    *  <p>References a product type by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeKeyReference getTypeReference();

    public void setTypeReference(final ProductTypeKeyReference typeReference);

    public static AttributeNestedType of() {
        return new AttributeNestedTypeImpl();
    }

    public static AttributeNestedType of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
        return instance;
    }

    public static AttributeNestedTypeBuilder builder() {
        return AttributeNestedTypeBuilder.of();
    }

    public static AttributeNestedTypeBuilder builder(final AttributeNestedType template) {
        return AttributeNestedTypeBuilder.of(template);
    }

    default <T> T withAttributeNestedType(Function<AttributeNestedType, T> helper) {
        return helper.apply(this);
    }
}
