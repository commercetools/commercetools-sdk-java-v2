package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
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
public final class OrderEditSetCommentActionImpl implements OrderEditSetCommentAction {

   private java.lang.String action;
   
   private java.lang.String comment;

   @JsonCreator
   OrderEditSetCommentActionImpl(@JsonProperty("comment") final java.lang.String comment) {
      this.comment = comment;
      this.action = "setComment";
   }
   public OrderEditSetCommentActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getComment(){
      return this.comment;
   }

   public void setComment(final java.lang.String comment){
      this.comment = comment;
   }

}