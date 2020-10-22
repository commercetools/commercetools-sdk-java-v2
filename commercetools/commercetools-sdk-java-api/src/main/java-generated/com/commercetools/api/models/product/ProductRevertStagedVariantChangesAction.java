package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductRevertStagedVariantChangesActionImpl.class)
public interface ProductRevertStagedVariantChangesAction extends ProductUpdateAction {

    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    public void setVariantId(final Long variantId);

    public static ProductRevertStagedVariantChangesActionImpl of(){
        return new ProductRevertStagedVariantChangesActionImpl();
    }
    

    public static ProductRevertStagedVariantChangesActionImpl of(final ProductRevertStagedVariantChangesAction template) {
        ProductRevertStagedVariantChangesActionImpl instance = new ProductRevertStagedVariantChangesActionImpl();
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    default <T extends Accessor<ProductRevertStagedVariantChangesAction>> T withProductRevertStagedVariantChangesAction(Function<ProductRevertStagedVariantChangesAction, T> helper) {
        return helper.apply(this);
    }
}
