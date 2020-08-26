package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeReferenceTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeReferenceTypeImpl.class)
public interface AttributeReferenceType extends AttributeType {

    /**
    *  <p>The type of the referenced resource.</p>
    */
    @NotNull
    @JsonProperty("referenceTypeId")
    public ReferenceType getReferenceTypeId();

    public void setReferenceTypeId(final ReferenceType referenceTypeId);

    public static AttributeReferenceTypeImpl of(){
        return new AttributeReferenceTypeImpl();
    }


    public static AttributeReferenceTypeImpl of(final AttributeReferenceType template) {
        AttributeReferenceTypeImpl instance = new AttributeReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

}
