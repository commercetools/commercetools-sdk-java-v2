package com.commercetools.models.common;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.store.StoreKeyReference;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.store.StoreKeyReferenceImpl.class, name = "store")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface KeyReference  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   


}