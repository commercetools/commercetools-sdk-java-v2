
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier {

    String TYPE = "type";

    public static TypeResourceIdentifier of() {
        return new TypeResourceIdentifierImpl();
    }

    public static TypeResourceIdentifier of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TypeResourceIdentifierBuilder builder() {
        return TypeResourceIdentifierBuilder.of();
    }

    public static TypeResourceIdentifierBuilder builder(final TypeResourceIdentifier template) {
        return TypeResourceIdentifierBuilder.of(template);
    }

    default <T> T withTypeResourceIdentifier(Function<TypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
