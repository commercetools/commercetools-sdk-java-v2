
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueRelativeDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = CartDiscountValueRelativeDraft.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueRelativeDraftImpl.class)
public interface CartDiscountValueRelativeDraft extends CartDiscountValueDraft {

    String RELATIVE = "relative";

    /**
     <*  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>>
     */
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static CartDiscountValueRelativeDraft of() {
        return new CartDiscountValueRelativeDraftImpl();
    }

    public static CartDiscountValueRelativeDraft of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static CartDiscountValueRelativeDraftBuilder builder() {
        return CartDiscountValueRelativeDraftBuilder.of();
    }

    public static CartDiscountValueRelativeDraftBuilder builder(final CartDiscountValueRelativeDraft template) {
        return CartDiscountValueRelativeDraftBuilder.of(template);
    }

    default <T> T withCartDiscountValueRelativeDraft(Function<CartDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueRelativeDraft>";
            }
        };
    }
}
