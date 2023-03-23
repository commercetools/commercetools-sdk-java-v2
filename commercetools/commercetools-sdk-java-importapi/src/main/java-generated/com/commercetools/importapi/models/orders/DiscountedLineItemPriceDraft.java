
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPriceDraft discountedLineItemPriceDraft = DiscountedLineItemPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceDraftImpl.class)
public interface DiscountedLineItemPriceDraft extends io.vrap.rmf.base.client.Draft<DiscountedLineItemPriceDraft> {

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *
     * @return includedDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final Money value);

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPriceDraft of() {
        return new DiscountedLineItemPriceDraftImpl();
    }

    public static DiscountedLineItemPriceDraft of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    public static DiscountedLineItemPriceDraftBuilder builder() {
        return DiscountedLineItemPriceDraftBuilder.of();
    }

    public static DiscountedLineItemPriceDraftBuilder builder(final DiscountedLineItemPriceDraft template) {
        return DiscountedLineItemPriceDraftBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPriceDraft(Function<DiscountedLineItemPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPriceDraft>";
            }
        };
    }
}
