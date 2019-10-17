package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateTypeEnum;
import com.commercetools.api.generated.models.state.StateImpl;

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
@JsonDeserialize(as = StateImpl.class)
public interface State extends LoggedResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("type")
   public StateTypeEnum getType();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @JsonProperty("initial")
   public Boolean getInitial();
   
   @NotNull
   @JsonProperty("builtIn")
   public Boolean getBuiltIn();
   
   
   @JsonProperty("roles")
   public List<StateRoleEnum> getRoles();
   
   @Valid
   @JsonProperty("transitions")
   public List<StateReference> getTransitions();

   public void setKey(final String key);
   
   public void setType(final StateTypeEnum type);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setInitial(final Boolean initial);
   
   public void setBuiltIn(final Boolean builtIn);
   
   public void setRoles(final List<StateRoleEnum> roles);
   
   public void setTransitions(final List<StateReference> transitions);
   
   public static StateImpl of(){
      return new StateImpl();
   }
   

   public static StateImpl of(final State template) {
      StateImpl instance = new StateImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setInitial(template.getInitial());
      instance.setRoles(template.getRoles());
      instance.setBuiltIn(template.getBuiltIn());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setTransitions(template.getTransitions());
      instance.setType(template.getType());
      instance.setKey(template.getKey());
      return instance;
   }

}