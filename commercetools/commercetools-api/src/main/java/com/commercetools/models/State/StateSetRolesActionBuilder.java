package com.commercetools.models.State;

import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateSetRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.State.StateRoleEnum> roles;
   
   public StateSetRolesActionBuilder roles( final java.util.List<com.commercetools.models.State.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.State.StateRoleEnum> getRoles(){
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