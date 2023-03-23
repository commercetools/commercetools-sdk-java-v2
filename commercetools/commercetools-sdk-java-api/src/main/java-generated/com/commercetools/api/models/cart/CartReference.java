
package com.commercetools.api.models.cart;

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
 *  <p>Reference to a Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartReference cartReference = CartReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartReferenceImpl.class)
public interface CartReference extends Reference, com.commercetools.api.models.Identifiable<Cart> {

    String CART = "cart";

    /**
     *  <p>Contains the representation of the expanded Cart. Only present in responses to requests with Reference Expansion for Carts.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Cart getObj();

    /**
     *  <p>Unique identifier of the referenced Cart.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Cart obj);

    public void setId(final String id);

    public static CartReference of() {
        return new CartReferenceImpl();
    }

    public static CartReference of(final CartReference template) {
        CartReferenceImpl instance = new CartReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CartReferenceBuilder builder() {
        return CartReferenceBuilder.of();
    }

    public static CartReferenceBuilder builder(final CartReference template) {
        return CartReferenceBuilder.of(template);
    }

    default <T> T withCartReference(Function<CartReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartReference>";
            }
        };
    }
}
