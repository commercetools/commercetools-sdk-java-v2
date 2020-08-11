package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.StoreKeyReference;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreKeyReferenceImpl.class, name = "store")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId",
   defaultImpl = KeyReferenceImpl.class
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
