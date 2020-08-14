package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetLocaleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetLocaleActionImpl.class)
public interface ReviewSetLocaleAction extends ReviewUpdateAction {

    /**
    *  <p>If <code>locale</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static ReviewSetLocaleActionImpl of(){
        return new ReviewSetLocaleActionImpl();
    }
    

    public static ReviewSetLocaleActionImpl of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

}
