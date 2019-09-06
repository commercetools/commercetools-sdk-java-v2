package com.commercetools.models.Review;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Review.Review;
import com.commercetools.models.Review.ReviewReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewReferenceImpl.class)
public interface ReviewReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Review getObj();

   public void setObj(final Review obj);
   
   public static ReviewReferenceImpl of(){
      return new ReviewReferenceImpl();
   }
   

   public static ReviewReferenceImpl of(final ReviewReference template) {
      ReviewReferenceImpl instance = new ReviewReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}