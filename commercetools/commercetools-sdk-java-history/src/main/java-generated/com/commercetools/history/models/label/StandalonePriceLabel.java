
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StandalonePriceLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceLabel standalonePriceLabel = StandalonePriceLabel.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceLabelImpl.class)
public interface StandalonePriceLabel extends Label {

    /**
     * discriminator value for StandalonePriceLabel
     */
    String STANDALONE_PRICE_LABEL = "StandalonePriceLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Standalone Price.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique Product SKU variant identifier to which the Standalone Price is associated.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier of the Standalone Price.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique Product SKU variant identifier to which the Standalone Price is associated.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * factory method
     * @return instance of StandalonePriceLabel
     */
    public static StandalonePriceLabel of() {
        return new StandalonePriceLabelImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceLabel of(final StandalonePriceLabel template) {
        StandalonePriceLabelImpl instance = new StandalonePriceLabelImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        return instance;
    }

    public StandalonePriceLabel copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceLabel deepCopy(@Nullable final StandalonePriceLabel template) {
        if (template == null) {
            return null;
        }
        StandalonePriceLabelImpl instance = new StandalonePriceLabelImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceLabel
     * @return builder
     */
    public static StandalonePriceLabelBuilder builder() {
        return StandalonePriceLabelBuilder.of();
    }

    /**
     * create builder for StandalonePriceLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceLabelBuilder builder(final StandalonePriceLabel template) {
        return StandalonePriceLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceLabel(Function<StandalonePriceLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceLabel>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceLabel>";
            }
        };
    }
}
