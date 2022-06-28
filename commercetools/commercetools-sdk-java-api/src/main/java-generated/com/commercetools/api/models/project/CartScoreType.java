
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by integers (such as shipping scores or weight ranges).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartScoreType cartScoreType = CartScoreType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartScoreTypeImpl.class)
public interface CartScoreType extends ShippingRateInputType {

    String CART_SCORE = "CartScore";

    public static CartScoreType of() {
        return new CartScoreTypeImpl();
    }

    public static CartScoreType of(final CartScoreType template) {
        CartScoreTypeImpl instance = new CartScoreTypeImpl();
        return instance;
    }

    public static CartScoreTypeBuilder builder() {
        return CartScoreTypeBuilder.of();
    }

    public static CartScoreTypeBuilder builder(final CartScoreType template) {
        return CartScoreTypeBuilder.of(template);
    }

    default <T> T withCartScoreType(Function<CartScoreType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartScoreType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartScoreType>() {
            @Override
            public String toString() {
                return "TypeReference<CartScoreType>";
            }
        };
    }
}
