package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.review.ReviewTransitionStateActionImpl;

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
@JsonDeserialize(as = ReviewTransitionStateActionImpl.class)
public interface ReviewTransitionStateAction extends ReviewUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();
    
    
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);
    
    public void setForce(final Boolean force);

    public static ReviewTransitionStateActionImpl of(){
        return new ReviewTransitionStateActionImpl();
    }
    

    public static ReviewTransitionStateActionImpl of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionImpl instance = new ReviewTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    default <T extends Accessor<ReviewTransitionStateAction>> T withReviewTransitionStateAction(Function<ReviewTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
