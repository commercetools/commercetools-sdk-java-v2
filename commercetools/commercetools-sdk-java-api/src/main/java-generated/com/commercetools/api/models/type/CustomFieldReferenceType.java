package com.commercetools.api.models.type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldReferenceTypeImpl;

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
@JsonDeserialize(as = CustomFieldReferenceTypeImpl.class)
public interface CustomFieldReferenceType extends FieldType {

    String REFERENCE = "Reference";

    
    @NotNull
    @JsonProperty("referenceTypeId")
    public ReferenceTypeId getReferenceTypeId();

    
    public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);
    

    public static CustomFieldReferenceType of(){
        return new CustomFieldReferenceTypeImpl();
    }
    

    public static CustomFieldReferenceType of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    public static CustomFieldReferenceTypeBuilder builder(){
        return CustomFieldReferenceTypeBuilder.of();
    }
    
    public static CustomFieldReferenceTypeBuilder builder(final CustomFieldReferenceType template){
        return CustomFieldReferenceTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldReferenceType(Function<CustomFieldReferenceType, T> helper) {
        return helper.apply(this);
    }
}
