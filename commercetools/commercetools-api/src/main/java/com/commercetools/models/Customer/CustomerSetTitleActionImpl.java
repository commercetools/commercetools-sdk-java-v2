package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
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
public final class CustomerSetTitleActionImpl implements CustomerSetTitleAction {

   private String action;
   
   private String title;

   @JsonCreator
   CustomerSetTitleActionImpl(@JsonProperty("title") final String title) {
      this.title = title;
      this.action = "setTitle";
   }
   public CustomerSetTitleActionImpl() {
      
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