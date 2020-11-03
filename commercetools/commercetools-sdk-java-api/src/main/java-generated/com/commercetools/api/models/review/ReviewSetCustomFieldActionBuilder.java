package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.review.ReviewSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public ReviewSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public ReviewSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public ReviewSetCustomFieldAction build() {
        return new ReviewSetCustomFieldActionImpl(name, value);
    }

    public static ReviewSetCustomFieldActionBuilder of() {
        return new ReviewSetCustomFieldActionBuilder();
    }

    public static ReviewSetCustomFieldActionBuilder of(final ReviewSetCustomFieldAction template) {
        ReviewSetCustomFieldActionBuilder builder = new ReviewSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
