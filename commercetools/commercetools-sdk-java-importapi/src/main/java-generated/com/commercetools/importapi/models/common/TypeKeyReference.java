
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a type by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeKeyReferenceImpl.class)
public interface TypeKeyReference extends KeyReference {

    String TYPE = "type";

    public static TypeKeyReference of() {
        return new TypeKeyReferenceImpl();
    }

    public static TypeKeyReference of(final TypeKeyReference template) {
        TypeKeyReferenceImpl instance = new TypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TypeKeyReferenceBuilder builder() {
        return TypeKeyReferenceBuilder.of();
    }

    public static TypeKeyReferenceBuilder builder(final TypeKeyReference template) {
        return TypeKeyReferenceBuilder.of(template);
    }

    default <T> T withTypeKeyReference(Function<TypeKeyReference, T> helper) {
        return helper.apply(this);
    }
}
