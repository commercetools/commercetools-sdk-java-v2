
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reverts the staged version of a ProductVariant to the current version.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRevertStagedVariantChangesAction productRevertStagedVariantChangesAction = ProductRevertStagedVariantChangesAction.builder()
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRevertStagedVariantChangesActionImpl.class)
public interface ProductRevertStagedVariantChangesAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRevertStagedVariantChangesAction
     */
    String REVERT_STAGED_VARIANT_CHANGES = "revertStagedVariantChanges";

    /**
     *  <p>The <code>id</code> of the ProductVariant to revert.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>id</code> of the ProductVariant to revert.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     * factory method
     * @return instance of ProductRevertStagedVariantChangesAction
     */
    public static ProductRevertStagedVariantChangesAction of() {
        return new ProductRevertStagedVariantChangesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductRevertStagedVariantChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRevertStagedVariantChangesAction of(final ProductRevertStagedVariantChangesAction template) {
        ProductRevertStagedVariantChangesActionImpl instance = new ProductRevertStagedVariantChangesActionImpl();
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRevertStagedVariantChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRevertStagedVariantChangesAction deepCopy(
            @Nullable final ProductRevertStagedVariantChangesAction template) {
        if (template == null) {
            return null;
        }
        ProductRevertStagedVariantChangesActionImpl instance = new ProductRevertStagedVariantChangesActionImpl();
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * builder factory method for ProductRevertStagedVariantChangesAction
     * @return builder
     */
    public static ProductRevertStagedVariantChangesActionBuilder builder() {
        return ProductRevertStagedVariantChangesActionBuilder.of();
    }

    /**
     * create builder for ProductRevertStagedVariantChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRevertStagedVariantChangesActionBuilder builder(
            final ProductRevertStagedVariantChangesAction template) {
        return ProductRevertStagedVariantChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRevertStagedVariantChangesAction(
            Function<ProductRevertStagedVariantChangesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedVariantChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedVariantChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertStagedVariantChangesAction>";
            }
        };
    }
}
