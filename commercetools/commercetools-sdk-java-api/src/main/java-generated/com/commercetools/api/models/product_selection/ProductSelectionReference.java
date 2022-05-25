
package com.commercetools.api.models.product_selection;

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
 *  <p>Reference to a ProductSelection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionReference productSelectionReference = ProductSelectionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionReferenceImpl.class)
public interface ProductSelectionReference
        extends Reference, com.commercetools.api.models.Identifiable<ProductSelection> {

    String PRODUCT_SELECTION = "product-selection";

    /**
     *  <p>Unique identifier of the referenced ProductSelection.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>
     */
    @Valid
    @JsonProperty("obj")
    public ProductSelection getObj();

    public void setId(final String id);

    public void setObj(final ProductSelection obj);

    public static ProductSelectionReference of() {
        return new ProductSelectionReferenceImpl();
    }

    public static ProductSelectionReference of(final ProductSelectionReference template) {
        ProductSelectionReferenceImpl instance = new ProductSelectionReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ProductSelectionReferenceBuilder builder() {
        return ProductSelectionReferenceBuilder.of();
    }

    public static ProductSelectionReferenceBuilder builder(final ProductSelectionReference template) {
        return ProductSelectionReferenceBuilder.of(template);
    }

    default <T> T withProductSelectionReference(Function<ProductSelectionReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionReference>";
            }
        };
    }
}
