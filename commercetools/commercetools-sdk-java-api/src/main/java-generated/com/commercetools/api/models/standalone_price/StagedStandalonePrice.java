
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Staged changes on a Standalone Price. To update the <code>value</code> property of a Staged Standalone Price, use the Change Value update action. To apply all staged changes to the Standalone Price, use the Apply Staged Changes update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedStandalonePrice stagedStandalonePrice = StagedStandalonePrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedStandalonePriceImpl.class)
public interface StagedStandalonePrice {

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     * factory method
     * @return instance of StagedStandalonePrice
     */
    public static StagedStandalonePrice of() {
        return new StagedStandalonePriceImpl();
    }

    /**
     * factory method to create a shallow copy StagedStandalonePrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedStandalonePrice of(final StagedStandalonePrice template) {
        StagedStandalonePriceImpl instance = new StagedStandalonePriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedStandalonePrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedStandalonePrice deepCopy(@Nullable final StagedStandalonePrice template) {
        if (template == null) {
            return null;
        }
        StagedStandalonePriceImpl instance = new StagedStandalonePriceImpl();
        instance.setValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        return instance;
    }

    /**
     * builder factory method for StagedStandalonePrice
     * @return builder
     */
    public static StagedStandalonePriceBuilder builder() {
        return StagedStandalonePriceBuilder.of();
    }

    /**
     * create builder for StagedStandalonePrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedStandalonePriceBuilder builder(final StagedStandalonePrice template) {
        return StagedStandalonePriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedStandalonePrice(Function<StagedStandalonePrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedStandalonePrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedStandalonePrice>() {
            @Override
            public String toString() {
                return "TypeReference<StagedStandalonePrice>";
            }
        };
    }
}
