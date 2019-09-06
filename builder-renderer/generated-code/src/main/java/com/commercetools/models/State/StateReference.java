package com.commercetools.models.State;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.State.State;
import com.commercetools.models.State.StateReferenceImpl;

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
@JsonDeserialize(as = StateReferenceImpl.class)
public interface StateReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public State getObj();

   public void setObj(final State obj);
   
   public static StateReferenceImpl of(){
      return new StateReferenceImpl();
   }
   

   public static StateReferenceImpl of(final StateReference template) {
      StateReferenceImpl instance = new StateReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}