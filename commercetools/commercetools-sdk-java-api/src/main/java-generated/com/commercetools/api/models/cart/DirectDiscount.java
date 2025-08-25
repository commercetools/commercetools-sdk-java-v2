
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> that is only associated with a single Cart or Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscount directDiscount = DirectDiscount.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DirectDiscountImpl.class)
public interface DirectDiscount {

    /**
     *  <p>Unique identifier of the Direct Discount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValue getValue();

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>Unique identifier of the Direct Discount.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValue value);

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     * factory method
     * @return instance of DirectDiscount
     */
    public static DirectDiscount of() {
        return new DirectDiscountImpl();
    }

    /**
     * factory method to create a shallow copy DirectDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    public static DirectDiscount of(final DirectDiscount template) {
        DirectDiscountImpl instance = new DirectDiscountImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public DirectDiscount copyDeep();

    /**
     * factory method to create a deep copy of DirectDiscount
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DirectDiscount deepCopy(@Nullable final DirectDiscount template) {
        if (template == null) {
            return null;
        }
        DirectDiscountImpl instance = new DirectDiscountImpl();
        instance.setId(template.getId());
        instance.setValue(com.commercetools.api.models.cart_discount.CartDiscountValue.deepCopy(template.getValue()));
        instance.setTarget(
            com.commercetools.api.models.cart_discount.CartDiscountTarget.deepCopy(template.getTarget()));
        return instance;
    }

    /**
     * builder factory method for DirectDiscount
     * @return builder
     */
    public static DirectDiscountBuilder builder() {
        return DirectDiscountBuilder.of();
    }

    /**
     * create builder for DirectDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountBuilder builder(final DirectDiscount template) {
        return DirectDiscountBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDirectDiscount(Function<DirectDiscount, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DirectDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DirectDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<DirectDiscount>";
            }
        };
    }
}
