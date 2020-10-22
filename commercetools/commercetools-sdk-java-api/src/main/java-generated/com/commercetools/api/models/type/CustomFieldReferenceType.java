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
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldReferenceTypeImpl.class)
public interface CustomFieldReferenceType extends FieldType {

    
    @NotNull
    @JsonProperty("referenceTypeId")
    public ReferenceTypeId getReferenceTypeId();

    public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);

    public static CustomFieldReferenceTypeImpl of(){
        return new CustomFieldReferenceTypeImpl();
    }
    

    public static CustomFieldReferenceTypeImpl of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    default <T extends Accessor<CustomFieldReferenceType>> T withCustomFieldReferenceType(Function<CustomFieldReferenceType, T> helper) {
        return helper.apply(this);
    }
}
