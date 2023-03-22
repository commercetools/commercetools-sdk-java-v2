
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Staged changes on a Standalone Price. To update the <code>value</code> property of a Staged Standalone Price, use the corresponding update action. To apply all staged changes to the Standalone Price, use the <code>applyStagedChanges</code> update action.</p>
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

    public void setValue(final TypedMoney value);

    public void setDiscounted(final DiscountedPrice discounted);

    public static StagedStandalonePrice of() {
        return new StagedStandalonePriceImpl();
    }

    public static StagedStandalonePrice of(final StagedStandalonePrice template) {
        StagedStandalonePriceImpl instance = new StagedStandalonePriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static StagedStandalonePriceBuilder builder() {
        return StagedStandalonePriceBuilder.of();
    }

    public static StagedStandalonePriceBuilder builder(final StagedStandalonePrice template) {
        return StagedStandalonePriceBuilder.of(template);
    }

    default <T> T withStagedStandalonePrice(Function<StagedStandalonePrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedStandalonePrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedStandalonePrice>() {
            @Override
            public String toString() {
                return "TypeReference<StagedStandalonePrice>";
            }
        };
    }
}
