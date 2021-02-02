
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRevertStagedVariantChangesActionImpl.class)
public interface ProductRevertStagedVariantChangesAction extends ProductUpdateAction {

    String REVERT_STAGED_VARIANT_CHANGES = "revertStagedVariantChanges";

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
}
