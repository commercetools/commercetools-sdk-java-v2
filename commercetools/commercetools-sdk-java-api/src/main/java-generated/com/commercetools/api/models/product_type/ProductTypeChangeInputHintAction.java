
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeInputHintActionImpl.class)
public interface ProductTypeChangeInputHintAction extends ProductTypeUpdateAction {

    String CHANGE_INPUT_HINT = "changeInputHint";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("newValue")
    public TextInputHint getNewValue();

    public void setAttributeName(final String attributeName);

    public void setNewValue(final TextInputHint newValue);

    public static ProductTypeChangeInputHintAction of() {
        return new ProductTypeChangeInputHintActionImpl();
    }

    public static ProductTypeChangeInputHintAction of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionImpl instance = new ProductTypeChangeInputHintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public static ProductTypeChangeInputHintActionBuilder builder() {
        return ProductTypeChangeInputHintActionBuilder.of();
    }

    public static ProductTypeChangeInputHintActionBuilder builder(final ProductTypeChangeInputHintAction template) {
        return ProductTypeChangeInputHintActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeInputHintAction(Function<ProductTypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeInputHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeInputHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeInputHintAction>";
            }
        };
    }
}
