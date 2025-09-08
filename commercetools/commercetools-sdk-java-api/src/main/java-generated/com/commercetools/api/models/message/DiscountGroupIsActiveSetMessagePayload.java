
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupIsActiveSetMessagePayload discountGroupIsActiveSetMessagePayload = DiscountGroupIsActiveSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupIsActiveSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupIsActiveSetMessagePayloadImpl.class)
public interface DiscountGroupIsActiveSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountGroupIsActiveSetMessagePayload
     */
    String DISCOUNT_GROUP_IS_ACTIVE_SET = "DiscountGroupIsActiveSet";

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return isActive
     */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return oldIsActive
     */

    @JsonProperty("oldIsActive")
    public Boolean getOldIsActive();

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param oldIsActive value to be set
     */

    public void setOldIsActive(final Boolean oldIsActive);

    /**
     * factory method
     * @return instance of DiscountGroupIsActiveSetMessagePayload
     */
    public static DiscountGroupIsActiveSetMessagePayload of() {
        return new DiscountGroupIsActiveSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupIsActiveSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupIsActiveSetMessagePayload of(final DiscountGroupIsActiveSetMessagePayload template) {
        DiscountGroupIsActiveSetMessagePayloadImpl instance = new DiscountGroupIsActiveSetMessagePayloadImpl();
        instance.setIsActive(template.getIsActive());
        instance.setOldIsActive(template.getOldIsActive());
        return instance;
    }

    public DiscountGroupIsActiveSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupIsActiveSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupIsActiveSetMessagePayload deepCopy(
            @Nullable final DiscountGroupIsActiveSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountGroupIsActiveSetMessagePayloadImpl instance = new DiscountGroupIsActiveSetMessagePayloadImpl();
        instance.setIsActive(template.getIsActive());
        instance.setOldIsActive(template.getOldIsActive());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupIsActiveSetMessagePayload
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessagePayloadBuilder builder() {
        return DiscountGroupIsActiveSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountGroupIsActiveSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessagePayloadBuilder builder(
            final DiscountGroupIsActiveSetMessagePayload template) {
        return DiscountGroupIsActiveSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupIsActiveSetMessagePayload(
            Function<DiscountGroupIsActiveSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupIsActiveSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupIsActiveSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupIsActiveSetMessagePayload>";
            }
        };
    }
}
