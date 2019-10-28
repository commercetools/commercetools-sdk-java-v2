package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.KeyReference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.store.StoreKeyReferenceImpl;

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
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {


   
   public static StoreKeyReferenceImpl of(){
      return new StoreKeyReferenceImpl();
   }
   

   public static StoreKeyReferenceImpl of(final StoreKeyReference template) {
      StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}