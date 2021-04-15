
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductChangeMasterVariantActionImpl.class)
public interface ProductChangeMasterVariantAction extends ProductUpdateAction {

    String CHANGE_MASTER_VARIANT = "changeMasterVariant";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public static ProductChangeMasterVariantAction of() {
        return new ProductChangeMasterVariantActionImpl();
    }

    public static ProductChangeMasterVariantAction of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionImpl instance = new ProductChangeMasterVariantActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangeMasterVariantActionBuilder builder() {
        return ProductChangeMasterVariantActionBuilder.of();
    }

    public static ProductChangeMasterVariantActionBuilder builder(final ProductChangeMasterVariantAction template) {
        return ProductChangeMasterVariantActionBuilder.of(template);
    }

    default <T> T withProductChangeMasterVariantAction(Function<ProductChangeMasterVariantAction, T> helper) {
        return helper.apply(this);
    }
}
