
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetLocaleActionImpl.class)
public interface ReviewSetLocaleAction extends ReviewUpdateAction {

    String SET_LOCALE = "setLocale";

    /**
    *  <p>If <code>locale</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static ReviewSetLocaleAction of() {
        return new ReviewSetLocaleActionImpl();
    }

    public static ReviewSetLocaleAction of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static ReviewSetLocaleActionBuilder builder() {
        return ReviewSetLocaleActionBuilder.of();
    }

    public static ReviewSetLocaleActionBuilder builder(final ReviewSetLocaleAction template) {
        return ReviewSetLocaleActionBuilder.of(template);
    }

    default <T> T withReviewSetLocaleAction(Function<ReviewSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
