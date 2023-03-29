
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for DiscountCodeNonApplicableError
     */
    String DISCOUNT_CODE_NON_APPLICABLE = "DiscountCodeNonApplicable";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The discountCode $discountCodeId cannot be applied to the cart."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Discount Code passed to the Cart.</p>
     * @return discountCode
     */

    @JsonProperty("discountCode")
    public String getDiscountCode();

    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @return discountCodeId
     */

    @JsonProperty("discountCodeId")
    public String getDiscountCodeId();

    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @return validityCheckTime
     */

    @JsonProperty("validityCheckTime")
    public ZonedDateTime getValidityCheckTime();

    /**
     *  <p><code>"The discountCode $discountCodeId cannot be applied to the cart."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Discount Code passed to the Cart.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final String discountCode);

    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @param discountCodeId value to be set
     */

    public void setDiscountCodeId(final String discountCodeId);

    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @param validityCheckTime value to be set
     */

    public void setValidityCheckTime(final ZonedDateTime validityCheckTime);

    /**
     * factory method
     * @return instance of DiscountCodeNonApplicableError
     */
    public static DiscountCodeNonApplicableError of() {
        return new DiscountCodeNonApplicableErrorImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeNonApplicableError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeNonApplicableError of(final DiscountCodeNonApplicableError template) {
        DiscountCodeNonApplicableErrorImpl instance = new DiscountCodeNonApplicableErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDiscountCode(template.getDiscountCode());
        instance.setReason(template.getReason());
        instance.setDiscountCodeId(template.getDiscountCodeId());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setValidityCheckTime(template.getValidityCheckTime());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeNonApplicableError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeNonApplicableError deepCopy(@Nullable final DiscountCodeNonApplicableError template) {
        if (template == null) {
            return null;
        }
        DiscountCodeNonApplicableErrorImpl instance = new DiscountCodeNonApplicableErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDiscountCode(template.getDiscountCode());
        instance.setReason(template.getReason());
        instance.setDiscountCodeId(template.getDiscountCodeId());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setValidityCheckTime(template.getValidityCheckTime());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeNonApplicableError
     * @return builder
     */
    public static DiscountCodeNonApplicableErrorBuilder builder() {
        return DiscountCodeNonApplicableErrorBuilder.of();
    }

    /**
     * create builder for DiscountCodeNonApplicableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeNonApplicableErrorBuilder builder(final DiscountCodeNonApplicableError template) {
        return DiscountCodeNonApplicableErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeNonApplicableError(Function<DiscountCodeNonApplicableError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNonApplicableError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeNonApplicableError>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeNonApplicableError>";
            }
        };
    }
}
