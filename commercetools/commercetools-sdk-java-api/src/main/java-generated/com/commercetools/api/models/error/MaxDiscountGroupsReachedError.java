
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Discount Group cannot be created or activated as the <span>limit</span> for active Discount Groups has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-groups:POST" rel="nofollow">Create DiscountGroup</a> request</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxDiscountGroupsReachedError maxDiscountGroupsReachedError = MaxDiscountGroupsReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MaxDiscountGroupsReached")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MaxDiscountGroupsReachedErrorImpl.class)
public interface MaxDiscountGroupsReachedError extends ErrorObject {

    /**
     * discriminator value for MaxDiscountGroupsReachedError
     */
    String MAX_DISCOUNT_GROUPS_REACHED = "MaxDiscountGroupsReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Maximum number of active discount groups reached ($max)."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Maximum number of active discount groups reached ($max)."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MaxDiscountGroupsReachedError
     */
    public static MaxDiscountGroupsReachedError of() {
        return new MaxDiscountGroupsReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy MaxDiscountGroupsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MaxDiscountGroupsReachedError of(final MaxDiscountGroupsReachedError template) {
        MaxDiscountGroupsReachedErrorImpl instance = new MaxDiscountGroupsReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public MaxDiscountGroupsReachedError copyDeep();

    /**
     * factory method to create a deep copy of MaxDiscountGroupsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MaxDiscountGroupsReachedError deepCopy(@Nullable final MaxDiscountGroupsReachedError template) {
        if (template == null) {
            return null;
        }
        MaxDiscountGroupsReachedErrorImpl instance = new MaxDiscountGroupsReachedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for MaxDiscountGroupsReachedError
     * @return builder
     */
    public static MaxDiscountGroupsReachedErrorBuilder builder() {
        return MaxDiscountGroupsReachedErrorBuilder.of();
    }

    /**
     * create builder for MaxDiscountGroupsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxDiscountGroupsReachedErrorBuilder builder(final MaxDiscountGroupsReachedError template) {
        return MaxDiscountGroupsReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMaxDiscountGroupsReachedError(Function<MaxDiscountGroupsReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MaxDiscountGroupsReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MaxDiscountGroupsReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<MaxDiscountGroupsReachedError>";
            }
        };
    }
}
