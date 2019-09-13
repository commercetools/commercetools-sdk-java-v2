package com.commercetools.models.me;

import com.commercetools.models.me.MyPaymentUpdateAction;
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
public final class MyPaymentSetMethodInfoInterfaceActionImpl implements MyPaymentSetMethodInfoInterfaceAction {

   private java.lang.String action;
   
   private java.lang.String _interface;

   @JsonCreator
   MyPaymentSetMethodInfoInterfaceActionImpl(@JsonProperty("interface") final java.lang.String _interface) {
      this._interface = _interface;
      this.action = "setMethodInfoInterface";
   }
   public MyPaymentSetMethodInfoInterfaceActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   public java.lang.String getInterface() {
      return this._interface;
   }

   public void setInterface(final java.lang.String _interface) {
      this._interface = _interface;
   }

}