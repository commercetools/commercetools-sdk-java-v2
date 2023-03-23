
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionType
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionType productSelectionType = ProductSelectionType.individualExclusionBuilder()
 *             name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeImpl.class, name = IndividualExclusionProductSelectionType.INDIVIDUAL_EXCLUSION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.IndividualProductSelectionTypeImpl.class, name = IndividualProductSelectionType.INDIVIDUAL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductSelectionTypeImpl.class, visible = true)
@JsonDeserialize(as = ProductSelectionTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionType {

    /**
     *  <p>The following types of Product Selections are supported:</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductSelectionTypeEnum getType();

    public static com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeBuilder individualExclusionBuilder() {
        return com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder individualBuilder() {
        return com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder.of();
    }

    default <T> T withProductSelectionType(Function<ProductSelectionType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionType>";
            }
        };
    }
}
