package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.ReviewStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewStateTransitionMessagePayloadBuilder {
   
   
   private Boolean newIncludedInStatistics;
   
   
   private com.commercetools.api.generated.models.state.StateReference oldState;
   
   
   private Boolean force;
   
   
   private Boolean oldIncludedInStatistics;
   
   
   private com.commercetools.api.generated.models.state.StateReference newState;
   
   
   private com.commercetools.api.generated.models.common.Reference target;
   
   public ReviewStateTransitionMessagePayloadBuilder newIncludedInStatistics( final Boolean newIncludedInStatistics) {
      this.newIncludedInStatistics = newIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder oldState( final com.commercetools.api.generated.models.state.StateReference oldState) {
      this.oldState = oldState;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder oldIncludedInStatistics( final Boolean oldIncludedInStatistics) {
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder newState( final com.commercetools.api.generated.models.state.StateReference newState) {
      this.newState = newState;
      return this;
   }
   
   public ReviewStateTransitionMessagePayloadBuilder target( final com.commercetools.api.generated.models.common.Reference target) {
      this.target = target;
      return this;
   }
   
   
   public Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getTarget(){
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