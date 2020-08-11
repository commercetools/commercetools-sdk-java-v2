package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetMiddleNameActionImpl implements CustomerSetMiddleNameAction {

   private String action;

   private String middleName;

   @JsonCreator
   CustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final String middleName) {
      this.middleName = middleName;
      this.action = "setMiddleName";
   }
   public CustomerSetMiddleNameActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getMiddleName(){
      return this.middleName;
   }

   public void setMiddleName(final String middleName){
      this.middleName = middleName;
   }

}
