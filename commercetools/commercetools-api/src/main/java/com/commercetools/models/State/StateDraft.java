package com.commercetools.models.state;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateTypeEnum;
import com.commercetools.models.state.StateDraftImpl;

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
@JsonDeserialize(as = StateDraftImpl.class)
public interface StateDraft  {

   
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
   
   
   @JsonProperty("initial")
   public Boolean getInitial();
   
   
   @JsonProperty("roles")
   public List<StateRoleEnum> getRoles();
   
   @Valid
   @JsonProperty("transitions")
   public List<StateResourceIdentifier> getTransitions();

   public void setKey(final String key);
   
   public void setType(final StateTypeEnum type);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setInitial(final Boolean initial);
   
   public void setRoles(final List<StateRoleEnum> roles);
   
   public void setTransitions(final List<StateResourceIdentifier> transitions);
   
   public static StateDraftImpl of(){
      return new StateDraftImpl();
   }
   

   public static StateDraftImpl of(final StateDraft template) {
      StateDraftImpl instance = new StateDraftImpl();
      instance.setInitial(template.getInitial());
      instance.setRoles(template.getRoles());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setTransitions(template.getTransitions());
      instance.setType(template.getType());
      instance.setKey(template.getKey());
      return instance;
   }

}