
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Cart. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartResourceIdentifier cartResourceIdentifier = CartResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartResourceIdentifierImpl.class)
public interface CartResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Cart> {

    /**
     * discriminator value for CartResourceIdentifier
     */
    String CART = "cart";

    /**
     *  <p>Unique identifier of the referenced Cart. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Cart. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Cart. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Cart. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CartResourceIdentifier
     */
    public static CartResourceIdentifier of() {
        return new CartResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy CartResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartResourceIdentifier of(final CartResourceIdentifier template) {
        CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public CartResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of CartResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartResourceIdentifier deepCopy(@Nullable final CartResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartResourceIdentifier
     * @return builder
     */
    public static CartResourceIdentifierBuilder builder() {
        return CartResourceIdentifierBuilder.of();
    }

    /**
     * create builder for CartResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartResourceIdentifierBuilder builder(final CartResourceIdentifier template) {
        return CartResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartResourceIdentifier(Function<CartResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CartResourceIdentifier>";
            }
        };
    }
}
