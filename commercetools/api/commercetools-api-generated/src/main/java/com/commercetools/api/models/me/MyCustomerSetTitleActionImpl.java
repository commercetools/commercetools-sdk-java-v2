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
public final class MyCustomerSetTitleActionImpl implements MyCustomerSetTitleAction {

   private String action;

   private String title;

   @JsonCreator
   MyCustomerSetTitleActionImpl(@JsonProperty("title") final String title) {
      this.title = title;
      this.action = "setTitle";
   }
   public MyCustomerSetTitleActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getTitle(){
      return this.title;
   }

   public void setTitle(final String title){
      this.title = title;
   }

}
