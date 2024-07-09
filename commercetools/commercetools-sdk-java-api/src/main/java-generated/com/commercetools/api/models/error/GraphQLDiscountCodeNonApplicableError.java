
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Cart contains a Discount Code with a DiscountCodeState other than <code>MatchesCart</code>.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Cart and Create Cart in Store requests and Add DiscountCode update action on Carts.</li>
 *   <li>Create Cart and Create Cart in Store requests and Add DiscountCode update action on My Carts.</li>
 *   <li>Create Cart in BusinessUnit request on Associate Carts.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *   <li>Add DiscountCode update action on Order Edits.</li>
 *   <li>Create Order from Cart in BusinessUnit request on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDiscountCodeNonApplicableError graphQLDiscountCodeNonApplicableError = GraphQLDiscountCodeNonApplicableError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDiscountCodeNonApplicableErrorImpl.class)
public interface GraphQLDiscountCodeNonApplicableError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDiscountCodeNonApplicableError
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
     * @return instance of GraphQLDiscountCodeNonApplicableError
     */
    public static GraphQLDiscountCodeNonApplicableError of() {
        return new GraphQLDiscountCodeNonApplicableErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDiscountCodeNonApplicableError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDiscountCodeNonApplicableError of(final GraphQLDiscountCodeNonApplicableError template) {
        GraphQLDiscountCodeNonApplicableErrorImpl instance = new GraphQLDiscountCodeNonApplicableErrorImpl();
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
     * factory method to create a deep copy of GraphQLDiscountCodeNonApplicableError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDiscountCodeNonApplicableError deepCopy(
            @Nullable final GraphQLDiscountCodeNonApplicableError template) {
        if (template == null) {
            return null;
        }
        GraphQLDiscountCodeNonApplicableErrorImpl instance = new GraphQLDiscountCodeNonApplicableErrorImpl();
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
     * builder factory method for GraphQLDiscountCodeNonApplicableError
     * @return builder
     */
    public static GraphQLDiscountCodeNonApplicableErrorBuilder builder() {
        return GraphQLDiscountCodeNonApplicableErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDiscountCodeNonApplicableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDiscountCodeNonApplicableErrorBuilder builder(
            final GraphQLDiscountCodeNonApplicableError template) {
        return GraphQLDiscountCodeNonApplicableErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDiscountCodeNonApplicableError(Function<GraphQLDiscountCodeNonApplicableError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDiscountCodeNonApplicableError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDiscountCodeNonApplicableError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDiscountCodeNonApplicableError>";
            }
        };
    }
}
