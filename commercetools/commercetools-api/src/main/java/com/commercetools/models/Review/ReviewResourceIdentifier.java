package com.commercetools.models.review;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.review.ReviewResourceIdentifierImpl;

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
@JsonDeserialize(as = ReviewResourceIdentifierImpl.class)
public interface ReviewResourceIdentifier extends ResourceIdentifier {


   
   public static ReviewResourceIdentifierImpl of(){
      return new ReviewResourceIdentifierImpl();
   }
   

   public static ReviewResourceIdentifierImpl of(final ReviewResourceIdentifier template) {
      ReviewResourceIdentifierImpl instance = new ReviewResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}