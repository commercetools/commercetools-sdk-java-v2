package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetExternalIdActionImpl;

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
@JsonDeserialize(as = CategorySetExternalIdActionImpl.class)
public interface CategorySetExternalIdAction extends CategoryUpdateAction {

   /**
   *  <p>If not defined, the external ID is unset.</p>
   */

   @JsonProperty("externalId")
   public String getExternalId();

   public void setExternalId(final String externalId);

   public static CategorySetExternalIdActionImpl of(){
      return new CategorySetExternalIdActionImpl();
   }


   public static CategorySetExternalIdActionImpl of(final CategorySetExternalIdAction template) {
      CategorySetExternalIdActionImpl instance = new CategorySetExternalIdActionImpl();
      instance.setExternalId(template.getExternalId());
      return instance;
   }

}
