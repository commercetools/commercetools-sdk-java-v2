
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomerAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomerAction reviewSetCustomerAction = ReviewSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetCustomerActionImpl.class)
public interface ReviewSetCustomerAction extends ReviewUpdateAction {

    String SET_CUSTOMER = "setCustomer";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetCustomerAction>";
            }
        };
    }
}
