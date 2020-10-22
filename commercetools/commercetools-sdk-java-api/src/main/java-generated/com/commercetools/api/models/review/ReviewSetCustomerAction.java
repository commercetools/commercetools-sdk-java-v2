package com.commercetools.api.models.review;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetCustomerActionImpl;

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
@JsonDeserialize(as = ReviewSetCustomerActionImpl.class)
public interface ReviewSetCustomerAction extends ReviewUpdateAction {

    /**
    *  <p>The customer who created the review.
    *  If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static ReviewSetCustomerActionImpl of(){
        return new ReviewSetCustomerActionImpl();
    }
    

    public static ReviewSetCustomerActionImpl of(final ReviewSetCustomerAction template) {
        ReviewSetCustomerActionImpl instance = new ReviewSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    default <T extends Accessor<ReviewSetCustomerAction>> T withReviewSetCustomerAction(Function<ReviewSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
