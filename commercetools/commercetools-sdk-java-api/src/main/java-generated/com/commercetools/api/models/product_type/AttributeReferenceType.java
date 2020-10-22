package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeReferenceTypeImpl;

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
@JsonDeserialize(as = AttributeReferenceTypeImpl.class)
public interface AttributeReferenceType extends AttributeType {

    
    @NotNull
    @JsonProperty("referenceTypeId")
    public ReferenceTypeId getReferenceTypeId();

    public void setReferenceTypeId(final ReferenceTypeId referenceTypeId);

    public static AttributeReferenceTypeImpl of(){
        return new AttributeReferenceTypeImpl();
    }
    

    public static AttributeReferenceTypeImpl of(final AttributeReferenceType template) {
        AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    default <T extends Accessor<AttributeReferenceType>> T withAttributeReferenceType(Function<AttributeReferenceType, T> helper) {
        return helper.apply(this);
    }
}
