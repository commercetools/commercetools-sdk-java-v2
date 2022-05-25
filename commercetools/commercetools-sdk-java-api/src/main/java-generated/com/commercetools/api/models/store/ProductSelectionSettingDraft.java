
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSettingDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSettingDraft productSelectionSettingDraft = ProductSelectionSettingDraft.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSettingDraftImpl.class)
public interface ProductSelectionSettingDraft {

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    /**
     *  <p>If <code>true</code> all Products assigned to this Product Selection become part of the Store's assortment.</p>
     */

    @JsonProperty("active")
    public Boolean getActive();

    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);

    public void setActive(final Boolean active);

    public static ProductSelectionSettingDraft of() {
        return new ProductSelectionSettingDraftImpl();
    }

    public static ProductSelectionSettingDraft of(final ProductSelectionSettingDraft template) {
        ProductSelectionSettingDraftImpl instance = new ProductSelectionSettingDraftImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    public static ProductSelectionSettingDraftBuilder builder() {
        return ProductSelectionSettingDraftBuilder.of();
    }

    public static ProductSelectionSettingDraftBuilder builder(final ProductSelectionSettingDraft template) {
        return ProductSelectionSettingDraftBuilder.of(template);
    }

    default <T> T withProductSelectionSettingDraft(Function<ProductSelectionSettingDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSettingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSettingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSettingDraft>";
            }
        };
    }
}
