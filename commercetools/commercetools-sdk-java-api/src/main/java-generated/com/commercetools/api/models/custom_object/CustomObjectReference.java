package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectReferenceImpl;

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
@JsonDeserialize(as = CustomObjectReferenceImpl.class)
public interface CustomObjectReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public CustomObject getObj();

    public void setObj(final CustomObject obj);

    public static CustomObjectReferenceImpl of(){
        return new CustomObjectReferenceImpl();
    }
    

    public static CustomObjectReferenceImpl of(final CustomObjectReference template) {
        CustomObjectReferenceImpl instance = new CustomObjectReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withCustomObjectReference(Function<CustomObjectReference, T> helper) {
        return helper.apply(this);
    }
}
