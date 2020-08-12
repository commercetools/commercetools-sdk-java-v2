package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeTimeTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = AttributeTimeTypeImpl.class)
public interface AttributeTimeType extends AttributeType {


   
   public static AttributeTimeTypeImpl of(){
      return new AttributeTimeTypeImpl();
   }
   

   public static AttributeTimeTypeImpl of(final AttributeTimeType template) {
      AttributeTimeTypeImpl instance = new AttributeTimeTypeImpl();
      return instance;
   }

}
