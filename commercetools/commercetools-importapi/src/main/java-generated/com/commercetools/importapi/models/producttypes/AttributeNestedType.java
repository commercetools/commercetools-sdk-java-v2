package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeNestedTypeImpl;

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
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    /**
    *  <p>References a product type by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeKeyReference getTypeReference();

    public void setTypeReference(final ProductTypeKeyReference typeReference);

    public static AttributeNestedTypeImpl of(){
        return new AttributeNestedTypeImpl();
    }
    

    public static AttributeNestedTypeImpl of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
        return instance;
    }

}
