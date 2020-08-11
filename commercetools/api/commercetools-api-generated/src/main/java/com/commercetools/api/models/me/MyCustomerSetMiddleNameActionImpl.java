package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetMiddleNameActionImpl implements MyCustomerSetMiddleNameAction {

   private String action;

   private String middleName;

   @JsonCreator
   MyCustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final String middleName) {
      this.middleName = middleName;
      this.action = "setMiddleName";
   }
   public MyCustomerSetMiddleNameActionImpl() {

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
