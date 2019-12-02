package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateTypeEnum;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.state.StateImpl;

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
@JsonDeserialize(as = StateImpl.class)
public interface State extends LoggedResource {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>A unique identifier for the state.</p>
   */
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("type")
   public StateTypeEnum getType();
   /**
   *  <p>A human-readable name of the state.</p>
   */
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>A human-readable description of the state.</p>
   */
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>A state can be declared as an initial state for any state machine.
   *  When a workflow starts, this first state must be an <code>initial</code> state.</p>
   */
   @NotNull
   @JsonProperty("initial")
   public Boolean getInitial();
   /**
   *  <p>Builtin states are integral parts of the project that cannot be deleted nor the key can be changed.</p>
   */
   @NotNull
   @JsonProperty("builtIn")
   public Boolean getBuiltIn();
   
   
   @JsonProperty("roles")
   public List<StateRoleEnum> getRoles();
   /**
   *  <p>Transitions are a way to describe possible transformations of the current state to other states of the same <code>type</code> (e.g.: <em>Initial</em> -&gt; <em>Shipped</em>).
   *  When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced state must have a transition to the new state.
   *  If <code>transitions</code> is an empty list, it means the current state is a final state and no further transitions are allowed.
   *  If <code>transitions</code> is not set, the validation is turned off.
   *  When performing a <code>transitionState</code> update action, any other state of the same <code>type</code> can be transitioned to.</p>
   */
   @Valid
   @JsonProperty("transitions")
   public List<StateReference> getTransitions();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
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
      instance.setDescription(template.getDescription());
      instance.setTransitions(template.getTransitions());
      instance.setType(template.getType());
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}