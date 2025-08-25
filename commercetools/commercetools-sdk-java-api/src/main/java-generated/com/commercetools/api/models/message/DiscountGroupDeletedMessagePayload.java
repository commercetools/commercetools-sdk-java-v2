
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-groups/{id}:DELETE" rel="nofollow">Delete DiscountGroup</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupDeletedMessagePayload discountGroupDeletedMessagePayload = DiscountGroupDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupDeletedMessagePayloadImpl.class)
public interface DiscountGroupDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountGroupDeletedMessagePayload
     */
    String DISCOUNT_GROUP_DELETED = "DiscountGroupDeleted";

    /**
     * factory method
     * @return instance of DiscountGroupDeletedMessagePayload
     */
    public static DiscountGroupDeletedMessagePayload of() {
        return new DiscountGroupDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupDeletedMessagePayload of(final DiscountGroupDeletedMessagePayload template) {
        DiscountGroupDeletedMessagePayloadImpl instance = new DiscountGroupDeletedMessagePayloadImpl();
        return instance;
    }

    public DiscountGroupDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupDeletedMessagePayload deepCopy(
            @Nullable final DiscountGroupDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountGroupDeletedMessagePayloadImpl instance = new DiscountGroupDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for DiscountGroupDeletedMessagePayload
     * @return builder
     */
    public static DiscountGroupDeletedMessagePayloadBuilder builder() {
        return DiscountGroupDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountGroupDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupDeletedMessagePayloadBuilder builder(final DiscountGroupDeletedMessagePayload template) {
        return DiscountGroupDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupDeletedMessagePayload(Function<DiscountGroupDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupDeletedMessagePayload>";
            }
        };
    }
}
