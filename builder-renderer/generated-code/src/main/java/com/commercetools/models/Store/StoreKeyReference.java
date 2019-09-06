package com.commercetools.models.Store;

import com.commercetools.models.Common.KeyReference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Store.StoreKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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