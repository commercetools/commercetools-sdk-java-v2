package com.commercetools.models.review;

import com.commercetools.models.review.ReviewSetAuthorNameAction;
import com.commercetools.models.review.ReviewSetCustomFieldAction;
import com.commercetools.models.review.ReviewSetCustomTypeAction;
import com.commercetools.models.review.ReviewSetCustomerAction;
import com.commercetools.models.review.ReviewSetKeyAction;
import com.commercetools.models.review.ReviewSetLocaleAction;
import com.commercetools.models.review.ReviewSetRatingAction;
import com.commercetools.models.review.ReviewSetTargetAction;
import com.commercetools.models.review.ReviewSetTextAction;
import com.commercetools.models.review.ReviewSetTitleAction;
import com.commercetools.models.review.ReviewTransitionStateAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetAuthorNameActionImpl.class, name = "setAuthorName"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetRatingActionImpl.class, name = "setRating"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetTargetActionImpl.class, name = "setTarget"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetTextActionImpl.class, name = "setText"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.review.ReviewTransitionStateActionImpl.class, name = "transitionState")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ReviewUpdateAction  {


   


}