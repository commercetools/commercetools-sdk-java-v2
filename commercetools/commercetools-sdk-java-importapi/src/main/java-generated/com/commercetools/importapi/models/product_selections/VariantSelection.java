
package com.commercetools.importapi.models.product_selections;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Variant selection specifying how variants are included or excluded.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSelection variantSelection = VariantSelection.builder()
 *             .type(VariantSelectionType.INCLUDE_ONLY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSelectionImpl.class)
public interface VariantSelection {

    /**
     *  <p>Type of variant selection.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public VariantSelectionType getType();

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @return skus
     */

    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>Type of variant selection.</p>
     * @param type value to be set
     */

    public void setType(final VariantSelectionType type);

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of VariantSelection
     */
    public static VariantSelection of() {
        return new VariantSelectionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSelection
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSelection of(final VariantSelection template) {
        VariantSelectionImpl instance = new VariantSelectionImpl();
        instance.setType(template.getType());
        instance.setSkus(template.getSkus());
        return instance;
    }

    public VariantSelection copyDeep();

    /**
     * factory method to create a deep copy of VariantSelection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSelection deepCopy(@Nullable final VariantSelection template) {
        if (template == null) {
            return null;
        }
        VariantSelectionImpl instance = new VariantSelectionImpl();
        instance.setType(template.getType());
        instance.setSkus(Optional.ofNullable(template.getSkus()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantSelection
     * @return builder
     */
    public static VariantSelectionBuilder builder() {
        return VariantSelectionBuilder.of();
    }

    /**
     * create builder for VariantSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSelectionBuilder builder(final VariantSelection template) {
        return VariantSelectionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSelection(Function<VariantSelection, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<VariantSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<VariantSelection>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSelection>";
            }
        };
    }
}
