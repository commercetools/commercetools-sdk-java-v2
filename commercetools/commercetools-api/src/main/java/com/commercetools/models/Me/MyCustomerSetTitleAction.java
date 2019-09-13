package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetTitleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = MyCustomerSetTitleActionImpl.class)
public interface MyCustomerSetTitleAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("title")
   public String getTitle();

   public void setTitle(final String title);
   
   public static MyCustomerSetTitleActionImpl of(){
      return new MyCustomerSetTitleActionImpl();
   }
   

   public static MyCustomerSetTitleActionImpl of(final MyCustomerSetTitleAction template) {
      MyCustomerSetTitleActionImpl instance = new MyCustomerSetTitleActionImpl();
      instance.setTitle(template.getTitle());
      return instance;
   }

}