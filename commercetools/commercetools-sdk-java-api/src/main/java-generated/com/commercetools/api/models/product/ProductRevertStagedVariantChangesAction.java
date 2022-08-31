
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String REVERT_STAGED_VARIANT_CHANGES = "revertStagedVariantChanges";

    /**
     *  <p>The <code>id</code> of the ProductVariant to revert.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    public void setVariantId(final Long variantId);

    public static ProductRevertStagedVariantChangesAction of() {
        return new ProductRevertStagedVariantChangesActionImpl();
    }

    public static ProductRevertStagedVariantChangesAction of(final ProductRevertStagedVariantChangesAction template) {
        ProductRevertStagedVariantChangesActionImpl instance = new ProductRevertStagedVariantChangesActionImpl();
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static ProductRevertStagedVariantChangesActionBuilder builder() {
        return ProductRevertStagedVariantChangesActionBuilder.of();
    }

    public static ProductRevertStagedVariantChangesActionBuilder builder(
            final ProductRevertStagedVariantChangesAction template) {
        return ProductRevertStagedVariantChangesActionBuilder.of(template);
    }

    default <T> T withProductRevertStagedVariantChangesAction(
            Function<ProductRevertStagedVariantChangesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedVariantChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedVariantChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertStagedVariantChangesAction>";
            }
        };
    }
}
