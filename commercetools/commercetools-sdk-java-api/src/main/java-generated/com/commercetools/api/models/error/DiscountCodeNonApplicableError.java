
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
 *  <p>Returned when the Cart contains a Discount Code with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeState" rel="nofollow">DiscountCodeState</a> other than <code>MatchesCart</code> or <code>ApplicationStoppedByGroupBestDeal</code>.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts:POST" rel="nofollow">Create Cart in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddDiscountCodeAction" rel="nofollow">Add DiscountCode</a> update action on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/carts:POST" rel="nofollow">Create Cart in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartAddDiscountCodeAction" rel="nofollow">Add DiscountCode</a> update action on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts:POST" rel="nofollow">Create Cart in BusinessUnit</a> request on Associate Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddDiscountCodeAction" rel="nofollow">Add DiscountCode</a> update action on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> request on Associate Orders.</li>
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
@io.vrap.rmf.base.client.utils.json.SubType("DiscountCodeNonApplicable")
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

    public DiscountCodeNonApplicableError copyDeep();

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
