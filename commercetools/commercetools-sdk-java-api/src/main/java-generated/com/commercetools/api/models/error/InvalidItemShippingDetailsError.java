
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when Line Item or Custom Line Item quantities set under ItemShippingDetails do not match the sum of the quantities in their respective shipping details.</p>
 *  <p>The error is returned as a failed response to the Create Order from Cart and Create Order from Cart in a Store requests.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidItemShippingDetailsError invalidItemShippingDetailsError = InvalidItemShippingDetailsError.builder()
 *             .message("{message}")
 *             .subject("{subject}")
 *             .itemId("{itemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidItemShippingDetailsErrorImpl.class)
public interface InvalidItemShippingDetailsError extends ErrorObject {

    String INVALID_ITEM_SHIPPING_DETAILS = "InvalidItemShippingDetails";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Inconsistent shipping details for $subject with ID $itemId. $subject quantity is $itemQuantity and shippingTargets quantity sum is $quantitySum."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     */
    @NotNull
    @JsonProperty("subject")
    public String getSubject();

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     */
    @NotNull
    @JsonProperty("itemId")
    public String getItemId();

    public void setMessage(final String message);

    public void setSubject(final String subject);

    public void setItemId(final String itemId);

    public static InvalidItemShippingDetailsError of() {
        return new InvalidItemShippingDetailsErrorImpl();
    }

    public static InvalidItemShippingDetailsError of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    public static InvalidItemShippingDetailsErrorBuilder builder() {
        return InvalidItemShippingDetailsErrorBuilder.of();
    }

    public static InvalidItemShippingDetailsErrorBuilder builder(final InvalidItemShippingDetailsError template) {
        return InvalidItemShippingDetailsErrorBuilder.of(template);
    }

    default <T> T withInvalidItemShippingDetailsError(Function<InvalidItemShippingDetailsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidItemShippingDetailsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidItemShippingDetailsError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidItemShippingDetailsError>";
            }
        };
    }
}
