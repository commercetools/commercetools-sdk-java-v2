
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeReferenceImpl.class)
public interface TypeReference extends Reference {

    String TYPE = "type";

    @Valid
    @JsonProperty("obj")
    public Type getObj();

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
}
