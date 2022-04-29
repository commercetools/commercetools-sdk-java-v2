
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

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductPriceCustomFieldAction>";
            }
        };
    }
}
