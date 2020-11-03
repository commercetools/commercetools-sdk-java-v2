package com.commercetools.api.models.type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier {



    public static TypeResourceIdentifierImpl of(){
        return new TypeResourceIdentifierImpl();
    }
    

    public static TypeResourceIdentifierImpl of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withTypeResourceIdentifier(Function<TypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
