
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetProductPriceCustomFieldActionImpl.class)
public interface ProductSetProductPriceCustomFieldAction extends ProductUpdateAction {

    String SET_PRODUCT_PRICE_CUSTOM_FIELD = "setProductPriceCustomField";

    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    @JsonProperty("staged")
    public Boolean getStaged();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setPriceId(final String priceId);

    public void setStaged(final Boolean staged);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ProductSetProductPriceCustomFieldAction of() {
        return new ProductSetProductPriceCustomFieldActionImpl();
    }

    public static ProductSetProductPriceCustomFieldAction of(final ProductSetProductPriceCustomFieldAction template) {
        ProductSetProductPriceCustomFieldActionImpl instance = new ProductSetProductPriceCustomFieldActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ProductSetProductPriceCustomFieldActionBuilder builder() {
        return ProductSetProductPriceCustomFieldActionBuilder.of();
    }

    public static ProductSetProductPriceCustomFieldActionBuilder builder(
            final ProductSetProductPriceCustomFieldAction template) {
        return ProductSetProductPriceCustomFieldActionBuilder.of(template);
    }

    default <T> T withProductSetProductPriceCustomFieldAction(
            Function<ProductSetProductPriceCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
