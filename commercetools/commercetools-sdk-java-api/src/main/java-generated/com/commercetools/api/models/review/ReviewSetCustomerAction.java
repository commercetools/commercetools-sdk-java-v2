
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetCustomerActionImpl.class)
public interface ReviewSetCustomerAction extends ReviewUpdateAction {

    String SET_CUSTOMER = "setCustomer";

    /**
    *  <p>The customer who created the review.
    *  If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static ReviewSetCustomerAction of() {
        return new ReviewSetCustomerActionImpl();
    }

    public static ReviewSetCustomerAction of(final ReviewSetCustomerAction template) {
        ReviewSetCustomerActionImpl instance = new ReviewSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static ReviewSetCustomerActionBuilder builder() {
        return ReviewSetCustomerActionBuilder.of();
    }

    public static ReviewSetCustomerActionBuilder builder(final ReviewSetCustomerAction template) {
        return ReviewSetCustomerActionBuilder.of(template);
    }

    default <T> T withReviewSetCustomerAction(Function<ReviewSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
