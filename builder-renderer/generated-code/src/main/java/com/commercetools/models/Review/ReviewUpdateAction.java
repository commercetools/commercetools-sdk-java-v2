package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewSetAuthorNameAction;
import com.commercetools.models.Review.ReviewSetCustomFieldAction;
import com.commercetools.models.Review.ReviewSetCustomTypeAction;
import com.commercetools.models.Review.ReviewSetCustomerAction;
import com.commercetools.models.Review.ReviewSetKeyAction;
import com.commercetools.models.Review.ReviewSetLocaleAction;
import com.commercetools.models.Review.ReviewSetRatingAction;
import com.commercetools.models.Review.ReviewSetTargetAction;
import com.commercetools.models.Review.ReviewSetTextAction;
import com.commercetools.models.Review.ReviewSetTitleAction;
import com.commercetools.models.Review.ReviewTransitionStateAction;
import java.lang.String;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetAuthorNameActionImpl.class, name = "setAuthorName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetRatingActionImpl.class, name = "setRating"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetTargetActionImpl.class, name = "setTarget"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetTextActionImpl.class, name = "setText"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.Review.ReviewTransitionStateActionImpl.class, name = "transitionState")
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