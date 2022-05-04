
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Type">Type</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeReferenceImpl.class)
public interface TypeReference extends Reference, com.commercetools.api.models.Identifiable<Type> {

    String TYPE = "type";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Type">Type</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Contains the representation of the expanded Type.
    *  Only present in responses to requests with <a href="ctp:api:type:Expansion">Reference Expansion</a> for Types.</p>
    */
    @Valid
    @JsonProperty("obj")
    public Type getObj();

    public void setId(final String id);

    public void setObj(final Type obj);

    public static TypeReference of() {
        return new TypeReferenceImpl();
    }

    public static TypeReference of(final TypeReference template) {
        TypeReferenceImpl instance = new TypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static TypeReferenceBuilder builder() {
        return TypeReferenceBuilder.of();
    }

    public static TypeReferenceBuilder builder(final TypeReference template) {
        return TypeReferenceBuilder.of(template);
    }

    default <T> T withTypeReference(Function<TypeReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeReference>() {
            @Override
            public String toString() {
                return "TypeReference<TypeReference>";
            }
        };
    }
}
