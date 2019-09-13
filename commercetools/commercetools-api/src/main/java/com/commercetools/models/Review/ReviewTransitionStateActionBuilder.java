package com.commercetools.models.review;

import com.commercetools.models.review.ReviewUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.review.ReviewTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewTransitionStateActionBuilder {
   
   @Nullable
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   public ReviewTransitionStateActionBuilder force(@Nullable final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewTransitionStateActionBuilder state( final com.commercetools.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public ReviewTransitionStateAction build() {
       return new ReviewTransitionStateActionImpl(force, state);
   }
   
   public static ReviewTransitionStateActionBuilder of() {
      return new ReviewTransitionStateActionBuilder();
   }
   
   public static ReviewTransitionStateActionBuilder of(final ReviewTransitionStateAction template) {
      ReviewTransitionStateActionBuilder builder = new ReviewTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}