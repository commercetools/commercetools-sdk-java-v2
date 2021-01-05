package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.review.ReviewSetCustomFieldActionImpl;

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
@JsonDeserialize(as = ReviewSetCustomFieldActionImpl.class)
public interface ReviewSetCustomFieldAction extends ReviewUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static ReviewSetCustomFieldAction of(){
        return new ReviewSetCustomFieldActionImpl();
    }
    

    public static ReviewSetCustomFieldAction of(final ReviewSetCustomFieldAction template) {
        ReviewSetCustomFieldActionImpl instance = new ReviewSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReviewSetCustomFieldActionBuilder builder(){
        return ReviewSetCustomFieldActionBuilder.of();
    }
    
    public static ReviewSetCustomFieldActionBuilder builder(final ReviewSetCustomFieldAction template){
        return ReviewSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withReviewSetCustomFieldAction(Function<ReviewSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
