package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewSetAuthorNameAction;
import com.commercetools.api.models.review.ReviewSetCustomFieldAction;
import com.commercetools.api.models.review.ReviewSetCustomTypeAction;
import com.commercetools.api.models.review.ReviewSetCustomerAction;
import com.commercetools.api.models.review.ReviewSetKeyAction;
import com.commercetools.api.models.review.ReviewSetLocaleAction;
import com.commercetools.api.models.review.ReviewSetRatingAction;
import com.commercetools.api.models.review.ReviewSetTargetAction;
import com.commercetools.api.models.review.ReviewSetTextAction;
import com.commercetools.api.models.review.ReviewSetTitleAction;
import com.commercetools.api.models.review.ReviewTransitionStateAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetAuthorNameActionImpl.class, name = "setAuthorName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomerActionImpl.class, name = "setCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetRatingActionImpl.class, name = "setRating"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTargetActionImpl.class, name = "setTarget"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTextActionImpl.class, name = "setText"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTitleActionImpl.class, name = "setTitle"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewTransitionStateActionImpl.class, name = "transitionState")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = ReviewUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ReviewUpdateAction  {





}
