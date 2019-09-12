package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Message.ReviewStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean newIncludedInStatistics;
   
   
   private com.commercetools.models.State.StateReference oldState;
   
   
   private java.lang.Boolean force;
   
   
   private java.lang.Boolean oldIncludedInStatistics;
   
   
   private com.commercetools.models.State.StateReference newState;
   
   
   private com.commercetools.models.Common.Reference target;
   
   public ReviewStateTransitionMessagePayloadBuilder newIncludedInStatistics( final java.lang.Boolean newIncludedInStatistics) {
      this.newIncludedInStatistics = newIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder oldState( final com.commercetools.models.State.StateReference oldState) {
      this.oldState = oldState;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder oldIncludedInStatistics( final java.lang.Boolean oldIncludedInStatistics) {
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder newState( final com.commercetools.models.State.StateReference newState) {
      this.newState = newState;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder target( final com.commercetools.models.Common.Reference target) {
      this.target = target;
      return this;
   }
   
   
   public java.lang.Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.models.State.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public java.lang.Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.models.State.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.models.Common.Reference getTarget(){
      return this.target;
   }

   public ReviewStateTransitionMessagePayload build() {
       return new ReviewStateTransitionMessagePayloadImpl(newIncludedInStatistics, oldState, force, oldIncludedInStatistics, newState, target);
   }
   
   public static ReviewStateTransitionMessagePayloadBuilder of() {
      return new ReviewStateTransitionMessagePayloadBuilder();
   }
   
   public static ReviewStateTransitionMessagePayloadBuilder of(final ReviewStateTransitionMessagePayload template) {
      ReviewStateTransitionMessagePayloadBuilder builder = new ReviewStateTransitionMessagePayloadBuilder();
      builder.newIncludedInStatistics = template.getNewIncludedInStatistics();
      builder.oldState = template.getOldState();
      builder.force = template.getForce();
      builder.oldIncludedInStatistics = template.getOldIncludedInStatistics();
      builder.newState = template.getNewState();
      builder.target = template.getTarget();
      return builder;
   }
   
}