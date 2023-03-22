
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a CartDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountReference cartDiscountReference = CartDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountReferenceImpl.class)
public interface CartDiscountReference extends Reference, com.commercetools.api.models.Identifiable<CartDiscount> {

    String CART_DISCOUNT = "cart-discount";

    /**
     *  <p>Contains the representation of the expanded CartDiscount. Only present in responses to requests with Reference Expansion for CartDiscounts.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public CartDiscount getObj();

    /**
     *  <p>Unique identifier of the referenced CartDiscount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final CartDiscount obj);

    public void setId(final String id);

    public static CartDiscountReference of() {
        return new CartDiscountReferenceImpl();
    }

    public static CartDiscountReference of(final CartDiscountReference template) {
        CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CartDiscountReferenceBuilder builder() {
        return CartDiscountReferenceBuilder.of();
    }

    public static CartDiscountReferenceBuilder builder(final CartDiscountReference template) {
        return CartDiscountReferenceBuilder.of(template);
    }

    default <T> T withCartDiscountReference(Function<CartDiscountReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountReference>";
            }
        };
    }
}
