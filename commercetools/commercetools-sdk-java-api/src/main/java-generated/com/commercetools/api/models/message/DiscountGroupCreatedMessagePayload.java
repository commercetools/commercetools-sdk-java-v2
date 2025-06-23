
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_group.DiscountGroup;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create DiscountGroup request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupCreatedMessagePayload discountGroupCreatedMessagePayload = DiscountGroupCreatedMessagePayload.builder()
 *             .discountGroup(discountGroupBuilder -> discountGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupCreatedMessagePayloadImpl.class)
public interface DiscountGroupCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountGroupCreatedMessagePayload
     */
    String DISCOUNT_GROUP_CREATED = "DiscountGroupCreated";

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @return discountGroup
     */
    @NotNull
    @Valid
    @JsonProperty("discountGroup")
    public DiscountGroup getDiscountGroup();

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @param discountGroup value to be set
     */

    public void setDiscountGroup(final DiscountGroup discountGroup);

    /**
     * factory method
     * @return instance of DiscountGroupCreatedMessagePayload
     */
    public static DiscountGroupCreatedMessagePayload of() {
        return new DiscountGroupCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupCreatedMessagePayload of(final DiscountGroupCreatedMessagePayload template) {
        DiscountGroupCreatedMessagePayloadImpl instance = new DiscountGroupCreatedMessagePayloadImpl();
        instance.setDiscountGroup(template.getDiscountGroup());
        return instance;
    }

    public DiscountGroupCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupCreatedMessagePayload deepCopy(
            @Nullable final DiscountGroupCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountGroupCreatedMessagePayloadImpl instance = new DiscountGroupCreatedMessagePayloadImpl();
        instance.setDiscountGroup(
            com.commercetools.api.models.discount_group.DiscountGroup.deepCopy(template.getDiscountGroup()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupCreatedMessagePayload
     * @return builder
     */
    public static DiscountGroupCreatedMessagePayloadBuilder builder() {
        return DiscountGroupCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountGroupCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupCreatedMessagePayloadBuilder builder(final DiscountGroupCreatedMessagePayload template) {
        return DiscountGroupCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupCreatedMessagePayload(Function<DiscountGroupCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupCreatedMessagePayload>";
            }
        };
    }
}
