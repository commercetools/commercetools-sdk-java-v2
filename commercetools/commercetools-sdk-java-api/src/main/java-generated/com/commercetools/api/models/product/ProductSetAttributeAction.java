
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAttributeActionImpl.class)
public interface ProductSetAttributeAction extends ProductUpdateAction {

    String SET_ATTRIBUTE = "setAttribute";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed.
    *  If the attribute exists and a value is provided, the new value is applied.
    *  If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setName(final String name);

    public void setValue(final Object value);

    public void setStaged(final Boolean staged);

    public static ProductSetAttributeAction of() {
        return new ProductSetAttributeActionImpl();
    }

    public static ProductSetAttributeAction of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionImpl instance = new ProductSetAttributeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetAttributeActionBuilder builder() {
        return ProductSetAttributeActionBuilder.of();
    }

    public static ProductSetAttributeActionBuilder builder(final ProductSetAttributeAction template) {
        return ProductSetAttributeActionBuilder.of(template);
    }

    default <T> T withProductSetAttributeAction(Function<ProductSetAttributeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAttributeAction>";
            }
        };
    }
}
