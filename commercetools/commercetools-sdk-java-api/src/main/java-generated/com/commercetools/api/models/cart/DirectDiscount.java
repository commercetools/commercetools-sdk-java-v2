
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DirectDiscount
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
     *  <p>The unique ID of the cart discount.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValue getValue();

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    public void setId(final String id);

    public void setValue(final CartDiscountValue value);

    public void setTarget(final CartDiscountTarget target);

    public static DirectDiscount of() {
        return new DirectDiscountImpl();
    }

    public static DirectDiscount of(final DirectDiscount template) {
        DirectDiscountImpl instance = new DirectDiscountImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static DirectDiscountBuilder builder() {
        return DirectDiscountBuilder.of();
    }

    public static DirectDiscountBuilder builder(final DirectDiscount template) {
        return DirectDiscountBuilder.of(template);
    }

    default <T> T withDirectDiscount(Function<DirectDiscount, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DirectDiscount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DirectDiscount>() {
            @Override
            public String toString() {
                return "TypeReference<DirectDiscount>";
            }
        };
    }
}
