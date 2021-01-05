package com.commercetools.api.models.review;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewResourceIdentifierImpl.class)
public interface ReviewResourceIdentifier extends ResourceIdentifier {



    public static ReviewResourceIdentifier of(){
        return new ReviewResourceIdentifierImpl();
    }
    

    public static ReviewResourceIdentifier of(final ReviewResourceIdentifier template) {
        ReviewResourceIdentifierImpl instance = new ReviewResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReviewResourceIdentifierBuilder builder(){
        return ReviewResourceIdentifierBuilder.of();
    }
    
    public static ReviewResourceIdentifierBuilder builder(final ReviewResourceIdentifier template){
        return ReviewResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withReviewResourceIdentifier(Function<ReviewResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
