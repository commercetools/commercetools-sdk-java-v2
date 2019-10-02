package com.commercetools.models.state;

import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateUpdateAction;
import com.commercetools.models.state.StateSetRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;
   
   public StateSetRolesActionBuilder roles( final java.util.List<com.commercetools.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public StateSetRolesAction build() {
       return new StateSetRolesActionImpl(roles);
   }
   
   public static StateSetRolesActionBuilder of() {
      return new StateSetRolesActionBuilder();
   }
   
   public static StateSetRolesActionBuilder of(final StateSetRolesAction template) {
      StateSetRolesActionBuilder builder = new StateSetRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}