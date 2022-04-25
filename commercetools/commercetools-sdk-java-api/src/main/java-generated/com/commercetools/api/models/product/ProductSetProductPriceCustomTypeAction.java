
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetProductPriceCustomTypeActionImpl.class)
public interface ProductSetProductPriceCustomTypeAction extends ProductUpdateAction {

    String SET_PRODUCT_PRICE_CUSTOM_TYPE = "setProductPriceCustomType";

    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Price with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Price.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Price.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setPriceId(final String priceId);

    public void setStaged(final Boolean staged);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ProductSetProductPriceCustomTypeAction of() {
        return new ProductSetProductPriceCustomTypeActionImpl();
    }

    public static ProductSetProductPriceCustomTypeAction of(final ProductSetProductPriceCustomTypeAction template) {
        ProductSetProductPriceCustomTypeActionImpl instance = new ProductSetProductPriceCustomTypeActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ProductSetProductPriceCustomTypeActionBuilder builder() {
        return ProductSetProductPriceCustomTypeActionBuilder.of();
    }

    public static ProductSetProductPriceCustomTypeActionBuilder builder(
            final ProductSetProductPriceCustomTypeAction template) {
        return ProductSetProductPriceCustomTypeActionBuilder.of(template);
    }

    default <T> T withProductSetProductPriceCustomTypeAction(
            Function<ProductSetProductPriceCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductPriceCustomTypeAction>";
            }
        };
    }
}
