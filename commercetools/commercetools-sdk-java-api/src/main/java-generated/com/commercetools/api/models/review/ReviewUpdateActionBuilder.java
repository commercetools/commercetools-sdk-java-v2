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
import com.commercetools.api.models.review.ReviewUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewUpdateActionBuilder {

    public com.commercetools.api.models.review.ReviewSetAuthorNameActionBuilder setAuthorNameBuilder() {
       return com.commercetools.api.models.review.ReviewSetAuthorNameActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.review.ReviewSetCustomerActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.review.ReviewSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.review.ReviewSetLocaleActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetRatingActionBuilder setRatingBuilder() {
       return com.commercetools.api.models.review.ReviewSetRatingActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetTargetActionBuilder setTargetBuilder() {
       return com.commercetools.api.models.review.ReviewSetTargetActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetTextActionBuilder setTextBuilder() {
       return com.commercetools.api.models.review.ReviewSetTextActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewSetTitleActionBuilder setTitleBuilder() {
       return com.commercetools.api.models.review.ReviewSetTitleActionBuilder.of();
    }
    public com.commercetools.api.models.review.ReviewTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.review.ReviewTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of ReviewUpdateActionBuilder
     * @return builder 
     */
    public static ReviewUpdateActionBuilder of() {
        return new ReviewUpdateActionBuilder();
    }

}
