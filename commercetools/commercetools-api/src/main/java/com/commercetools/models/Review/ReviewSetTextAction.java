package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetTextActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetTextActionImpl.class)
public interface ReviewSetTextAction extends ReviewUpdateAction {

   
   
   @JsonProperty("text")
   public String getText();

   public void setText(final String text);
   
   public static ReviewSetTextActionImpl of(){
      return new ReviewSetTextActionImpl();
   }
   

   public static ReviewSetTextActionImpl of(final ReviewSetTextAction template) {
      ReviewSetTextActionImpl instance = new ReviewSetTextActionImpl();
      instance.setText(template.getText());
      return instance;
   }

}