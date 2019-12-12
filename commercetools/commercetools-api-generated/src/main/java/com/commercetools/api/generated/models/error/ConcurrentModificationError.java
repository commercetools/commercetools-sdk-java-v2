package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ConcurrentModificationErrorImpl;

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
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

   
   
   @JsonProperty("currentVersion")
   public Long getCurrentVersion();

   public void setCurrentVersion(final Long currentVersion);
   
   public static ConcurrentModificationErrorImpl of(){
      return new ConcurrentModificationErrorImpl();
   }
   

   public static ConcurrentModificationErrorImpl of(final ConcurrentModificationError template) {
      ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setCurrentVersion(template.getCurrentVersion());
      return instance;
   }

}