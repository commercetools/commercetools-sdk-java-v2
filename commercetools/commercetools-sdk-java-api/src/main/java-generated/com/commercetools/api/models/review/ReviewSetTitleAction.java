package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTitleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetTitleActionImpl.class)
public interface ReviewSetTitleAction extends ReviewUpdateAction {

    /**
    *  <p>If <code>title</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("title")
    public String getTitle();

    public void setTitle(final String title);

    public static ReviewSetTitleActionImpl of(){
        return new ReviewSetTitleActionImpl();
    }
    

    public static ReviewSetTitleActionImpl of(final ReviewSetTitleAction template) {
        ReviewSetTitleActionImpl instance = new ReviewSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    default <T extends Accessor<ReviewSetTitleAction>> T withReviewSetTitleAction(Function<ReviewSetTitleAction, T> helper) {
        return helper.apply(this);
    }
}
