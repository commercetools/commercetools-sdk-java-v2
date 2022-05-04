
package com.commercetools.api.models.product;

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
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Product">Product</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference, com.commercetools.api.models.Identifiable<Product> {

    String PRODUCT = "product";

    /**
    *  <p>Contains the representation of the expanded Product. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for Products.</p>
    */
    @Valid
    @JsonProperty("obj")
    public Product getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Product">Product</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Product obj);

    public void setId(final String id);

    public static ProductReference of() {
        return new ProductReferenceImpl();
    }

    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ProductReferenceBuilder builder() {
        return ProductReferenceBuilder.of();
    }

    public static ProductReferenceBuilder builder(final ProductReference template) {
        return ProductReferenceBuilder.of(template);
    }

    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductReference>";
            }
        };
    }
}
