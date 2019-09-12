package com.commercetools.models.State;

import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateAddRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateAddRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.State.StateRoleEnum> roles;
   
   public StateAddRolesActionBuilder roles( final java.util.List<com.commercetools.models.State.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.State.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public StateAddRolesAction build() {
       return new StateAddRolesActionImpl(roles);
   }
   
   public static StateAddRolesActionBuilder of() {
      return new StateAddRolesActionBuilder();
   }
   
   public static StateAddRolesActionBuilder of(final StateAddRolesAction template) {
      StateAddRolesActionBuilder builder = new StateAddRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}