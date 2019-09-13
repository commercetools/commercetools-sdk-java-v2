package com.commercetools.models.state;

import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.state.StateRemoveRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateRemoveRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;
   
   public StateRemoveRolesActionBuilder roles( final java.util.List<com.commercetools.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public StateRemoveRolesAction build() {
       return new StateRemoveRolesActionImpl(roles);
   }
   
   public static StateRemoveRolesActionBuilder of() {
      return new StateRemoveRolesActionBuilder();
   }
   
   public static StateRemoveRolesActionBuilder of(final StateRemoveRolesAction template) {
      StateRemoveRolesActionBuilder builder = new StateRemoveRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}