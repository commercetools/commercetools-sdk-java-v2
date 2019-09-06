package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Review.ReviewTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewTransitionStateActionBuilder {
   
   @Nullable
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   public ReviewTransitionStateActionBuilder force(@Nullable final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewTransitionStateActionBuilder state( final com.commercetools.models.State.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getState(){
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