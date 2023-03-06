
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the Cart contains a Discount Code with a DiscountCodeState other than <code>MatchesCart</code>.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeNonApplicableError discountCodeNonApplicableError = DiscountCodeNonApplicableError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeNonApplicableErrorImpl.class)
public interface DiscountCodeNonApplicableError extends ErrorObject {

    String DISCOUNT_CODE_NON_APPLICABLE = "DiscountCodeNonApplicable";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The discountCode $discountCodeId cannot be applied to the cart."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Discount Code passed to the Cart.</p>
     */

    @JsonProperty("discountCode")
    public String getDiscountCode();

    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Unique identifier of the Discount Code.</p>
     */

    @JsonProperty("discountCodeId")
    public String getDiscountCodeId();

    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     */

    @JsonProperty("validityCheckTime")
    public ZonedDateTime getValidityCheckTime();

    public void setMessage(final String message);

    public void setDiscountCode(final String discountCode);

    public void setReason(final String reason);

    public void setDiscountCodeId(final String discountCodeId);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setValidityCheckTime(final ZonedDateTime validityCheckTime);

    public static DiscountCodeNonApplicableError of() {
        return new DiscountCodeNonApplicableErrorImpl();
    }

    public static DiscountCodeNonApplicableError of(final DiscountCodeNonApplicableError template) {
        DiscountCodeNonApplicableErrorImpl instance = new DiscountCodeNonApplicableErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setDiscountCode(template.getDiscountCode());
        instance.setReason(template.getReason());
        instance.setDiscountCodeId(template.getDiscountCodeId());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setValidityCheckTime(template.getValidityCheckTime());
        return instance;
    }

    public static DiscountCodeNonApplicableErrorBuilder builder() {
        return DiscountCodeNonApplicableErrorBuilder.of();
    }

    public static DiscountCodeNonApplicableErrorBuilder builder(final DiscountCodeNonApplicableError template) {
        return DiscountCodeNonApplicableErrorBuilder.of(template);
    }

    default <T> T withDiscountCodeNonApplicableError(Function<DiscountCodeNonApplicableError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNonApplicableError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNonApplicableError>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeNonApplicableError>";
            }
        };
    }
}
