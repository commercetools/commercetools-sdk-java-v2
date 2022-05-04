
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:ProductType">ProductType</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference, com.commercetools.api.models.Identifiable<ProductType> {

    String PRODUCT_TYPE = "product-type";

    /**
    *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for ProductTypes.</p>
    */
    @Valid
    @JsonProperty("obj")
    public ProductType getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:ProductType">ProductType</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final ProductType obj);

    public void setId(final String id);

    public static ProductTypeReference of() {
        return new ProductTypeReferenceImpl();
    }

    public static ProductTypeReference of(final ProductTypeReference template) {
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ProductTypeReferenceBuilder builder() {
        return ProductTypeReferenceBuilder.of();
    }

    public static ProductTypeReferenceBuilder builder(final ProductTypeReference template) {
        return ProductTypeReferenceBuilder.of(template);
    }

    default <T> T withProductTypeReference(Function<ProductTypeReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeReference>";
            }
        };
    }
}
