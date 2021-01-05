package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.CategoryReference;
import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.common.ProductTypeReference;
import com.commercetools.ml.models.common.ReferenceTypeId;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.ml.models.common.CategoryReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.ml.models.common.ProductTypeReferenceImpl.class, name = "product-type")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "typeId",
    defaultImpl = ReferenceImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Reference  {

    
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();
    
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);




    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }
}
