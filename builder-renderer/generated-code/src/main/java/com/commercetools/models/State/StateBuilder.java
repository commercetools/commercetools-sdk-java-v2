package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateTypeEnum;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.State.State;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.Boolean initial;
   
   @Nullable
   private java.util.List<com.commercetools.models.State.StateRoleEnum> roles;
   
   
   private java.lang.Boolean builtIn;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.util.List<com.commercetools.models.State.StateReference> transitions;
   
   
   private com.commercetools.models.State.StateTypeEnum type;
   
   
   private java.lang.String key;
   
   public StateBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public StateBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public StateBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public StateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public StateBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public StateBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public StateBuilder initial( final java.lang.Boolean initial) {
      this.initial = initial;
      return this;
   }
   
   public StateBuilder roles(@Nullable final java.util.List<com.commercetools.models.State.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public StateBuilder builtIn( final java.lang.Boolean builtIn) {
      this.builtIn = builtIn;
      return this;
   }
   
   public StateBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StateBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public StateBuilder transitions(@Nullable final java.util.List<com.commercetools.models.State.StateReference> transitions) {
      this.transitions = transitions;
      return this;
   }
   
   public StateBuilder type( final com.commercetools.models.State.StateTypeEnum type) {
      this.type = type;
      return this;
   }
   
   public StateBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Boolean getInitial(){
      return this.initial;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.State.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public java.lang.Boolean getBuiltIn(){
      return this.builtIn;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.State.StateReference> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.models.State.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public State build() {
       return new StateImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, initial, roles, builtIn, name, description, transitions, type, key);
   }
   
   public static StateBuilder of() {
      return new StateBuilder();
   }
   
   public static StateBuilder of(final State template) {
      StateBuilder builder = new StateBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.initial = template.getInitial();
      builder.roles = template.getRoles();
      builder.builtIn = template.getBuiltIn();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.transitions = template.getTransitions();
      builder.type = template.getType();
      builder.key = template.getKey();
      return builder;
   }
   
}