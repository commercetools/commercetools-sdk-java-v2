package com.commercetools.models.state;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateTypeEnum;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.state.StateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateDraftBuilder {
   
   @Nullable
   private java.lang.Boolean initial;
   
   @Nullable
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions;
   
   
   private com.commercetools.models.state.StateTypeEnum type;
   
   
   private java.lang.String key;
   
   public StateDraftBuilder initial(@Nullable final java.lang.Boolean initial) {
      this.initial = initial;
      return this;
   }
   
   public StateDraftBuilder roles(@Nullable final java.util.List<com.commercetools.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public StateDraftBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StateDraftBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public StateDraftBuilder transitions(@Nullable final java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions) {
      this.transitions = transitions;
      return this;
   }
   
   public StateDraftBuilder type( final com.commercetools.models.state.StateTypeEnum type) {
      this.type = type;
      return this;
   }
   
   public StateDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getInitial(){
      return this.initial;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.state.StateResourceIdentifier> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.models.state.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public StateDraft build() {
       return new StateDraftImpl(initial, roles, name, description, transitions, type, key);
   }
   
   public static StateDraftBuilder of() {
      return new StateDraftBuilder();
   }
   
   public static StateDraftBuilder of(final StateDraft template) {
      StateDraftBuilder builder = new StateDraftBuilder();
      builder.initial = template.getInitial();
      builder.roles = template.getRoles();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.transitions = template.getTransitions();
      builder.type = template.getType();
      builder.key = template.getKey();
      return builder;
   }
   
}