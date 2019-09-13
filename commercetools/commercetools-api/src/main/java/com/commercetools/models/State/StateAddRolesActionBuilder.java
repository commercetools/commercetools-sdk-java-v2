package com.commercetools.models.state;

import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.state.StateAddRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateAddRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;
   
   public StateAddRolesActionBuilder roles( final java.util.List<com.commercetools.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
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