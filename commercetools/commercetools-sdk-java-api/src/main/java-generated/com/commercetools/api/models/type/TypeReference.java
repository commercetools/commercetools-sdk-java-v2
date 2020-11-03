package com.commercetools.api.models.type;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.type.TypeReferenceImpl;

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
@JsonDeserialize(as = TypeReferenceImpl.class)
public interface TypeReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Type getObj();

    public void setObj(final Type obj);

    public static TypeReferenceImpl of(){
        return new TypeReferenceImpl();
    }
    

    public static TypeReferenceImpl of(final TypeReference template) {
        TypeReferenceImpl instance = new TypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withTypeReference(Function<TypeReference, T> helper) {
        return helper.apply(this);
    }
}
