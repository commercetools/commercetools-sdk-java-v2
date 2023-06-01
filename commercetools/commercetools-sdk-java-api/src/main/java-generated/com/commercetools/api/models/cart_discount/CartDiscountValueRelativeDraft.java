package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueRelativeDraftImpl.class)
public interface CartDiscountValueRelativeDraft extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueRelativeDraft> {

    /**
     * discriminator value for CartDiscountValueRelativeDraft
     */
    String RELATIVE = "relative";

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @return permyriad
     */
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     */
    
    public void setPermyriad(final Long permyriad);
    

    /**
     * factory method
     * @return instance of CartDiscountValueRelativeDraft
     */
    public static CartDiscountValueRelativeDraft of(){
        return new CartDiscountValueRelativeDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueRelativeDraft of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueRelativeDraft deepCopy(@Nullable final CartDiscountValueRelativeDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueRelativeDraft
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder builder() {
        return CartDiscountValueRelativeDraftBuilder.of();
    }
    
    /**
     * create builder for CartDiscountValueRelativeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder builder(final CartDiscountValueRelativeDraft template) {
        return CartDiscountValueRelativeDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueRelativeDraft(Function<CartDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueRelativeDraft>";
            }
        };
    }
}
