
package com.commercetools.importapi.models.product_selections;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantExclusion variantExclusion = VariantExclusion.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantExclusionImpl.class)
public interface VariantExclusion {

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @return skus
     */

    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of VariantExclusion
     */
    public static VariantExclusion of() {
        return new VariantExclusionImpl();
    }

    /**
     * factory method to create a shallow copy VariantExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantExclusion of(final VariantExclusion template) {
        VariantExclusionImpl instance = new VariantExclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public VariantExclusion copyDeep();

    /**
     * factory method to create a deep copy of VariantExclusion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantExclusion deepCopy(@Nullable final VariantExclusion template) {
        if (template == null) {
            return null;
        }
        VariantExclusionImpl instance = new VariantExclusionImpl();
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantExclusion
     * @return builder
     */
    public static VariantExclusionBuilder builder() {
        return VariantExclusionBuilder.of();
    }

    /**
     * create builder for VariantExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantExclusionBuilder builder(final VariantExclusion template) {
        return VariantExclusionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantExclusion(Function<VariantExclusion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<VariantExclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<VariantExclusion>() {
            @Override
            public String toString() {
                return "TypeReference<VariantExclusion>";
            }
        };
    }
}
