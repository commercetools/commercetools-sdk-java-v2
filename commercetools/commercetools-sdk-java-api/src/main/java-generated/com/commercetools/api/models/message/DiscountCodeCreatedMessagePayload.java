
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create DiscountCode request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeCreatedMessagePayload discountCodeCreatedMessagePayload = DiscountCodeCreatedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeCreatedMessagePayloadImpl.class)
public interface DiscountCodeCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountCodeCreatedMessagePayload
     */
    String DISCOUNT_CODE_CREATED = "DiscountCodeCreated";

    /**
     *  <p>The Discount Code that was created.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCode getDiscountCode();

    /**
     *  <p>The Discount Code that was created.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCode discountCode);

    /**
     * factory method
     * @return instance of DiscountCodeCreatedMessagePayload
     */
    public static DiscountCodeCreatedMessagePayload of() {
        return new DiscountCodeCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeCreatedMessagePayload of(final DiscountCodeCreatedMessagePayload template) {
        DiscountCodeCreatedMessagePayloadImpl instance = new DiscountCodeCreatedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeCreatedMessagePayload deepCopy(
            @Nullable final DiscountCodeCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountCodeCreatedMessagePayloadImpl instance = new DiscountCodeCreatedMessagePayloadImpl();
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCode.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeCreatedMessagePayload
     * @return builder
     */
    public static DiscountCodeCreatedMessagePayloadBuilder builder() {
        return DiscountCodeCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountCodeCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeCreatedMessagePayloadBuilder builder(final DiscountCodeCreatedMessagePayload template) {
        return DiscountCodeCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeCreatedMessagePayload(Function<DiscountCodeCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeCreatedMessagePayload>";
            }
        };
    }
}
