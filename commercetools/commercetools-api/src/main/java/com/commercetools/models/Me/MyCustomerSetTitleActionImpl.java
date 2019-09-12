package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetTitleActionImpl implements MyCustomerSetTitleAction {

   private java.lang.String action;
   
   private java.lang.String title;

   @JsonCreator
   MyCustomerSetTitleActionImpl(@JsonProperty("title") final java.lang.String title) {
      this.title = title;
      this.action = "setTitle";
   }
   public MyCustomerSetTitleActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getTitle(){
      return this.title;
   }

   public void setTitle(final java.lang.String title){
      this.title = title;
   }

}