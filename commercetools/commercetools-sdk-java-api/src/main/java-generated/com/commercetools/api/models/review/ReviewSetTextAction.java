package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTextActionImpl;

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
@JsonDeserialize(as = ReviewSetTextActionImpl.class)
public interface ReviewSetTextAction extends ReviewUpdateAction {

    /**
    *  <p>If <code>text</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
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

    default <T> T withReviewSetTextAction(Function<ReviewSetTextAction, T> helper) {
        return helper.apply(this);
    }
}
