package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.TypeKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>References a type by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeKeyReferenceImpl.class)
public interface TypeKeyReference extends KeyReference {



    public static TypeKeyReferenceImpl of(){
        return new TypeKeyReferenceImpl();
    }
    

    public static TypeKeyReferenceImpl of(final TypeKeyReference template) {
        TypeKeyReferenceImpl instance = new TypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withTypeKeyReference(Function<TypeKeyReference, T> helper) {
        return helper.apply(this);
    }
}
