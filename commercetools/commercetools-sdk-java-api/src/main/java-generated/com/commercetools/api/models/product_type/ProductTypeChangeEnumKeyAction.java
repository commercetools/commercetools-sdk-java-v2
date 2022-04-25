
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeEnumKeyActionImpl.class)
public interface ProductTypeChangeEnumKeyAction extends ProductTypeUpdateAction {

    String CHANGE_ENUM_KEY = "changeEnumKey";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("newKey")
    public String getNewKey();

    public void setAttributeName(final String attributeName);

    public void setKey(final String key);

    public void setNewKey(final String newKey);

    public static ProductTypeChangeEnumKeyAction of() {
        return new ProductTypeChangeEnumKeyActionImpl();
    }

    public static ProductTypeChangeEnumKeyAction of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKey(template.getKey());
        instance.setNewKey(template.getNewKey());
        return instance;
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder() {
        return ProductTypeChangeEnumKeyActionBuilder.of();
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder(final ProductTypeChangeEnumKeyAction template) {
        return ProductTypeChangeEnumKeyActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeEnumKeyAction(Function<ProductTypeChangeEnumKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeEnumKeyAction>";
            }
        };
    }
}
