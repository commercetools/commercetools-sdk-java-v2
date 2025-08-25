
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-codes/{id}:DELETE" rel="nofollow">Delete DiscountCode</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDeletedMessagePayload discountCodeDeletedMessagePayload = DiscountCodeDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountCodeDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeDeletedMessagePayloadImpl.class)
public interface DiscountCodeDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountCodeDeletedMessagePayload
     */
    String DISCOUNT_CODE_DELETED = "DiscountCodeDeleted";

    /**
     * factory method
     * @return instance of DiscountCodeDeletedMessagePayload
     */
    public static DiscountCodeDeletedMessagePayload of() {
        return new DiscountCodeDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeDeletedMessagePayload of(final DiscountCodeDeletedMessagePayload template) {
        DiscountCodeDeletedMessagePayloadImpl instance = new DiscountCodeDeletedMessagePayloadImpl();
        return instance;
    }

    public DiscountCodeDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeDeletedMessagePayload deepCopy(
            @Nullable final DiscountCodeDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountCodeDeletedMessagePayloadImpl instance = new DiscountCodeDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for DiscountCodeDeletedMessagePayload
     * @return builder
     */
    public static DiscountCodeDeletedMessagePayloadBuilder builder() {
        return DiscountCodeDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountCodeDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeDeletedMessagePayloadBuilder builder(final DiscountCodeDeletedMessagePayload template) {
        return DiscountCodeDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeDeletedMessagePayload(Function<DiscountCodeDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeDeletedMessagePayload>";
            }
        };
    }
}
